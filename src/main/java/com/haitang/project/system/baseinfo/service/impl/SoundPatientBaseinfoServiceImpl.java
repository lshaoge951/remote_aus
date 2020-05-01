package com.haitang.project.system.baseinfo.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.baseinfo.mapper.SoundPatientBaseinfoMapper;
import com.haitang.project.system.baseinfo.domain.SoundPatientBaseinfo;
import com.haitang.project.system.baseinfo.service.ISoundPatientBaseinfoService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class SoundPatientBaseinfoServiceImpl implements ISoundPatientBaseinfoService 
{
    @Autowired
    private SoundPatientBaseinfoMapper soundPatientBaseinfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SoundPatientBaseinfo selectSoundPatientBaseinfoById(Long id)
    {
        return soundPatientBaseinfoMapper.selectSoundPatientBaseinfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundPatientBaseinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoList(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        return soundPatientBaseinfoMapper.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
    }

    @Override
    public void addShare(String accountId, String uid) {
        soundPatientBaseinfoMapper.Share(uid,accountId);
    }

    @Override
    public void deleteShare(String accountId, String uid) {
        soundPatientBaseinfoMapper.deleteShare(uid);
    }

    @Override
    public void deleteLogic(String uid) {
        soundPatientBaseinfoMapper.deleteLogic(uid);
    }


    @Override
    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoShare(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        return soundPatientBaseinfoMapper.selectSoundPatientBaseinfoShare(soundPatientBaseinfo);
    }

    @Override
    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoShareToMe(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        return soundPatientBaseinfoMapper.selectSoundPatientBaseinfoShareToMe(soundPatientBaseinfo);
    }

    @Override
    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoShareFromDept(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        return soundPatientBaseinfoMapper.selectSoundPatientBaseinfoShareFromDept(soundPatientBaseinfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param soundPatientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSoundPatientBaseinfo(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        soundPatientBaseinfo.setCreateTime(DateUtils.getNowDate());
        return soundPatientBaseinfoMapper.insertSoundPatientBaseinfo(soundPatientBaseinfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundPatientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSoundPatientBaseinfo(SoundPatientBaseinfo soundPatientBaseinfo)
    {
        soundPatientBaseinfo.setUpdateTime(DateUtils.getNowDate());
        return soundPatientBaseinfoMapper.updateSoundPatientBaseinfo(soundPatientBaseinfo);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientBaseinfoByIds(String ids)
    {
        return soundPatientBaseinfoMapper.deleteSoundPatientBaseinfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSoundPatientBaseinfoById(Long id)
    {
        return soundPatientBaseinfoMapper.deleteSoundPatientBaseinfoById(id);
    }
}
