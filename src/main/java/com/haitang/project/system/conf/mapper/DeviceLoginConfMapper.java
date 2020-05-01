package com.haitang.project.system.conf.mapper;

import com.haitang.project.system.conf.domain.DeviceLoginConf;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface DeviceLoginConfMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DeviceLoginConf selectDeviceLoginConfById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param deviceLoginConf 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DeviceLoginConf> selectDeviceLoginConfList(DeviceLoginConf deviceLoginConf);

    /**
     * 新增【请填写功能名称】
     * 
     * @param deviceLoginConf 【请填写功能名称】
     * @return 结果
     */
    public int insertDeviceLoginConf(DeviceLoginConf deviceLoginConf);

    /**
     * 修改【请填写功能名称】
     * 
     * @param deviceLoginConf 【请填写功能名称】
     * @return 结果
     */
    public int updateDeviceLoginConf(DeviceLoginConf deviceLoginConf);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDeviceLoginConfById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceLoginConfByIds(String[] ids);
}
