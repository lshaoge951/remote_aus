package com.haitang.project.system.detail.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.haitang.project.monitor.server.domain.SoundDetailVo;
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
import com.haitang.project.system.detail.domain.SoundPatientDetail;
import com.haitang.project.system.detail.service.ISoundPatientDetailService;
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
@RequestMapping("/system/detail")
public class SoundPatientDetailController extends BaseController
{
    private String prefix = "system/detail";

    @Autowired
    private ISoundPatientDetailService soundPatientDetailService;

    @GetMapping()
    public String detail()
    {
        return prefix + "/detail";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SoundPatientDetail soundPatientDetail)
    {
        startPage();
        List<SoundPatientDetail> list = soundPatientDetailService.selectSoundPatientDetailList(soundPatientDetail);
        return getDataTable(list);
    }
    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/detailList")
    @ResponseBody
    public List<SoundDetailVo> detailList(SoundPatientDetail soundPatientDetail)
    {
        startPage();
        List<SoundDetailVo> list = new ArrayList<>();
        return list;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/detail")
    @ResponseBody
    public SoundDetailVo detail(String recordId)
    {
        startPage();
        SoundDetailVo detailVo = new SoundDetailVo();
        return detailVo;
    }

    /**
     *
     */
    @PostMapping("/addDetail")
    @ResponseBody
    public Map<String,Object> addDetail(SoundPatientDetail detail)
    {
        SoundDetailVo detailVo = new SoundDetailVo();
        int i = soundPatientDetailService.insertSoundPatientDetail(detail);
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("id",i);
        map.put("msg","操作成功");
        return map;
    }

    /**
     *
     */
    @PostMapping("/getDetail")
    @ResponseBody
    public Map<String,Object> getDetail(String uid,String token)
    {
        SoundDetailVo detailVo = new SoundDetailVo();
        SoundPatientDetail soundPatientDetail = soundPatientDetailService.selectSoundPatientDetailUById(uid);
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("data",soundPatientDetail);
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SoundPatientDetail soundPatientDetail)
    {
        List<SoundPatientDetail> list = soundPatientDetailService.selectSoundPatientDetailList(soundPatientDetail);
        ExcelUtil<SoundPatientDetail> util = new ExcelUtil<SoundPatientDetail>(SoundPatientDetail.class);
        return util.exportExcel(list, "detail");
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
    public AjaxResult addSave(SoundPatientDetail soundPatientDetail)
    {
        return toAjax(soundPatientDetailService.insertSoundPatientDetail(soundPatientDetail));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SoundPatientDetail soundPatientDetail = soundPatientDetailService.selectSoundPatientDetailById(id);
        mmap.put("soundPatientDetail", soundPatientDetail);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SoundPatientDetail soundPatientDetail)
    {
        return toAjax(soundPatientDetailService.updateSoundPatientDetail(soundPatientDetail));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(soundPatientDetailService.deleteSoundPatientDetailByIds(ids));
    }
}
