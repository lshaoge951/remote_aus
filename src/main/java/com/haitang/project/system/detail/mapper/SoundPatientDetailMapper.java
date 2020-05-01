package com.haitang.project.system.detail.mapper;

import com.haitang.project.system.detail.domain.SoundPatientDetail;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface SoundPatientDetailMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SoundPatientDetail selectSoundPatientDetailById(Long id);

    public SoundPatientDetail selectSoundPatientDetailByUId(String uid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param soundPatientDetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */

    public List<SoundPatientDetail> selectSoundPatientDetailList(SoundPatientDetail soundPatientDetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param soundPatientDetail 【请填写功能名称】
     * @return 结果
     */
    public int insertSoundPatientDetail(SoundPatientDetail soundPatientDetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param soundPatientDetail 【请填写功能名称】
     * @return 结果
     */
    public int updateSoundPatientDetail(SoundPatientDetail soundPatientDetail);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSoundPatientDetailById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSoundPatientDetailByIds(String[] ids);
}
