package com.haitang.project.system.fileLog.controller;


import com.haitang.common.utils.StringUtils;
import com.haitang.common.utils.poi.ExcelUtil;
import com.haitang.framework.aspectj.lang.annotation.Log;
import com.haitang.framework.aspectj.lang.enums.BusinessType;
import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.fileLog.domain.FileLog;
import com.haitang.project.system.fileLog.service.IFileLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Api("前台用户操作")
@Controller
@RequestMapping("/app/fileLog")
public class FileLogController {
    @Autowired
    private IFileLogService fileLogService;


    private String prefix = "app/fileControl";

    @ApiOperation("前台用户注销")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/addSaveFile")
    @ResponseBody
    public Map<String,Object> addSaveFile(FileLog fileLog)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","200");
        map.put("msg","操作成功");
        map.put("systemTime",new Date());
        Long id = fileLog.getId();
        fileLogService.insertFileLog(fileLog.getServerUrl(),fileLog.getLocalUrl(),fileLog.getFileName(),fileLog.getFileType(),fileLog.getDeviceId(),fileLog.getClientId(),fileLog.getAccountId(),fileLog.getUid(),fileLog.getIsDelete());
        return map;
    }

    @ApiOperation("前台用户注销")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/editSaveFile")
    @ResponseBody
    public Map<String,Object> editSaveFile(FileLog fileLog)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        Long id = fileLog.getId();
        fileLogService.updateFileLog(id,fileLog.getServerUrl(),fileLog.getLocalUrl(),fileLog.getFileName(),fileLog.getFileType(),fileLog.getIsDelete());
        map.put("code","200");
        map.put("msg","操作成功");
        map.put("systemTime",new Date());


        return map;
    }
}
