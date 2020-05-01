package com.haitang.project.system.accountPermission.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.accountPermission.mapper.AccountPermissionMapper;
import com.haitang.project.system.accountPermission.domain.AccountPermission;
import com.haitang.project.system.accountPermission.service.IAccountPermissionService;
import com.haitang.common.utils.text.Convert;

/**
 * 权限管理Service业务层处理
 * 
 * @author hch
 * @date 2020-05-01
 */
@Service
public class AccountPermissionServiceImpl implements IAccountPermissionService 
{
    @Autowired
    private AccountPermissionMapper accountPermissionMapper;

    /**
     * 查询权限管理
     * 
     * @param id 权限管理ID
     * @return 权限管理
     */
    @Override
    public AccountPermission selectAccountPermissionById(Long id)
    {
        return accountPermissionMapper.selectAccountPermissionById(id);
    }

    /**
     * 查询权限管理列表
     * 
     * @param accountPermission 权限管理
     * @return 权限管理
     */
    @Override
    public List<AccountPermission> selectAccountPermissionList(AccountPermission accountPermission)
    {
        return accountPermissionMapper.selectAccountPermissionList(accountPermission);
    }

    /**
     * 新增权限管理
     * 
     * @param accountPermission 权限管理
     * @return 结果
     */
    @Override
    public int insertAccountPermission(AccountPermission accountPermission)
    {
        return accountPermissionMapper.insertAccountPermission(accountPermission);
    }

    /**
     * 修改权限管理
     * 
     * @param accountPermission 权限管理
     * @return 结果
     */
    @Override
    public int updateAccountPermission(AccountPermission accountPermission)
    {
        return accountPermissionMapper.updateAccountPermission(accountPermission);
    }

    /**
     * 删除权限管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAccountPermissionByIds(String ids)
    {
        return accountPermissionMapper.deleteAccountPermissionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除权限管理信息
     * 
     * @param id 权限管理ID
     * @return 结果
     */
    @Override
    public int deleteAccountPermissionById(Long id)
    {
        return accountPermissionMapper.deleteAccountPermissionById(id);
    }
}
