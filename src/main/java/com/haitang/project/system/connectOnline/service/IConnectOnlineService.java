package com.haitang.project.system.connectOnline.service;

import com.haitang.project.system.connectOnline.domain.ConnectOnline;
import com.haitang.project.system.soundSelect.domain.SoundSelect;

import java.util.List;

public interface IConnectOnlineService {

    /**
     * 查询身体部位录音
     *
     * @param
     * @return 身体部位录音
     */
    public List<ConnectOnline> selectSoundPatientBodyById();

    public ConnectOnline selectOnline(String token);

    public void insertConnect(String token,String address);

    public void deleteConnect(String token);
}
