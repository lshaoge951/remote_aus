package com.haitang.project.system.accountMgt.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.accountMgt.mapper.AccountMgtMapper;
import com.haitang.project.system.accountMgt.domain.AccountMgt;
import com.haitang.project.system.accountMgt.service.IAccountMgtService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class AccountMgtServiceImpl implements IAccountMgtService 
{
    @Autowired
    private AccountMgtMapper accountMgtMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AccountMgt selectAccountMgtById(Long id)
    {
        return accountMgtMapper.selectAccountMgtById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param accountMgt 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AccountMgt> selectAccountMgtList(AccountMgt accountMgt)
    {
        return accountMgtMapper.selectAccountMgtList(accountMgt);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param accountMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAccountMgt(AccountMgt accountMgt)
    {
        accountMgt.setCreateTime(DateUtils.getNowDate());
        return accountMgtMapper.insertAccountMgt(accountMgt);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param accountMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAccountMgt(AccountMgt accountMgt)
    {
        accountMgt.setUpdateTime(DateUtils.getNowDate());
        return accountMgtMapper.updateAccountMgt(accountMgt);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAccountMgtByIds(String ids)
    {
        return accountMgtMapper.deleteAccountMgtByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteAccountMgtById(Long id)
    {
        return accountMgtMapper.deleteAccountMgtById(id);
    }
}
