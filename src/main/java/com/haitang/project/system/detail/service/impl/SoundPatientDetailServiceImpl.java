package com.haitang.project.system.detail.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.detail.mapper.SoundPatientDetailMapper;
import com.haitang.project.system.detail.domain.SoundPatientDetail;
import com.haitang.project.system.detail.service.ISoundPatientDetailService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class SoundPatientDetailServiceImpl implements ISoundPatientDetailService 
{
    @Autowired
    private SoundPatientDetailMapper soundPatientDetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SoundPatientDetail selectSoundPatientDetailById(Long id)
    {
        return soundPatientDetailMapper.selectSoundPatientDetailById(id);
    }


    @Override
    public SoundPatientDetail selectSoundPatientDetailUById(String uid)
    {
        return soundPatientDetailMapper.selectSoundPatientDetailByUId(uid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundPatientDetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SoundPatientDetail> selectSoundPatientDetailList(SoundPatientDetail soundPatientDetail)
    {
        return soundPatientDetailMapper.selectSoundPatientDetailList(soundPatientDetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param soundPatientDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSoundPatientDetail(SoundPatientDetail soundPatientDetail)
    {
        soundPatientDetail.setCreateTime(DateUtils.getNowDate());
        return soundPatientDetailMapper.insertSoundPatientDetail(soundPatientDetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundPatientDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSoundPatientDetail(SoundPatientDetail soundPatientDetail)
    {
        soundPatientDetail.setUpdateTime(DateUtils.getNowDate());
        return soundPatientDetailMapper.updateSoundPatientDetail(soundPatientDetail);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientDetailByIds(String ids)
    {
        return soundPatientDetailMapper.deleteSoundPatientDetailByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientDetailById(Long id)
    {
        return soundPatientDetailMapper.deleteSoundPatientDetailById(id);
    }
}
