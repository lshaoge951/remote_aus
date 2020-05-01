package com.haitang.project.system.deviceMgt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.conf.domain.DeviceLoginConf;
import com.haitang.project.system.deviceMgt.domain.DeviceMgt;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.haitang.framework.aspectj.lang.annotation.Log;
import com.haitang.framework.aspectj.lang.enums.BusinessType;
import com.haitang.project.system.deviceMgt.service.IDeviceMgtService;
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
@RequestMapping("/system/deviceMgt")
public class DeviceMgtController extends BaseController
{
    private String prefix = "system/deviceMgt";

    @Autowired
    private IDeviceMgtService deviceMgtService;

    @GetMapping()
    public String mgt()
    {
        return prefix + "/deviceMgt";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(@RequestBody DeviceMgt deviceMgt)
    {
        startPage();
        List<DeviceMgt> list = deviceMgtService.selectDeviceMgtList(deviceMgt);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceMgt deviceMgt)
    {
        List<DeviceMgt> list = deviceMgtService.selectDeviceMgtList(deviceMgt);
        ExcelUtil<DeviceMgt> util = new ExcelUtil<DeviceMgt>(DeviceMgt.class);
        return util.exportExcel(list, "deviceMgt");
    }


    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/login")
    @ResponseBody
    public Map<String,String> deviceConnect(@RequestBody DeviceLoginConf deviceLoginConf)
    {
        ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","连接成功");
        return map;
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
    public AjaxResult addSave(DeviceMgt deviceMgt)
    {

        return toAjax(deviceMgtService.insertDeviceMgt(deviceMgt));
    }




    /**
     * 新增保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/addSaveMgt")
    @ResponseBody
    public Map<String, Object> addSaveMgt(DeviceMgt deviceMgt)
    {
        Map<String,Object> map = new HashMap<String,Object>();
        deviceMgtService.insertDeviceMgt(deviceMgt);
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DeviceMgt deviceMgt = deviceMgtService.selectDeviceMgtById(id);
        mmap.put("deviceMgt", deviceMgt);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceMgt deviceMgt)
    {
        return toAjax(deviceMgtService.updateDeviceMgt(deviceMgt));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceMgtService.deleteDeviceMgtByIds(ids));
    }
}
