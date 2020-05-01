package com.haitang.project.system.mgt.controller;

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
import com.haitang.project.system.mgt.domain.CustomerMgt;
import com.haitang.project.system.mgt.service.ICustomerMgtService;
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
@RequestMapping("/system/mgt")
public class CustomerMgtController extends BaseController
{
    private String prefix = "system/mgt";

    @Autowired
    private ICustomerMgtService customerMgtService;

    @RequiresPermissions("system:mgt:view")
    @GetMapping()
    public String mgt()
    {
        return prefix + "/mgt";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:mgt:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerMgt customerMgt)
    {
        startPage();
        List<CustomerMgt> list = customerMgtService.selectCustomerMgtList(customerMgt);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:mgt:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerMgt customerMgt)
    {
        List<CustomerMgt> list = customerMgtService.selectCustomerMgtList(customerMgt);
        ExcelUtil<CustomerMgt> util = new ExcelUtil<CustomerMgt>(CustomerMgt.class);
        return util.exportExcel(list, "mgt");
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
    @RequiresPermissions("system:mgt:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerMgt customerMgt)
    {
        return toAjax(customerMgtService.insertCustomerMgt(customerMgt));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CustomerMgt customerMgt = customerMgtService.selectCustomerMgtById(id);
        mmap.put("customerMgt", customerMgt);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:mgt:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerMgt customerMgt)
    {
        return toAjax(customerMgtService.updateCustomerMgt(customerMgt));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:mgt:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerMgtService.deleteCustomerMgtByIds(ids));
    }
}
