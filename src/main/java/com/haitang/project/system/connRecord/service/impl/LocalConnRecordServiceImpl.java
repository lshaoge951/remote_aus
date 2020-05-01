package com.haitang.project.system.connRecord.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.connRecord.mapper.LocalConnRecordMapper;
import com.haitang.project.system.connRecord.domain.LocalConnRecord;
import com.haitang.project.system.connRecord.service.ILocalConnRecordService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class LocalConnRecordServiceImpl implements ILocalConnRecordService 
{
    @Autowired
    private LocalConnRecordMapper localConnRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LocalConnRecord selectLocalConnRecordById(Long id)
    {
        return localConnRecordMapper.selectLocalConnRecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param localConnRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LocalConnRecord> selectLocalConnRecordList(LocalConnRecord localConnRecord)
    {
        return localConnRecordMapper.selectLocalConnRecordList(localConnRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param localConnRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLocalConnRecord(LocalConnRecord localConnRecord)
    {
        localConnRecord.setCreateTime(DateUtils.getNowDate());
        return localConnRecordMapper.insertLocalConnRecord(localConnRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param localConnRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLocalConnRecord(LocalConnRecord localConnRecord)
    {
        localConnRecord.setUpdateTime(DateUtils.getNowDate());
        return localConnRecordMapper.updateLocalConnRecord(localConnRecord);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocalConnRecordByIds(String ids)
    {
        return localConnRecordMapper.deleteLocalConnRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLocalConnRecordById(Long id)
    {
        return localConnRecordMapper.deleteLocalConnRecordById(id);
    }
}
