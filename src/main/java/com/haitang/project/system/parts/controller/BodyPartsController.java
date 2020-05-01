package com.haitang.project.system.parts.controller;

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
import com.haitang.project.system.parts.domain.BodyParts;
import com.haitang.project.system.parts.service.IBodyPartsService;
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
@RequestMapping("/system/parts")
public class BodyPartsController extends BaseController
{
    private String prefix = "system/parts";

    @Autowired
    private IBodyPartsService bodyPartsService;

    @RequiresPermissions("system:parts:view")
    @GetMapping()
    public String parts()
    {
        return prefix + "/parts";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:parts:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BodyParts bodyParts)
    {
        startPage();
        List<BodyParts> list = bodyPartsService.selectBodyPartsList(bodyParts);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:parts:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BodyParts bodyParts)
    {
        List<BodyParts> list = bodyPartsService.selectBodyPartsList(bodyParts);
        ExcelUtil<BodyParts> util = new ExcelUtil<BodyParts>(BodyParts.class);
        return util.exportExcel(list, "parts");
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
    @RequiresPermissions("system:parts:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BodyParts bodyParts)
    {
        return toAjax(bodyPartsService.insertBodyParts(bodyParts));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BodyParts bodyParts = bodyPartsService.selectBodyPartsById(id);
        mmap.put("bodyParts", bodyParts);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:parts:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BodyParts bodyParts)
    {
        return toAjax(bodyPartsService.updateBodyParts(bodyParts));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:parts:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bodyPartsService.deleteBodyPartsByIds(ids));
    }
}
