package com.haitang.project.system.clientMgt.service;

import com.haitang.project.system.clientMgt.domain.ClientMgt;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface IClientMgtService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public ClientMgt selectClientMgtById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param clientMgt 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<ClientMgt> selectClientMgtList(ClientMgt clientMgt);

    /**
     * 新增【请填写功能名称】
     * 
     * @param clientMgt 【请填写功能名称】
     * @return 结果
     */
    public int insertClientMgt(ClientMgt clientMgt);

    /**
     * 修改【请填写功能名称】
     * 
     * @param clientMgt 【请填写功能名称】
     * @return 结果
     */
    public int updateClientMgt(ClientMgt clientMgt);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientMgtByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteClientMgtById(Long id);
}
