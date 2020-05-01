package com.haitang.project.system.baseinfo.controller;

import java.util.*;

import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.accountMgt.service.IAccountMgtService;
import com.haitang.project.system.clientBaseinfo.service.IClientBaseinfoService;
import com.haitang.project.system.fileLog.domain.FileLog;
import com.haitang.project.system.fileLog.service.IFileLogService;
import com.haitang.project.system.record.domain.SoundRecord;
import com.haitang.project.system.record.service.ISoundRecordService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authc.Account;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.haitang.framework.aspectj.lang.annotation.Log;
import com.haitang.framework.aspectj.lang.enums.BusinessType;
import com.haitang.project.system.baseinfo.domain.SoundPatientBaseinfo;
import com.haitang.project.system.baseinfo.service.ISoundPatientBaseinfoService;
import com.haitang.framework.web.controller.BaseController;
import com.haitang.framework.web.domain.AjaxResult;
import com.haitang.common.utils.poi.ExcelUtil;
import com.haitang.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Controller
@RequestMapping("/system/baseinfo")
public class SoundPatientBaseinfoController extends BaseController
{
    private String prefix = "system/baseinfo";

    @Autowired
    private ISoundPatientBaseinfoService soundPatientBaseinfoService;
    @Autowired
    private ISoundRecordService soundRecordService;
    @Autowired
    private IAccountMgtService accountMgtService;
    @Autowired
    private IFileLogService fileLogService;
    @Autowired
    private IClientBaseinfoService clientBaseinfoService;

    @GetMapping()
    public String baseinfo()
    {
        return prefix + "/baseinfo";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
        return getDataTable(list);
    }

    /**
     *
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/getList")
    @ResponseBody
    public Map<String,Object> getList(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
        map.put("data",list);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/shareBasicInfo")
    @ResponseBody
    public Map<String,Object> shareBasicInfo(String uid,String accountId,String toAccountId)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        soundPatientBaseinfoService.addShare(toAccountId,uid);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/deleteShareBasicInfo")
    @ResponseBody
    public Map<String,Object> deleteShareBasicInfo(String uid,String accountId)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        soundPatientBaseinfoService.deleteShare(accountId,uid);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/deleteBasicInfo")
    @ResponseBody
    public Map<String,Object> deleteBasicInfo(String uid,String token)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        soundPatientBaseinfoService.deleteLogic(uid);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/getShare")
    @ResponseBody
    public Map<String,Object> getShare(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoShare(soundPatientBaseinfo);
        map.put("data",list);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询所有同期用户
     */
    @PostMapping("/getAccountByDept")
    @ResponseBody
    public Map<String,Object> getAccountByDept(String accountId)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();

        // List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoShare(soundPatientBaseinfo);
        AccountMgt accountMgt = new AccountMgt();
        List<AccountMgt> list = accountMgtService.selectAccountMgtList(accountMgt);
        map.put("data",list);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询所有用户
     */
    @PostMapping("/getAccountAll")
    @ResponseBody
    public Map<String,Object> getAccountAll()
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();

        // List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoShare(soundPatientBaseinfo);
        AccountMgt accountMgt = new AccountMgt();
        List<AccountMgt> list = accountMgtService.selectAccountMgtList(accountMgt);
        map.put("data",list);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/getShareToMe")
    @ResponseBody
    public Map<String,Object> getShareToMe(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoShareToMe(soundPatientBaseinfo);
        map.put("data",list);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询【shujj】列表
     */
    @PostMapping("/getSoundAndFile")
    @ResponseBody
    public Map<String,Object> getSoundAndFile(String uid,String token)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> data = new HashMap<String,Object>();
        SoundPatientBaseinfo soundPatientBaseinfo = new SoundPatientBaseinfo();
        soundPatientBaseinfo.setUid(uid);
        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
        if (list.size() != 0){
            SoundPatientBaseinfo soundPatientBaseinfo1 = list.get(0);
            SoundRecord soundRecord = new SoundRecord();
            soundRecord.setBasicInfoId(soundPatientBaseinfo1.getId());
            List<SoundRecord> soundRecords = soundRecordService.selectSoundRecordList(soundRecord);
            data.put("soundRecords",soundRecords);
            List<FileLog> fileLogs = new ArrayList<>();
            for (SoundRecord soundRecord1:soundRecords) {
                soundRecord1.getId();
                FileLog fileLog = fileLogService.selectSoundPatientBodyByIdMain(soundRecord1.getFileId());
                fileLogs.add(fileLog);
            }
            data.put("fileLogs",fileLogs);
        }
        map.put("data",data);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/getShareFromDept")
    @ResponseBody
    public Map<String,Object> getShareFromDept(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
        map.put("data",list);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }



    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
        ExcelUtil<SoundPatientBaseinfo> util = new ExcelUtil<SoundPatientBaseinfo>(SoundPatientBaseinfo.class);
        return util.exportExcel(list, "baseinfo");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public Map<String, Object> addSave(SoundPatientBaseinfo soundPatientBaseinfo)
    {

        String recordId = UUID.randomUUID().toString();
        soundPatientBaseinfo.setRecordId(recordId);
        return toAjax(soundPatientBaseinfoService.insertSoundPatientBaseinfo(soundPatientBaseinfo));
    }

    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/addSaveInfo")
    @ResponseBody
    public Map<String, Object> addSaveInfo(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        String recordId = UUID.randomUUID().toString();
        soundPatientBaseinfo.setRecordId(recordId);
        soundPatientBaseinfoService.insertSoundPatientBaseinfo(soundPatientBaseinfo);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("recordId",recordId);
        map.put("msg","操作成功");
        return map;
    }

    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/editSaveInfo")
    @ResponseBody
    public Map<String, Object> editSaveInfo(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        soundPatientBaseinfoService.updateSoundPatientBaseinfo(soundPatientBaseinfo);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("recordId",soundPatientBaseinfo.getRecordId());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SoundPatientBaseinfo soundPatientBaseinfo = soundPatientBaseinfoService.selectSoundPatientBaseinfoById(id);
        mmap.put("soundPatientBaseinfo", soundPatientBaseinfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        return toAjax(soundPatientBaseinfoService.updateSoundPatientBaseinfo(soundPatientBaseinfo));
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/editOne")
    @ResponseBody
    public Map<String,Object> editOne(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        Map<String,Object> map = new HashMap<String,Object>();
        //List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
        //map.put("data",list);
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(soundPatientBaseinfoService.deleteSoundPatientBaseinfoByIds(ids));
    }
}
