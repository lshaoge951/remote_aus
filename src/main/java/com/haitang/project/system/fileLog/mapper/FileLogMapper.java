package com.haitang.project.system.fileLog.mapper;

import com.haitang.project.system.fileLog.domain.FileLog;
import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundSelect.domain.SoundSelect;

import java.util.Date;
import java.util.List;

/**
 * 身体部位录音Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface FileLogMapper
{
    /**
     * 查询身体部位录音
     * 
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    public List<FileLog> selectFileLog(String startTime, String endTime);

    public FileLog selectFileLogById(String id);

    /**
     * 查询身体部位录音
     *
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    public void insertFileLog(String localUrl,String serverUrl,String fileType,String fileName,String deviceId,String clientId,Long accountId,String uid,Integer isDelete);

    public void updateFileLog(Long id,String localUrl,String serverUrl,String fileType,String fileName,Integer isDelete);



}
