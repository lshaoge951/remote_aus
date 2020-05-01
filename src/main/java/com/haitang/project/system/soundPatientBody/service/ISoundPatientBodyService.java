package com.haitang.project.system.soundPatientBody.service;

import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import java.util.List;

/**
 * 身体部位录音Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface ISoundPatientBodyService 
{
    /**
     * 查询身体部位录音
     * 
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    public SoundPatientBody selectSoundPatientBodyById(Long id);

    /**
     * 查询身体部位录音列表
     * 
     * @param soundPatientBody 身体部位录音
     * @return 身体部位录音集合
     */
    public List<SoundPatientBody> selectSoundPatientBodyList(SoundPatientBody soundPatientBody);

    /**
     * 新增身体部位录音
     * 
     * @param soundPatientBody 身体部位录音
     * @return 结果
     */
    public int insertSoundPatientBody(SoundPatientBody soundPatientBody);

    /**
     * 修改身体部位录音
     * 
     * @param soundPatientBody 身体部位录音
     * @return 结果
     */
    public int updateSoundPatientBody(SoundPatientBody soundPatientBody);

    /**
     * 批量删除身体部位录音
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSoundPatientBodyByIds(String ids);

    /**
     * 删除身体部位录音信息
     * 
     * @param id 身体部位录音ID
     * @return 结果
     */
    public int deleteSoundPatientBodyById(Long id);
}
