package com.haitang.project.system.clientLoginInfo.service;

import com.haitang.project.system.clientLoginInfo.domain.ClientLoginInfo;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface IClientLoginInfoService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public ClientLoginInfo selectClientLoginInfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param clientLoginInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<ClientLoginInfo> selectClientLoginInfoList(ClientLoginInfo clientLoginInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param clientLoginInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertClientLoginInfo(ClientLoginInfo clientLoginInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param clientLoginInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateClientLoginInfo(ClientLoginInfo clientLoginInfo);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientLoginInfoByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteClientLoginInfoById(Long id);
}
