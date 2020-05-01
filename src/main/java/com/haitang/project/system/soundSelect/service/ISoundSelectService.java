package com.haitang.project.system.soundSelect.service;

import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundSelect.domain.SoundSelect;

import java.util.List;

public interface ISoundSelectService {

    /**
     * 查询身体部位录音
     *
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    public List<SoundSelect> selectSoundPatientBodyById(Integer type);
}
