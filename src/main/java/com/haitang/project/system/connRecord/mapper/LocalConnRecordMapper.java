package com.haitang.project.system.connRecord.mapper;

import com.haitang.project.system.connRecord.domain.LocalConnRecord;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface LocalConnRecordMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LocalConnRecord selectLocalConnRecordById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param localConnRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LocalConnRecord> selectLocalConnRecordList(LocalConnRecord localConnRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param localConnRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertLocalConnRecord(LocalConnRecord localConnRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param localConnRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateLocalConnRecord(LocalConnRecord localConnRecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLocalConnRecordById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocalConnRecordByIds(String[] ids);
}
