package com.haitang.project.system.clientMgt.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.clientMgt.mapper.ClientMgtMapper;
import com.haitang.project.system.clientMgt.domain.ClientMgt;
import com.haitang.project.system.clientMgt.service.IClientMgtService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class ClientMgtServiceImpl implements IClientMgtService 
{
    @Autowired
    private ClientMgtMapper clientMgtMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public ClientMgt selectClientMgtById(Long id)
    {
        return clientMgtMapper.selectClientMgtById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param clientMgt 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<ClientMgt> selectClientMgtList(ClientMgt clientMgt)
    {
        return clientMgtMapper.selectClientMgtList(clientMgt);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param clientMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertClientMgt(ClientMgt clientMgt)
    {
        clientMgt.setCreateTime(DateUtils.getNowDate());
        return clientMgtMapper.insertClientMgt(clientMgt);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param clientMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateClientMgt(ClientMgt clientMgt)
    {
        clientMgt.setUpdateTime(DateUtils.getNowDate());
        return clientMgtMapper.updateClientMgt(clientMgt);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientMgtByIds(String ids)
    {
        return clientMgtMapper.deleteClientMgtByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteClientMgtById(Long id)
    {
        return clientMgtMapper.deleteClientMgtById(id);
    }
}
