package com.haitang.project.system.deviceMgt.service;

import com.haitang.project.system.deviceMgt.domain.DeviceMgt;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface IDeviceMgtService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DeviceMgt selectDeviceMgtById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param deviceMgt 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DeviceMgt> selectDeviceMgtList(DeviceMgt deviceMgt);

    /**
     * 新增【请填写功能名称】
     * 
     * @param deviceMgt 【请填写功能名称】
     * @return 结果
     */
    public int insertDeviceMgt(DeviceMgt deviceMgt);

    /**
     * 修改【请填写功能名称】
     * 
     * @param deviceMgt 【请填写功能名称】
     * @return 结果
     */
    public int updateDeviceMgt(DeviceMgt deviceMgt);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceMgtByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDeviceMgtById(Long id);
}
