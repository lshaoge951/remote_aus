package com.haitang.project.system.soundPatientBody.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.haitang.project.system.record.domain.SoundRecord;
import io.swagger.annotations.ApiOperation;
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
import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundPatientBody.service.ISoundPatientBodyService;
import com.haitang.framework.web.controller.BaseController;
import com.haitang.framework.web.domain.AjaxResult;
import com.haitang.common.utils.poi.ExcelUtil;
import com.haitang.framework.web.page.TableDataInfo;

/**
 * 身体部位录音Controller
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Controller
@RequestMapping("/system/soundPatientBody")
public class SoundPatientBodyController extends BaseController
{
    private String prefix = "system/soundPatientBody";

    @Autowired
    private ISoundPatientBodyService soundPatientBodyService;

    @GetMapping()
    public String soundPatientBody()
    {
        return prefix + "/soundPatientBody";
    }

    /**
     * 查询身体部位录音列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SoundPatientBody soundPatientBody)
    {
        startPage();
        List<SoundPatientBody> list = soundPatientBodyService.selectSoundPatientBodyList(soundPatientBody);
        return getDataTable(list);
    }

    /**
     * 导出身体部位录音列表
     */
    @Log(title = "身体部位录音", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SoundPatientBody soundPatientBody)
    {
        List<SoundPatientBody> list = soundPatientBodyService.selectSoundPatientBodyList(soundPatientBody);
        ExcelUtil<SoundPatientBody> util = new ExcelUtil<SoundPatientBody>(SoundPatientBody.class);
        return util.exportExcel(list, "soundPatientBody");
    }




    @PostMapping("/getList")
    @ResponseBody
    public Map<String,Object> getList(SoundPatientBody soundPatientBody)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","200");
        map.put("msg","操作成功");
        List<SoundPatientBody> list = soundPatientBodyService.selectSoundPatientBodyList(soundPatientBody);
        map.put("data",list);
        return map;
    }




    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/editOne")
    @ResponseBody
    public Map<String, Object> editOne(SoundPatientBody soundPatientBody)
    {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","200");
        map.put("msg","操作成功");
        soundPatientBodyService.updateSoundPatientBody(soundPatientBody);
        return map;
    }
    /**
     * 新增身体部位录音
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存身体部位录音
     */
    @Log(title = "身体部位录音", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SoundPatientBody soundPatientBody)
    {
        return toAjax(soundPatientBodyService.insertSoundPatientBody(soundPatientBody));
    }

    /**
     * 修改身体部位录音
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SoundPatientBody soundPatientBody = soundPatientBodyService.selectSoundPatientBodyById(id);
        mmap.put("soundPatientBody", soundPatientBody);
        return prefix + "/edit";
    }

    /**
     * 修改保存身体部位录音
     */
    @Log(title = "身体部位录音", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SoundPatientBody soundPatientBody)
    {
        return toAjax(soundPatientBodyService.updateSoundPatientBody(soundPatientBody));
    }

    /**
     * 删除身体部位录音
     */
    @Log(title = "身体部位录音", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(soundPatientBodyService.deleteSoundPatientBodyByIds(ids));
    }

}
