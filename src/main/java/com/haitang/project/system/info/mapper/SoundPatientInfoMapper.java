package com.haitang.project.system.info.mapper;

import com.haitang.project.system.info.domain.SoundPatientInfo;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface SoundPatientInfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SoundPatientInfo selectSoundPatientInfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundPatientInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SoundPatientInfo> selectSoundPatientInfoList(SoundPatientInfo soundPatientInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param soundPatientInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertSoundPatientInfo(SoundPatientInfo soundPatientInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundPatientInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateSoundPatientInfo(SoundPatientInfo soundPatientInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSoundPatientInfoById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSoundPatientInfoByIds(String[] ids);
}
