package com.haitang.project.system.clientLoginInfo.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.clientLoginInfo.mapper.ClientLoginInfoMapper;
import com.haitang.project.system.clientLoginInfo.domain.ClientLoginInfo;
import com.haitang.project.system.clientLoginInfo.service.IClientLoginInfoService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class ClientLoginInfoServiceImpl implements IClientLoginInfoService 
{
    @Autowired
    private ClientLoginInfoMapper clientLoginInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public ClientLoginInfo selectClientLoginInfoById(Long id)
    {
        return clientLoginInfoMapper.selectClientLoginInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param clientLoginInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<ClientLoginInfo> selectClientLoginInfoList(ClientLoginInfo clientLoginInfo)
    {
        return clientLoginInfoMapper.selectClientLoginInfoList(clientLoginInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param clientLoginInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertClientLoginInfo(ClientLoginInfo clientLoginInfo)
    {
        clientLoginInfo.setCreateTime(DateUtils.getNowDate());
        return clientLoginInfoMapper.insertClientLoginInfo(clientLoginInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param clientLoginInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateClientLoginInfo(ClientLoginInfo clientLoginInfo)
    {
        clientLoginInfo.setUpdateTime(DateUtils.getNowDate());
        return clientLoginInfoMapper.updateClientLoginInfo(clientLoginInfo);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientLoginInfoByIds(String ids)
    {
        return clientLoginInfoMapper.deleteClientLoginInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteClientLoginInfoById(Long id)
    {
        return clientLoginInfoMapper.deleteClientLoginInfoById(id);
    }
}
