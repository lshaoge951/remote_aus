package com.haitang.project.system.connRecord.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.connRecord.mapper.RemoteConnRecordMapper;
import com.haitang.project.system.connRecord.domain.RemoteConnRecord;
import com.haitang.project.system.connRecord.service.IRemoteConnRecordService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class RemoteConnRecordServiceImpl implements IRemoteConnRecordService 
{
    @Autowired
    private RemoteConnRecordMapper remoteConnRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public RemoteConnRecord selectRemoteConnRecordById(Long id)
    {
        return remoteConnRecordMapper.selectRemoteConnRecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param remoteConnRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<RemoteConnRecord> selectRemoteConnRecordList(RemoteConnRecord remoteConnRecord)
    {
        return remoteConnRecordMapper.selectRemoteConnRecordList(remoteConnRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param remoteConnRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRemoteConnRecord(RemoteConnRecord remoteConnRecord)
    {
        remoteConnRecord.setCreateTime(DateUtils.getNowDate());
        return remoteConnRecordMapper.insertRemoteConnRecord(remoteConnRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param remoteConnRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRemoteConnRecord(RemoteConnRecord remoteConnRecord)
    {
        remoteConnRecord.setUpdateTime(DateUtils.getNowDate());
        return remoteConnRecordMapper.updateRemoteConnRecord(remoteConnRecord);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRemoteConnRecordByIds(String ids)
    {
        return remoteConnRecordMapper.deleteRemoteConnRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteRemoteConnRecordById(Long id)
    {
        return remoteConnRecordMapper.deleteRemoteConnRecordById(id);
    }
}
