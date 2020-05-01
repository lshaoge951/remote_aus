package com.haitang.project.system.accountPermission.controller;

import java.util.List;
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
import com.haitang.project.system.accountPermission.domain.AccountPermission;
import com.haitang.project.system.accountPermission.service.IAccountPermissionService;
import com.haitang.framework.web.controller.BaseController;
import com.haitang.framework.web.domain.AjaxResult;
import com.haitang.common.utils.poi.ExcelUtil;
import com.haitang.framework.web.page.TableDataInfo;

/**
 * 权限管理Controller
 * 
 * @author hch
 * @date 2020-05-01
 */
@Controller
@RequestMapping("/system/accountPermission")
public class AccountPermissionController extends BaseController
{
    private String prefix = "system/accountPermission";

    @Autowired
    private IAccountPermissionService accountPermissionService;

    @GetMapping()
    public String accountPermission()
    {
        return prefix + "/accountPermission";
    }

    /**
     * 查询权限管理列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AccountPermission accountPermission)
    {
        startPage();
        List<AccountPermission> list = accountPermissionService.selectAccountPermissionList(accountPermission);
        return getDataTable(list);
    }

    /**
     * 导出权限管理列表
     */
    @Log(title = "权限管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AccountPermission accountPermission)
    {
        List<AccountPermission> list = accountPermissionService.selectAccountPermissionList(accountPermission);
        ExcelUtil<AccountPermission> util = new ExcelUtil<AccountPermission>(AccountPermission.class);
        return util.exportExcel(list, "accountPermission");
    }

    /**
     * 新增权限管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存权限管理
     */
    @Log(title = "权限管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AccountPermission accountPermission)
    {
        return toAjax(accountPermissionService.insertAccountPermission(accountPermission));
    }

    /**
     * 修改权限管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        AccountPermission accountPermission = accountPermissionService.selectAccountPermissionById(id);
        mmap.put("accountPermission", accountPermission);
        return prefix + "/edit";
    }

    /**
     * 修改保存权限管理
     */
    @Log(title = "权限管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AccountPermission accountPermission)
    {
        return toAjax(accountPermissionService.updateAccountPermission(accountPermission));
    }

    /**
     * 删除权限管理
     */
    @Log(title = "权限管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(accountPermissionService.deleteAccountPermissionByIds(ids));
    }
}
