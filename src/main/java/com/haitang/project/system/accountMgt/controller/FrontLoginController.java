package com.haitang.project.system.accountMgt.controller;

import com.haitang.common.utils.poi.ExcelUtil;
import com.haitang.framework.aspectj.lang.annotation.Log;
import com.haitang.framework.aspectj.lang.enums.BusinessType;
import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.accountMgt.domain.Permission;
import com.haitang.project.system.accountMgt.service.IAccountMgtService;
import com.haitang.project.system.accountPermission.domain.AccountPermission;
import com.haitang.project.system.accountPermission.service.IAccountPermissionService;
import com.haitang.project.system.clientBaseinfo.domain.ClientBaseinfo;
import com.haitang.project.system.clientBaseinfo.service.IClientBaseinfoService;
import com.haitang.project.system.record.domain.SoundRecord;
import com.haitang.project.system.record.service.ISoundRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Api("前台用户操作")
@Controller
@RequestMapping("/app/accountMgt")
public class FrontLoginController {
    @Autowired
    private ISoundRecordService soundRecordService;
    @Autowired
    private IAccountMgtService accountMgtService;
    @Autowired
    private IClientBaseinfoService clientBaseinfoService;
    @Autowired
    private IAccountPermissionService accountPermissionService;

    @ApiOperation("前台用户登录")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/login")
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, String account, String password, String Imei)
    {
        Map<String,Object> map = new HashMap<>();
        AccountMgt accountMgt = new AccountMgt();
        accountMgt.setAccount(account);
        //accountMgt.setAccount(account);

        //List<AccountMgt> accountMgts = accountMgtService.selectAccountMgtList(accountMgt);

        List<AccountMgt> accountMgts = accountMgtService.selectAccountMgtList(accountMgt);
        if (accountMgts.size() == 0){
            map.put("code","200");
            map.put("msg","无此用户");
            return map;
        }
        for (AccountMgt accountMgt1: accountMgts) {
            if (account.equals(accountMgt1.getAccount())){
                if (!password.equals(accountMgt1.getPassword())){
                    map.put("code","200");
                    map.put("msg","密码错误");
                    return map;
                }
                if (null != accountMgt1.getIsFixed() && accountMgt1.getIsFixed() == 1){
                    String clientList = accountMgt1.getClientList();
                    String[] strArray = clientList.split(",");
                    boolean contains = Arrays.asList(strArray).contains(Imei);
                    if (contains == false){
                        map.put("code","200");
                        map.put("msg","密码错误");
                        return map;
                    }

                }
                accountMgt = accountMgt1;
            }
        }
        //ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);

        map.put("code","200");
        map.put("msg","登录成功");
        HttpSession session = request.getSession();
        String token = UUID.randomUUID().toString();
        session.setAttribute(token,accountMgt);
        accountMgt.setToken(token);
        accountMgtService.updateAccountMgt(accountMgt);
        map.put("data", accountMgt.getId());
        return map;
    }
    @ApiOperation("前台用户注销")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/logout")
    @ResponseBody
    public Map<String,String> logout(HttpServletRequest request,String token)
    {
        HttpSession session = request.getSession();
        session.removeAttribute(token);
        ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","注销成功");
        //map.put("token","ldkfjasdoghojflksdjfiosdjfla000349812");
        return map;
    }

    @ApiOperation("移动设备备案")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/saveClientInform")
    @ResponseBody
    public Map<String,String> saveClientInform(String  manufacturer,String product,
                                               String brand,String model,String board,
                                               String deviceSerial,String deviceSdk,
                                               String androidVersion,String defaultLanguage)
    {
        ClientBaseinfo clientBaseinfo = new ClientBaseinfo();
        clientBaseinfo.setManufacturer(manufacturer);
        clientBaseinfo.setProduct(product);
        clientBaseinfo.setBrand(brand);
        clientBaseinfo.setModel(model);
        clientBaseinfo.setBoard(board);
        clientBaseinfo.setDeviceSerial(deviceSerial);
        clientBaseinfo.setAndroidVersion(androidVersion);
        clientBaseinfo.setDeviceSdk(deviceSdk);
        clientBaseinfo.setDefaultLanguage(defaultLanguage);
        clientBaseinfo.setClientId(UUID.randomUUID().toString());
        clientBaseinfoService.insertClientBaseinfo(clientBaseinfo);

        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","提交成功");
        return map;
    }

    @ApiOperation("显示权限")
    @Log(title = "【显示权限】", businessType = BusinessType.EXPORT)
    @PostMapping("/getFrontShow")
    @ResponseBody
    public Map<String,Object> getFrontShow(HttpServletRequest request,String token)
    {
        Map<String,Object> map = new HashMap<>();
        HttpSession session = request.getSession();
        AccountMgt accountMgt = (AccountMgt)session.getAttribute(token);
        //ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
       if (null == accountMgt){
           map.put("code","200");
           map.put("msg"," 登录过期");
       }
       AccountPermission accountPermission = new AccountPermission();
       accountPermission.setAccount(accountMgt.getAccount());
        List<AccountPermission> accountPermissions = accountPermissionService.selectAccountPermissionList(accountPermission);

        Map<String,Object> data = new HashMap<>();
        if (null != accountPermissions && accountPermissions.size() > 0){
            AccountPermission accountPermission1 = accountPermissions.get(0);
            data.put("configure",accountPermission1.getConfigure());
            data.put("teaching",accountPermission1.getTeaching());
            data.put("recording",accountPermission1.getRecording());
            data.put("faraway",accountPermission1.getFaraway());
            data.put("database",accountPermission1.getDatabase());
            data.put("test",accountPermission1.getTeaching());
        }else {
            data.put("configure","1");
            data.put("teaching","1");
            data.put("recording","1");
            data.put("faraway","1");
            data.put("database","1");
            data.put("test","1");
        }

        map.put("code","200");
        map.put("data",data);
        map.put("msg","操作成功");

        return map;
    }

}
