package com.haitang.project.system.accountMgt.service;

import com.haitang.project.system.accountMgt.domain.AccountMgt;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface IAccountMgtService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AccountMgt selectAccountMgtById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param accountMgt 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AccountMgt> selectAccountMgtList(AccountMgt accountMgt);

    /**
     * 新增【请填写功能名称】
     * 
     * @param accountMgt 【请填写功能名称】
     * @return 结果
     */
    public int insertAccountMgt(AccountMgt accountMgt);

    /**
     * 修改【请填写功能名称】
     * 
     * @param accountMgt 【请填写功能名称】
     * @return 结果
     */
    public int updateAccountMgt(AccountMgt accountMgt);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAccountMgtByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAccountMgtById(Long id);
}
