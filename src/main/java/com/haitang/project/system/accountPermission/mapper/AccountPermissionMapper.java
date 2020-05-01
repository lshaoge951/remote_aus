package com.haitang.project.system.accountPermission.mapper;

import com.haitang.project.system.accountPermission.domain.AccountPermission;
import java.util.List;

/**
 * 权限管理Mapper接口
 * 
 * @author hch
 * @date 2020-05-01
 */
public interface AccountPermissionMapper 
{
    /**
     * 查询权限管理
     * 
     * @param id 权限管理ID
     * @return 权限管理
     */
    public AccountPermission selectAccountPermissionById(Long id);

    /**
     * 查询权限管理列表
     * 
     * @param accountPermission 权限管理
     * @return 权限管理集合
     */
    public List<AccountPermission> selectAccountPermissionList(AccountPermission accountPermission);

    /**
     * 新增权限管理
     * 
     * @param accountPermission 权限管理
     * @return 结果
     */
    public int insertAccountPermission(AccountPermission accountPermission);

    /**
     * 修改权限管理
     * 
     * @param accountPermission 权限管理
     * @return 结果
     */
    public int updateAccountPermission(AccountPermission accountPermission);

    /**
     * 删除权限管理
     * 
     * @param id 权限管理ID
     * @return 结果
     */
    public int deleteAccountPermissionById(Long id);

    /**
     * 批量删除权限管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAccountPermissionByIds(String[] ids);
}
