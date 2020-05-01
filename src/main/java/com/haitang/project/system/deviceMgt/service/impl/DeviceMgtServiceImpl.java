package com.haitang.project.system.deviceMgt.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import com.haitang.project.system.deviceMgt.domain.DeviceMgt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.deviceMgt.mapper.DeviceMgtMapper;
import com.haitang.project.system.deviceMgt.service.IDeviceMgtService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class DeviceMgtServiceImpl implements IDeviceMgtService 
{
    @Autowired
    private DeviceMgtMapper deviceMgtMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DeviceMgt selectDeviceMgtById(Long id)
    {
        return deviceMgtMapper.selectDeviceMgtById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param deviceMgt 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DeviceMgt> selectDeviceMgtList(DeviceMgt deviceMgt)
    {
        return deviceMgtMapper.selectDeviceMgtList(deviceMgt);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param deviceMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDeviceMgt(DeviceMgt deviceMgt)
    {
        deviceMgt.setCreateTime(DateUtils.getNowDate());
        return deviceMgtMapper.insertDeviceMgt(deviceMgt);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param deviceMgt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDeviceMgt(DeviceMgt deviceMgt)
    {
        deviceMgt.setUpdateTime(DateUtils.getNowDate());
        return deviceMgtMapper.updateDeviceMgt(deviceMgt);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceMgtByIds(String ids)
    {
        return deviceMgtMapper.deleteDeviceMgtByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDeviceMgtById(Long id)
    {
        return deviceMgtMapper.deleteDeviceMgtById(id);
    }
}
