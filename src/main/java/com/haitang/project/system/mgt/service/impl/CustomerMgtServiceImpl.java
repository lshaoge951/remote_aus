package com.haitang.project.system.mgt.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.mgt.mapper.CustomerMgtMapper;
import com.haitang.project.system.mgt.domain.CustomerMgt;
import com.haitang.project.system.mgt.service.ICustomerMgtService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class CustomerMgtServiceImpl implements ICustomerMgtService 
{
    @Autowired
    private CustomerMgtMapper customerMgtMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CustomerMgt selectCustomerMgtById(Long id)
    {
        return customerMgtMapper.selectCustomerMgtById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param customerMgt 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CustomerMgt> selectCustomerMgtList(CustomerMgt customerMgt)
    {
        return customerMgtMapper.selectCustomerMgtList(customerMgt);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param customerMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCustomerMgt(CustomerMgt customerMgt)
    {
        customerMgt.setCreateTime(DateUtils.getNowDate());
        return customerMgtMapper.insertCustomerMgt(customerMgt);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param customerMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCustomerMgt(CustomerMgt customerMgt)
    {
        customerMgt.setUpdateTime(DateUtils.getNowDate());
        return customerMgtMapper.updateCustomerMgt(customerMgt);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCustomerMgtByIds(String ids)
    {
        return customerMgtMapper.deleteCustomerMgtByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCustomerMgtById(Long id)
    {
        return customerMgtMapper.deleteCustomerMgtById(id);
    }
}
