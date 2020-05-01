package com.haitang.project.system.connRecord.mapper;

import com.haitang.project.system.connRecord.domain.RemoteConnRecord;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface RemoteConnRecordMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public RemoteConnRecord selectRemoteConnRecordById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param remoteConnRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RemoteConnRecord> selectRemoteConnRecordList(RemoteConnRecord remoteConnRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param remoteConnRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertRemoteConnRecord(RemoteConnRecord remoteConnRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param remoteConnRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateRemoteConnRecord(RemoteConnRecord remoteConnRecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteRemoteConnRecordById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRemoteConnRecordByIds(String[] ids);
}
