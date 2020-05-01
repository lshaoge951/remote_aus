package com.haitang.project.system.info.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.info.mapper.SoundPatientInfoMapper;
import com.haitang.project.system.info.domain.SoundPatientInfo;
import com.haitang.project.system.info.service.ISoundPatientInfoService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class SoundPatientInfoServiceImpl implements ISoundPatientInfoService 
{
    @Autowired
    private SoundPatientInfoMapper soundPatientInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SoundPatientInfo selectSoundPatientInfoById(Long id)
    {
        return soundPatientInfoMapper.selectSoundPatientInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundPatientInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SoundPatientInfo> selectSoundPatientInfoList(SoundPatientInfo soundPatientInfo)
    {
        return soundPatientInfoMapper.selectSoundPatientInfoList(soundPatientInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param soundPatientInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSoundPatientInfo(SoundPatientInfo soundPatientInfo)
    {
        soundPatientInfo.setCreateTime(DateUtils.getNowDate());
        return soundPatientInfoMapper.insertSoundPatientInfo(soundPatientInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundPatientInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSoundPatientInfo(SoundPatientInfo soundPatientInfo)
    {
        soundPatientInfo.setUpdateTime(DateUtils.getNowDate());
        return soundPatientInfoMapper.updateSoundPatientInfo(soundPatientInfo);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientInfoByIds(String ids)
    {
        return soundPatientInfoMapper.deleteSoundPatientInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientInfoById(Long id)
    {
        return soundPatientInfoMapper.deleteSoundPatientInfoById(id);
    }
}
