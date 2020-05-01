package com.haitang.project.system.soundSelect.service.impl;

import com.haitang.project.system.soundSelect.domain.SoundSelect;
import com.haitang.project.system.soundSelect.mapper.SoundSelectMapper;
import com.haitang.project.system.soundSelect.service.ISoundSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoundSelectServiceImpl implements ISoundSelectService {
    @Autowired
    private SoundSelectMapper soundSelectMapper;


    @Override
    public List<SoundSelect> selectSoundPatientBodyById(Integer type) {
        return soundSelectMapper.selectNoticeVo(type);
    }
}
