package com.haitang.project.system.fileLog.service;

import com.haitang.project.system.fileLog.domain.FileLog;
import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundSelect.domain.SoundSelect;

import java.util.Date;
import java.util.List;

public interface IFileLogService {

    /**
     * 查询身体部位录音
     *
     * @param
     * @return 身体部位录音
     */
    public List<FileLog> selectSoundPatientBodyById(String startTime,String endTime);

    public FileLog selectSoundPatientBodyByIdMain(String id);

    public void insertFileLog(String localUrl,String serverUrl,
                              String fileType,String fileName,
                              String deviceId,String clientId,
                              Long accountId,String uid,Integer isDelete);

    public void updateFileLog(Long id,String localUrl,String serverUrl,String fileType,String fileName,Integer isDelete);
}
