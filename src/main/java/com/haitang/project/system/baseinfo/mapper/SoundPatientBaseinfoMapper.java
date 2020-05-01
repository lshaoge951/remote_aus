package com.haitang.project.system.baseinfo.mapper;

import com.haitang.project.system.baseinfo.domain.SoundPatientBaseinfo;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface SoundPatientBaseinfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SoundPatientBaseinfo selectSoundPatientBaseinfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundPatientBaseinfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoList(SoundPatientBaseinfo soundPatientBaseinfo);


    public int Share(String uid,String accountId);

    public int deleteShare(String uid);

    public int deleteLogic(String uid);

    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoShare(SoundPatientBaseinfo soundPatientBaseinfo);

    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoShareToMe(SoundPatientBaseinfo soundPatientBaseinfo);

    public List<SoundPatientBaseinfo> selectSoundPatientBaseinfoShareFromDept(SoundPatientBaseinfo soundPatientBaseinfo);


    /**
     * 新增【请填写功能名称】
     * 
     * @param soundPatientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    public int insertSoundPatientBaseinfo(SoundPatientBaseinfo soundPatientBaseinfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundPatientBaseinfo 【请填写功能名称】
     * @return 结果
     */
    public int updateSoundPatientBaseinfo(SoundPatientBaseinfo soundPatientBaseinfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSoundPatientBaseinfoById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSoundPatientBaseinfoByIds(String[] ids);
}
