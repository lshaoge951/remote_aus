package com.haitang.project.system.clientBaseinfo.mapper;

import com.haitang.project.system.clientBaseinfo.domain.ClientBaseinfo;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface ClientBaseinfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public ClientBaseinfo selectClientBaseinfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param clientBaseinfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<ClientBaseinfo> selectClientBaseinfoList(ClientBaseinfo clientBaseinfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param clientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    public int insertClientBaseinfo(ClientBaseinfo clientBaseinfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param clientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    public int updateClientBaseinfo(ClientBaseinfo clientBaseinfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteClientBaseinfoById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientBaseinfoByIds(String[] ids);
}
