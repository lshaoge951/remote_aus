package com.haitang.project.system.conf.controller;

import java.util.List;

import com.haitang.project.system.conf.domain.DeviceLoginConf;
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
import com.haitang.project.system.conf.service.IDeviceLoginConfService;
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
@RequestMapping("/system/conf")
public class DeviceLoginConfController extends BaseController
{
    private String prefix = "system/conf";

    @Autowired
    private IDeviceLoginConfService deviceLoginConfService;

    @GetMapping()
    public String conf()
    {
        return prefix + "/conf";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceLoginConf deviceLoginConf)
    {
        startPage();
        List<DeviceLoginConf> list = deviceLoginConfService.selectDeviceLoginConfList(deviceLoginConf);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceLoginConf deviceLoginConf)
    {
        List<DeviceLoginConf> list = deviceLoginConfService.selectDeviceLoginConfList(deviceLoginConf);
        ExcelUtil<DeviceLoginConf> util = new ExcelUtil<DeviceLoginConf>(DeviceLoginConf.class);
        return util.exportExcel(list, "conf");
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
    public AjaxResult addSave(DeviceLoginConf deviceLoginConf)
    {
        return toAjax(deviceLoginConfService.insertDeviceLoginConf(deviceLoginConf));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DeviceLoginConf deviceLoginConf = deviceLoginConfService.selectDeviceLoginConfById(id);
        mmap.put("deviceLoginConf", deviceLoginConf);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceLoginConf deviceLoginConf)
    {
        return toAjax(deviceLoginConfService.updateDeviceLoginConf(deviceLoginConf));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceLoginConfService.deleteDeviceLoginConfByIds(ids));
    }
}
