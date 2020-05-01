package com.haitang.project.system.record.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.haitang.project.system.record.domain.SoundRecord;
import com.haitang.project.system.record.service.ISoundRecordService;
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
@RequestMapping("/system/record")
public class SoundRecordController extends BaseController
{
    private String prefix = "system/record";

    @Autowired
    private ISoundRecordService soundRecordService;

    @RequiresPermissions("system:record:view")
    @GetMapping()
    public String record()
    {
        return prefix + "/record";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:record:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SoundRecord soundRecord)
    {
        startPage();
        List<SoundRecord> list = soundRecordService.selectSoundRecordList(soundRecord);
        return getDataTable(list);
    }

    @PostMapping("/getList")
    @ResponseBody
    public Map<String,Object> getList(SoundRecord soundRecord)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        List<SoundRecord> list = soundRecordService.selectSoundRecordList(soundRecord);
        map.put("data",list);
        return map;
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:record:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SoundRecord soundRecord)
    {
        List<SoundRecord> list = soundRecordService.selectSoundRecordList(soundRecord);
        ExcelUtil<SoundRecord> util = new ExcelUtil<SoundRecord>(SoundRecord.class);
        return util.exportExcel(list, "record");
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
    @RequiresPermissions("system:record:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SoundRecord soundRecord)
    {
        return toAjax(soundRecordService.insertSoundRecord(soundRecord));
    }


    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/addRecordSave")
    @ResponseBody
    public Map<String,Object> addRecordSave(SoundRecord soundRecord)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        soundRecordService.insertSoundRecord(soundRecord);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SoundRecord soundRecord = soundRecordService.selectSoundRecordById(id);
        mmap.put("soundRecord", soundRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:record:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SoundRecord soundRecord)
    {
        return toAjax(soundRecordService.updateSoundRecord(soundRecord));
    }

    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/editRecordSave")
    @ResponseBody
    public Map<String, Object> editRecordSave(SoundRecord soundRecord)
    {
        Map<String,Object> map = new HashMap<String,Object>();
        soundRecordService.updateSoundRecord(soundRecord);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");

        return map;
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:record:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(soundRecordService.deleteSoundRecordByIds(ids));
    }
}
