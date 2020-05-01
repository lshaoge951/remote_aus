package com.haitang.project.system.soundSelect.mapper;

import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundSelect.domain.SoundSelect;

import java.util.List;

/**
 * 身体部位录音Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface SoundSelectMapper
{
    /**
     * 查询身体部位录音
     * 
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    public List<SoundSelect> selectNoticeVo(Integer type);



}
