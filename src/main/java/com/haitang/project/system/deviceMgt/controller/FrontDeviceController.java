package com.haitang.project.system.deviceMgt.controller;

import com.haitang.common.utils.StringUtils;
import com.haitang.common.utils.poi.ExcelUtil;
import com.haitang.framework.aspectj.lang.annotation.Log;
import com.haitang.framework.aspectj.lang.enums.BusinessType;
import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.conf.domain.DeviceLoginConf;
import com.haitang.project.system.conf.service.IDeviceLoginConfService;
import com.haitang.project.system.deviceMgt.domain.BatchConfig;
import com.haitang.project.system.deviceMgt.domain.DeviceMgt;
import com.haitang.project.system.deviceMgt.service.IDeviceMgtService;
import com.mchange.util.StringObjectMap;
import com.sun.net.httpserver.HttpExchange;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Api("听诊配置/听诊教学")
@Controller
@RequestMapping("/app/deviceMgt")
public class FrontDeviceController {

    @Autowired
    private IDeviceMgtService deviceMgtService;
    @Autowired
    private IDeviceLoginConfService deviceLoginConfService;

    /**
     * 查询【请填写功能名称】列表
     */
    @ApiOperation("听诊器连接查询")
    @PostMapping("/search")
    @ResponseBody
    public Map<String,Object> search(HttpServletRequest request,String token,Long accountId, String clientId)

    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        DeviceMgt deviceMgt = new DeviceMgt();
        DeviceLoginConf deviceLoginConf = new DeviceLoginConf();
        deviceLoginConf.setClientId(clientId);
        deviceLoginConf.setAccountId(accountId);
        List<DeviceLoginConf> list = deviceLoginConfService.selectDeviceLoginConfList(deviceLoginConf);
        map.put("code","200");
        map.put("msg","操作成功");
        map.put("data",list);
        return map;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @ApiOperation("听诊器连接查询")
    @PostMapping("/searchDetail")
    @ResponseBody
    public Map<String,Object> searchDetail(HttpServletRequest request,String token, String deviceId)

    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        HttpSession session = request.getSession();
        AccountMgt accountMgt = (AccountMgt)session.getAttribute(token);
        //ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
        if (null == accountMgt){
            map.put("code","200");
            map.put("msg"," 登录超时");
            return map;
        }
        DeviceMgt deviceMgt = new DeviceMgt();
        DeviceMgt result = new DeviceMgt();
        List<DeviceMgt> list = deviceMgtService.selectDeviceMgtList(deviceMgt);
        for (DeviceMgt device:list) {
            String deviceNo = device.getDeviceId();
            if (deviceNo.length() >= 4){
                String pwd = deviceNo.substring(deviceNo.length() - 4);
                if (pwd.equals(deviceId)){
                    result = device;
                }
            }

            System.out.println(result);
        }
        map.put("code","200");
        map.put("msg","操作成功");
        map.put("data",result);
        return map;
    }


    @ApiOperation("听诊器连接")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/deviceConnect")
    @ResponseBody
    public Map<String,String> deviceConnect( HttpServletRequest request,DeviceLoginConf deviceLoginConf)
    {
        ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
        Map<String,String> map = new HashMap<>();


        List<DeviceLoginConf> deviceLoginConfs = deviceLoginConfService.selectDeviceLoginConfList(deviceLoginConf);
        if (deviceLoginConfs.size() > 0){
            deviceLoginConfService.updateDeviceLoginConf(deviceLoginConf);
        }else{
            deviceLoginConfService.insertDeviceLoginConf(deviceLoginConf);
        }

        map.put("code","200");
        map.put("msg","状态已更改");
        return map;
    }







    @ApiOperation("听诊器连接")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/deviceConnectBatch")
    @ResponseBody
    public Map<String,String> deviceConnectBatch(HttpServletRequest request, @RequestBody BatchConfig batch)
    {
        ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
        String token = batch.getToken();
        List<DeviceLoginConf> deviceLoginConfs = batch.getDeviceLoginConfs();
        String s = "";
        HttpSession session = request.getSession();
        Map<String,String> map = new HashMap<>();
        for (DeviceLoginConf deviceLoginConf:deviceLoginConfs) {
            List<DeviceLoginConf> deviceLoginConfss = deviceLoginConfService.selectDeviceLoginConfList(deviceLoginConf);
            if (deviceLoginConfss.size() > 0){
                deviceLoginConf.setOwner(s);
                deviceLoginConfService.updateDeviceLoginConf(deviceLoginConf);
            }else{
                if (StringUtils.isNotEmpty(s)){
                    deviceLoginConf.setOwner(s);
                }
                deviceLoginConfService.insertDeviceLoginConf(deviceLoginConf);
            }
        }
        map.put("code","200");
        map.put("msg","状态已更改");
        return map;
    }




    public static String createToken(
            String appId, String appKey, String channelId, String userId,
            String nonce, Long timestamp
    ) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(appId.getBytes());
        digest.update(appKey.getBytes());
        digest.update(channelId.getBytes());
        digest.update(userId.getBytes());
        digest.update(nonce.getBytes());
        digest.update(Long.toString(timestamp).getBytes());

        String token = DatatypeConverter.printHexBinary(digest.digest()).toLowerCase();
        return token;
    }

    public static String createUserID(String channelID, String user) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(channelID.getBytes());
        digest.update("/".getBytes());
        digest.update(user.getBytes());

        String uid = DatatypeConverter.printHexBinary(digest.digest()).toLowerCase();
        return uid.substring(0, 16);
    }

    public static String createChannelId(){

        String s = randomNum1();

        return s;
    }
    private void httpWrite(HttpExchange he, int code, String response) throws IOException {
        OutputStream os = he.getResponseBody();
        he.sendResponseHeaders(code, response.length());
        os.write(response.getBytes());
        os.close();
    }
    public static String creatNonce() {
        int first = new Random(10).nextInt(8) + 1;
        System.out.println(first);
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return "AK-" + first + String.format("%015d", hashCodeV);
    }

    /**
     * 获取IM信息发送方
     */
    @Log(title = "获取IM信息", businessType = BusinessType.DELETE)
    @PostMapping( "/getImAppMsgCreat")
    @ResponseBody
    public Map<String,Object> getImAppMsgCreat(String account)
    {
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> data = new HashMap<>();
        try{
            Date date = new Date();
            // 注意format的格式要与日期String的格式相匹配
            String appId = "6iwpa8dl";
            String AppKey = "1cecceb7fb5770315985615a776d826d";
            String gslb = "https://rgslb.rtc.aliyuncs.com";
            String channelId = createChannelId();
            String userId = createUserID(channelId,account);
            String nonce = creatNonce();
            String token = createToken(appId,AppKey,channelId,userId,nonce,date.getTime());
            data.put("appId",appId);
            data.put("AppKey",AppKey);
            data.put("gslb",gslb);
            data.put("channelId",channelId);
            data.put("userId",userId);
            data.put("nonce",nonce);
            data.put("token",token);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = new Date();
            String t = df.format(d);
            long epoch = 0;
            try {
                epoch = df.parse(t).getTime() / 1000;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            data.put("timeStamp",epoch);
            map.put("code","200");
            map.put("msg","操作成功");
            map.put("data",data);
        }catch(Exception e){
            map.put("code","500");
            map.put("msg","操作失败");
        }



        return map;
    }
    public static String characters = "0123456789";
    public static String randomNum1(){//int factor
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // nextInt(10) = [0, 10)
            sb.append(characters.charAt(random.nextInt(10)));
            if (i == 2 || i ==6){
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
