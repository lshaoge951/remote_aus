package com.haitang.project.system.record.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.record.mapper.SoundRecordMapper;
import com.haitang.project.system.record.domain.SoundRecord;
import com.haitang.project.system.record.service.ISoundRecordService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class SoundRecordServiceImpl implements ISoundRecordService 
{
    @Autowired
    private SoundRecordMapper soundRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SoundRecord selectSoundRecordById(Long id)
    {
        return soundRecordMapper.selectSoundRecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SoundRecord> selectSoundRecordList(SoundRecord soundRecord)
    {
        return soundRecordMapper.selectSoundRecordList(soundRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param soundRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSoundRecord(SoundRecord soundRecord)
    {
        soundRecord.setCreateTime(DateUtils.getNowDate());
        return soundRecordMapper.insertSoundRecord(soundRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSoundRecord(SoundRecord soundRecord)
    {
        soundRecord.setUpdateTime(DateUtils.getNowDate());
        return soundRecordMapper.updateSoundRecord(soundRecord);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSoundRecordByIds(String ids)
    {
        return soundRecordMapper.deleteSoundRecordByIds(Convert.toStrArray(ids));
    }

    @Override
    public int deleteLogic(String uid)
    {
        return 1;
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSoundRecordById(Long id)
    {
        return soundRecordMapper.deleteSoundRecordById(id);
    }
}
