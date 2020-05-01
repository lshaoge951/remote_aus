package com.haitang.project.system.conf.service.impl;

import java.util.List;

import com.haitang.project.system.conf.domain.DeviceLoginConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.conf.mapper.DeviceLoginConfMapper;
import com.haitang.project.system.conf.service.IDeviceLoginConfService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class DeviceLoginConfServiceImpl implements IDeviceLoginConfService 
{
    @Autowired
    private DeviceLoginConfMapper deviceLoginConfMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DeviceLoginConf selectDeviceLoginConfById(Long id)
    {
        return deviceLoginConfMapper.selectDeviceLoginConfById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param deviceLoginConf 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DeviceLoginConf> selectDeviceLoginConfList(DeviceLoginConf deviceLoginConf)
    {
        return deviceLoginConfMapper.selectDeviceLoginConfList(deviceLoginConf);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param deviceLoginConf 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDeviceLoginConf(DeviceLoginConf deviceLoginConf)
    {
        //deviceLoginConf.setCreateTime(DateUtils.getNowDate());
        return deviceLoginConfMapper.insertDeviceLoginConf(deviceLoginConf);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param deviceLoginConf 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDeviceLoginConf(DeviceLoginConf deviceLoginConf)
    {
        //deviceLoginConf.setUpdateTime(DateUtils.getNowDate());
        return deviceLoginConfMapper.updateDeviceLoginConf(deviceLoginConf);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceLoginConfByIds(String ids)
    {
        return deviceLoginConfMapper.deleteDeviceLoginConfByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDeviceLoginConfById(Long id)
    {
        return deviceLoginConfMapper.deleteDeviceLoginConfById(id);
    }
}
