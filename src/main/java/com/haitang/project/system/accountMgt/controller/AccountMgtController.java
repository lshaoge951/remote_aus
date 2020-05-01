package com.haitang.project.system.accountMgt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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
import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.accountMgt.service.IAccountMgtService;
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
@RequestMapping("/system/accountMgt")
public class AccountMgtController extends BaseController
{
    private String prefix = "system/accountMgt";

    @Autowired
    private IAccountMgtService accountMgtService;

    @GetMapping()
    public String mgt()
    {
        return prefix + "/accountMgt";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AccountMgt accountMgt)
    {
        startPage();
        List<AccountMgt> list = accountMgtService.selectAccountMgtList(accountMgt);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AccountMgt accountMgt)
    {
        List<AccountMgt> list = accountMgtService.selectAccountMgtList(accountMgt);
        ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
        return util.exportExcel(list, "mgt");
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/login")
    @ResponseBody
    public Map<String,String> login(String account,String password,String customId,String clientId)
    {
        ExcelUtil<AccountMgt> util = new ExcelUtil<AccountMgt>(AccountMgt.class);
        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","登录成功");
        map.put("token","ldkfjasdoghojflksdjfiosdjfla000349812");
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
     * 新增保存
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AccountMgt accountMgt)
    {

        return toAjax(accountMgtService.insertAccountMgt(accountMgt));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        AccountMgt accountMgt = accountMgtService.selectAccountMgtById(id);
        mmap.put("accountMgt", accountMgt);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AccountMgt accountMgt)
    {
        return toAjax(accountMgtService.updateAccountMgt(accountMgt));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(accountMgtService.deleteAccountMgtByIds(ids));
    }
}
