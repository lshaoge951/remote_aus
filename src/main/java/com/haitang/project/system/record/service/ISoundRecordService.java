package com.haitang.project.system.record.service;

import com.haitang.project.system.record.domain.SoundRecord;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface ISoundRecordService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SoundRecord selectSoundRecordById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SoundRecord> selectSoundRecordList(SoundRecord soundRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param soundRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertSoundRecord(SoundRecord soundRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateSoundRecord(SoundRecord soundRecord);


    public int deleteLogic(String uid);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSoundRecordByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSoundRecordById(Long id);
}
