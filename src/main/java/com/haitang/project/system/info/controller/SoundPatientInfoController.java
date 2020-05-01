package com.haitang.project.system.info.controller;

import java.util.List;
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
import com.haitang.project.system.info.domain.SoundPatientInfo;
import com.haitang.project.system.info.service.ISoundPatientInfoService;
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
@RequestMapping("/system/info")
public class SoundPatientInfoController extends BaseController
{
    private String prefix = "system/info";

    @Autowired
    private ISoundPatientInfoService soundPatientInfoService;

    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SoundPatientInfo soundPatientInfo)
    {
        startPage();
        List<SoundPatientInfo> list = soundPatientInfoService.selectSoundPatientInfoList(soundPatientInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SoundPatientInfo soundPatientInfo)
    {
        List<SoundPatientInfo> list = soundPatientInfoService.selectSoundPatientInfoList(soundPatientInfo);
        ExcelUtil<SoundPatientInfo> util = new ExcelUtil<SoundPatientInfo>(SoundPatientInfo.class);
        return util.exportExcel(list, "info");
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
    public AjaxResult addSave(SoundPatientInfo soundPatientInfo)
    {
        return toAjax(soundPatientInfoService.insertSoundPatientInfo(soundPatientInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SoundPatientInfo soundPatientInfo = soundPatientInfoService.selectSoundPatientInfoById(id);
        mmap.put("soundPatientInfo", soundPatientInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SoundPatientInfo soundPatientInfo)
    {
        return toAjax(soundPatientInfoService.updateSoundPatientInfo(soundPatientInfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(soundPatientInfoService.deleteSoundPatientInfoByIds(ids));
    }
}
