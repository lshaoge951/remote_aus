package com.haitang.project.system.connectOnline.service.impl;

import com.haitang.project.system.connectOnline.domain.ConnectOnline;
import com.haitang.project.system.connectOnline.mapper.ConnectOnlineMapper;
import com.haitang.project.system.connectOnline.service.IConnectOnlineService;
import com.haitang.project.system.soundSelect.domain.SoundSelect;
import com.haitang.project.system.soundSelect.mapper.SoundSelectMapper;
import com.haitang.project.system.soundSelect.service.ISoundSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConnectOnlineServiceImpl implements IConnectOnlineService {
    @Autowired
    private ConnectOnlineMapper connectOnlineMapper;


    @Override
    public List<ConnectOnline> selectSoundPatientBodyById() {
        return connectOnlineMapper.selectOnlineList();
    }

    @Override
    public ConnectOnline selectOnline(String token) {
        return connectOnlineMapper.selectOnline(token);
    }

    @Override
    public void insertConnect(String token, String address) {
        connectOnlineMapper.insertOnlineData(token,address);
    }

    @Override
    public void deleteConnect(String token) {
        connectOnlineMapper.deleteOnlineData(token);
    }
}
