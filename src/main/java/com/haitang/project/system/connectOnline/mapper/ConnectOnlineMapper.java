package com.haitang.project.system.connectOnline.mapper;

import com.haitang.project.system.connectOnline.domain.ConnectOnline;
import com.haitang.project.system.soundSelect.domain.SoundSelect;

import java.util.List;

/**
 * 身体部位录音Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface ConnectOnlineMapper
{
    /**
     * 查询身体部位录音
     * 
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    public List<ConnectOnline> selectOnlineList();

    public ConnectOnline selectOnline(String token);

    public void insertOnlineData(String token,String address);

    public void deleteOnlineData(String token);



}
