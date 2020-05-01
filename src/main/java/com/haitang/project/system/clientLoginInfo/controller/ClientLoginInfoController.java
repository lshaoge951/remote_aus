package com.haitang.project.system.clientLoginInfo.controller;

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
import com.haitang.project.system.clientLoginInfo.domain.ClientLoginInfo;
import com.haitang.project.system.clientLoginInfo.service.IClientLoginInfoService;
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
@RequestMapping("/system/clientLoginInfo")
public class ClientLoginInfoController extends BaseController
{
    private String prefix = "system/clientLoginInfo";

    @Autowired
    private IClientLoginInfoService clientLoginInfoService;

    @GetMapping()
    public String info()
    {
        return prefix + "/clientLoginInfo";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ClientLoginInfo clientLoginInfo)
    {
        startPage();
        List<ClientLoginInfo> list = clientLoginInfoService.selectClientLoginInfoList(clientLoginInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ClientLoginInfo clientLoginInfo)
    {
        List<ClientLoginInfo> list = clientLoginInfoService.selectClientLoginInfoList(clientLoginInfo);
        ExcelUtil<ClientLoginInfo> util = new ExcelUtil<ClientLoginInfo>(ClientLoginInfo.class);
        return util.exportExcel(list, "clientLoginInfo");
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
    public AjaxResult addSave(ClientLoginInfo clientLoginInfo)
    {
        return toAjax(clientLoginInfoService.insertClientLoginInfo(clientLoginInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ClientLoginInfo clientLoginInfo = clientLoginInfoService.selectClientLoginInfoById(id);
        mmap.put("clientLoginInfo", clientLoginInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ClientLoginInfo clientLoginInfo)
    {
        return toAjax(clientLoginInfoService.updateClientLoginInfo(clientLoginInfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(clientLoginInfoService.deleteClientLoginInfoByIds(ids));
    }
}
