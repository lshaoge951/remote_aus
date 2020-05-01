package com.haitang.project.system.clientBaseinfo.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.clientBaseinfo.mapper.ClientBaseinfoMapper;
import com.haitang.project.system.clientBaseinfo.domain.ClientBaseinfo;
import com.haitang.project.system.clientBaseinfo.service.IClientBaseinfoService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class ClientBaseinfoServiceImpl implements IClientBaseinfoService 
{
    @Autowired
    private ClientBaseinfoMapper clientBaseinfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public ClientBaseinfo selectClientBaseinfoById(Long id)
    {
        return clientBaseinfoMapper.selectClientBaseinfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param clientBaseinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<ClientBaseinfo> selectClientBaseinfoList(ClientBaseinfo clientBaseinfo)
    {
        return clientBaseinfoMapper.selectClientBaseinfoList(clientBaseinfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param clientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertClientBaseinfo(ClientBaseinfo clientBaseinfo)
    {
        clientBaseinfo.setCreateTime(DateUtils.getNowDate());
        return clientBaseinfoMapper.insertClientBaseinfo(clientBaseinfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param clientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateClientBaseinfo(ClientBaseinfo clientBaseinfo)
    {
        clientBaseinfo.setUpdateTime(DateUtils.getNowDate());
        return clientBaseinfoMapper.updateClientBaseinfo(clientBaseinfo);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientBaseinfoByIds(String ids)
    {
        return clientBaseinfoMapper.deleteClientBaseinfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteClientBaseinfoById(Long id)
    {
        return clientBaseinfoMapper.deleteClientBaseinfoById(id);
    }
}
