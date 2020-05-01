package com.haitang.project.system.fileLog.service.impl;

import com.haitang.project.system.fileLog.domain.FileLog;
import com.haitang.project.system.fileLog.mapper.FileLogMapper;
import com.haitang.project.system.fileLog.service.IFileLogService;
import com.haitang.project.system.soundSelect.domain.SoundSelect;
import com.haitang.project.system.soundSelect.mapper.SoundSelectMapper;
import com.haitang.project.system.soundSelect.service.ISoundSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class FileLogServiceImpl implements IFileLogService {
    @Autowired
    private FileLogMapper fileLogMapper;


    @Override
    public List<FileLog> selectSoundPatientBodyById(String startTime, String endTime) {
        return fileLogMapper.selectFileLog( startTime,  endTime);
    }

    @Override
    public FileLog selectSoundPatientBodyByIdMain(String id) {
        return fileLogMapper.selectFileLogById(id);
    }

    @Override
    public void insertFileLog(String localUrl, String serverUrl,
                              String fileType, String fileName,
                              String deviceId,String clientId,
                              Long accountId,String uid,Integer isDelete) {
        fileLogMapper.insertFileLog(localUrl,serverUrl,
                fileType,fileName,
                deviceId, clientId,
                accountId,uid,isDelete);
    }

    @Override
    public void updateFileLog(Long id, String localUrl, String serverUrl, String fileType, String fileName,Integer isDelete) {
        fileLogMapper.updateFileLog(id,localUrl,serverUrl,fileType,fileName,isDelete);
    }
}
