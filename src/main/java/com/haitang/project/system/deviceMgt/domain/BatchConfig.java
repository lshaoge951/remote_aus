package com.haitang.project.system.deviceMgt.domain;

import com.haitang.project.system.conf.domain.DeviceLoginConf;

import java.util.List;

public class BatchConfig {

    List<DeviceLoginConf> deviceLoginConfs;

    String token;

    public List<DeviceLoginConf> getDeviceLoginConfs() {
        return deviceLoginConfs;
    }

    public void setDeviceLoginConfs(List<DeviceLoginConf> deviceLoginConfs) {
        this.deviceLoginConfs = deviceLoginConfs;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
