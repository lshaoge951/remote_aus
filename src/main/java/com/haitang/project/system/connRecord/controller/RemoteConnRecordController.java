package com.haitang.project.system.connRecord.controller;

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
import com.haitang.project.system.connRecord.domain.RemoteConnRecord;
import com.haitang.project.system.connRecord.service.IRemoteConnRecordService;
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
@RequestMapping("/system/connRecode")
public class RemoteConnRecordController extends BaseController
{
    private String prefix = "system/connRecode";

    @Autowired
    private IRemoteConnRecordService remoteConnRecordService;

    @RequiresPermissions("system:connRecode:view")
    @GetMapping()
    public String record()
    {
        return prefix + "/connRecode";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:connRecode:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RemoteConnRecord remoteConnRecord)
    {
        startPage();
        List<RemoteConnRecord> list = remoteConnRecordService.selectRemoteConnRecordList(remoteConnRecord);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:connRecode:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RemoteConnRecord remoteConnRecord)
    {
        List<RemoteConnRecord> list = remoteConnRecordService.selectRemoteConnRecordList(remoteConnRecord);
        ExcelUtil<RemoteConnRecord> util = new ExcelUtil<RemoteConnRecord>(RemoteConnRecord.class);
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
    @RequiresPermissions("system:connRecode:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RemoteConnRecord remoteConnRecord)
    {
        return toAjax(remoteConnRecordService.insertRemoteConnRecord(remoteConnRecord));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RemoteConnRecord remoteConnRecord = remoteConnRecordService.selectRemoteConnRecordById(id);
        mmap.put("remoteConnRecord", remoteConnRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:connRecode:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RemoteConnRecord remoteConnRecord)
    {
        return toAjax(remoteConnRecordService.updateRemoteConnRecord(remoteConnRecord));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:connRecode:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(remoteConnRecordService.deleteRemoteConnRecordByIds(ids));
    }
}
