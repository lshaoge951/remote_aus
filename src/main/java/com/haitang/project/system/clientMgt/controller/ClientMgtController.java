package com.haitang.project.system.clientMgt.controller;

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
import com.haitang.project.system.clientMgt.domain.ClientMgt;
import com.haitang.project.system.clientMgt.service.IClientMgtService;
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
@RequestMapping("/system/clientMgt")
public class ClientMgtController extends BaseController
{
    private String prefix = "system/clientMgt";

    @Autowired
    private IClientMgtService clientMgtService;

    @GetMapping()
    public String mgt()
    {
        return prefix + "/clientMgt";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ClientMgt clientMgt)
    {
        startPage();
        List<ClientMgt> list = clientMgtService.selectClientMgtList(clientMgt);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ClientMgt clientMgt)
    {
        List<ClientMgt> list = clientMgtService.selectClientMgtList(clientMgt);
        ExcelUtil<ClientMgt> util = new ExcelUtil<ClientMgt>(ClientMgt.class);
        return util.exportExcel(list, "clientMgt");
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
    public AjaxResult addSave(ClientMgt clientMgt)
    {
        return toAjax(clientMgtService.insertClientMgt(clientMgt));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ClientMgt clientMgt = clientMgtService.selectClientMgtById(id);
        mmap.put("clientMgt", clientMgt);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ClientMgt clientMgt)
    {
        return toAjax(clientMgtService.updateClientMgt(clientMgt));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(clientMgtService.deleteClientMgtByIds(ids));
    }
}
