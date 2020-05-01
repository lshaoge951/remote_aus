package com.haitang.project.system.connRecord.controller;

import java.util.List;

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
import com.haitang.project.system.connRecord.domain.LocalConnRecord;
import com.haitang.project.system.connRecord.service.ILocalConnRecordService;
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
@RequestMapping("/system/data/connRecode")
public class LocalConnRecordController extends BaseController
{
    private String prefix = "system/connRecode";

    @Autowired
    private ILocalConnRecordService localConnRecordService;

    @GetMapping()
    public String record()
    {
        return prefix + "/connRecode";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ApiOperation("连接记录列表")
    @ResponseBody
    public TableDataInfo list(LocalConnRecord localConnRecord)
    {
        startPage();
        List<LocalConnRecord> list = localConnRecordService.selectLocalConnRecordList(localConnRecord);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocalConnRecord localConnRecord)
    {
        List<LocalConnRecord> list = localConnRecordService.selectLocalConnRecordList(localConnRecord);
        ExcelUtil<LocalConnRecord> util = new ExcelUtil<LocalConnRecord>(LocalConnRecord.class);
        return util.exportExcel(list, "connRecode");
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
    public AjaxResult addSave(LocalConnRecord localConnRecord)
    {
        return toAjax(localConnRecordService.insertLocalConnRecord(localConnRecord));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LocalConnRecord localConnRecord = localConnRecordService.selectLocalConnRecordById(id);
        mmap.put("localConnRecord", localConnRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocalConnRecord localConnRecord)
    {
        return toAjax(localConnRecordService.updateLocalConnRecord(localConnRecord));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(localConnRecordService.deleteLocalConnRecordByIds(ids));
    }
}
