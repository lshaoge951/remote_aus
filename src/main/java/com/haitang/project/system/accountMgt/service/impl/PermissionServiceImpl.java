package com.haitang.project.system.accountMgt.service.impl;

import com.haitang.common.utils.DateUtils;
import com.haitang.common.utils.text.Convert;
import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.accountMgt.mapper.AccountMgtMapper;
import com.haitang.project.system.accountMgt.mapper.PermissionMapper;
import com.haitang.project.system.accountMgt.service.IAccountMgtService;
import com.haitang.project.system.accountMgt.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class PermissionServiceImpl implements IPermissionService
{
    @Autowired
    private PermissionMapper accountMgtMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AccountMgt selectAccountMgtById(String account){
        return accountMgtMapper.selectPermissionByAccount(account);
    }


}
