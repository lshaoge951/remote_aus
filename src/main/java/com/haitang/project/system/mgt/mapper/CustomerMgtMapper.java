package com.haitang.project.system.mgt.mapper;

import com.haitang.project.system.mgt.domain.CustomerMgt;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface CustomerMgtMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CustomerMgt selectCustomerMgtById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param customerMgt 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CustomerMgt> selectCustomerMgtList(CustomerMgt customerMgt);

    /**
     * 新增【请填写功能名称】
     * 
     * @param customerMgt 【请填写功能名称】
     * @return 结果
     */
    public int insertCustomerMgt(CustomerMgt customerMgt);

    /**
     * 修改【请填写功能名称】
     * 
     * @param customerMgt 【请填写功能名称】
     * @return 结果
     */
    public int updateCustomerMgt(CustomerMgt customerMgt);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCustomerMgtById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCustomerMgtByIds(String[] ids);
}
