package com.haitang.project.system.clientBaseinfo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.haitang.project.system.baseinfo.domain.SoundPatientBaseinfo;
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
import com.haitang.project.system.clientBaseinfo.domain.ClientBaseinfo;
import com.haitang.project.system.clientBaseinfo.service.IClientBaseinfoService;
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
@RequestMapping("/system/clientBaseinfo")
public class ClientBaseinfoController extends BaseController
{
    private String prefix = "system/clientBaseinfo";

    @Autowired
    private IClientBaseinfoService clientBaseinfoService;

    @GetMapping()
    public String baseinfo()
    {
        return prefix + "/clientBaseinfo";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ClientBaseinfo clientBaseinfo)
    {
        startPage();
        List<ClientBaseinfo> list = clientBaseinfoService.selectClientBaseinfoList(clientBaseinfo);
        return getDataTable(list);
    }


    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/getList")
    @ResponseBody
    public Map<String,Object> getList(ClientBaseinfo clientBaseinfo)
    {
        startPage();
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        List<ClientBaseinfo> list = clientBaseinfoService.selectClientBaseinfoList(clientBaseinfo);
        map.put("data",list);
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ClientBaseinfo clientBaseinfo)
    {
        List<ClientBaseinfo> list = clientBaseinfoService.selectClientBaseinfoList(clientBaseinfo);
        ExcelUtil<ClientBaseinfo> util = new ExcelUtil<ClientBaseinfo>(ClientBaseinfo.class);
        return util.exportExcel(list, "clientBaseinfo");
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
    public AjaxResult addSave(ClientBaseinfo clientBaseinfo)
    {
        return toAjax(clientBaseinfoService.insertClientBaseinfo(clientBaseinfo));
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/addSaveClient")
    @ResponseBody
    public Map<String, Object> addSaveClient(ClientBaseinfo clientBaseinfo)
    {
        clientBaseinfoService.insertClientBaseinfo(clientBaseinfo);
        Map<String,Object> map = new HashMap<String,Object>();
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
        ClientBaseinfo clientBaseinfo = clientBaseinfoService.selectClientBaseinfoById(id);
        mmap.put("clientBaseinfo", clientBaseinfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ClientBaseinfo clientBaseinfo)
    {
        return toAjax(clientBaseinfoService.updateClientBaseinfo(clientBaseinfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(clientBaseinfoService.deleteClientBaseinfoByIds(ids));
    }
}
