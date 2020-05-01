package com.haitang.project.system.soundPatientBody.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.soundPatientBody.mapper.SoundPatientBodyMapper;
import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundPatientBody.service.ISoundPatientBodyService;
import com.haitang.common.utils.text.Convert;

/**
 * 身体部位录音Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class SoundPatientBodyServiceImpl implements ISoundPatientBodyService 
{
    @Autowired
    private SoundPatientBodyMapper soundPatientBodyMapper;

    /**
     * 查询身体部位录音
     * 
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    @Override
    public SoundPatientBody selectSoundPatientBodyById(Long id)
    {
        return soundPatientBodyMapper.selectSoundPatientBodyById(id);
    }

    /**
     * 查询身体部位录音列表
     * 
     * @param soundPatientBody 身体部位录音
     * @return 身体部位录音
     */
    @Override
    public List<SoundPatientBody> selectSoundPatientBodyList(SoundPatientBody soundPatientBody)
    {
        return soundPatientBodyMapper.selectSoundPatientBodyList(soundPatientBody);
    }

    /**
     * 新增身体部位录音
     * 
     * @param soundPatientBody 身体部位录音
     * @return 结果
     */
    @Override
    public int insertSoundPatientBody(SoundPatientBody soundPatientBody)
    {
        soundPatientBody.setCreateTime(DateUtils.getNowDate());
        return soundPatientBodyMapper.insertSoundPatientBody(soundPatientBody);
    }

    /**
     * 修改身体部位录音
     * 
     * @param soundPatientBody 身体部位录音
     * @return 结果
     */
    @Override
    public int updateSoundPatientBody(SoundPatientBody soundPatientBody)
    {
        soundPatientBody.setUpdateTime(DateUtils.getNowDate());
        return soundPatientBodyMapper.updateSoundPatientBody(soundPatientBody);
    }

    /**
     * 删除身体部位录音对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientBodyByIds(String ids)
    {
        return soundPatientBodyMapper.deleteSoundPatientBodyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除身体部位录音信息
     * 
     * @param id 身体部位录音ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientBodyById(Long id)
    {
        return soundPatientBodyMapper.deleteSoundPatientBodyById(id);
    }
}
