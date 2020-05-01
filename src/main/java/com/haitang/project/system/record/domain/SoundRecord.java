package com.haitang.project.system.record.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 【请填写功能名称】对象 sound_record
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class SoundRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** pad客户端运行账号 */
    @Excel(name = "pad客户端运行账号")
    private String account;

    /** 患者唯一标识ID */
    @Excel(name = "患者唯一标识ID")
    private String patientId;

    /** 录音的编号，每次录音生成一个唯一编号 */
    private String recordId;

    /** 录音方式 1：本地录音 2：本地教学 3：远程听诊 4：其他 */
    @Excel(name = "录音方式 1：本地录音 2：本地教学 3：远程听诊 4：其他")
    private Integer recordType;

    /** 声音类型 1：只有心音 2：只有肺音 3:心肺音都有 */
    @Excel(name = "声音类型 1：只有心音 2：只有肺音 3:心肺音都有")
    private Integer soundType;

    /** 本地录音所用听诊器    设备编号（出厂编号） */
    @Excel(name = "本地录音所用听诊器    设备编号", readConverterExp = "出=厂编号")
    private String deviceId;

    private Long bodyId;

    /** 本地录音所用Pad 设备唯一ID */
    @Excel(name = "本地录音所用Pad 设备唯一ID")
    private String clientId;

    private Long accountId;

    private String uid;

    /** 时间戳 用于校验本条记录是否最新，本地最新，则更新到服务端； 服务端最新，下载到本地 */
    @Excel(name = "时间戳 用于校验本条记录是否最新，本地最新，则更新到服务端； 服务端最新，下载到本地", width = 30, dateFormat = "yyyy-MM-dd")
    private Date timestamp;

    /** 更新次数 */
    @Excel(name = "更新次数")
    private Integer updateNum;

    /** 显示排序 */
    @Excel(name = "显示排序")
    private Long sortOrder;


    /** 状态：1启用、0禁用 */
    private Integer enabled;

    /** 软删除，1=是 已删除，0=否 未删除 */
    @Excel(name = "软删除，1=是 已删除，0=否 未删除")
    private Integer isDelete;

    private Long basicInfoId;

    private String fileId;

    private String fileDuration;


    public String getFileDuration() {
        return fileDuration;
    }

    public void setFileDuration(String fileDuration) {
        this.fileDuration = fileDuration;
    }

    public void setId(Long id)
    {
        this.id = id;
    }


    public Date getNow_time() {
        return new Date();
    }


    public Long getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(Long basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Long getBodyId() {
        return bodyId;
    }

    public void setBodyId(Long bodyId) {
        this.bodyId = bodyId;
    }

    public Long getId()
    {
        return id;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setPatientId(String patientId) 
    {
        this.patientId = patientId;
    }

    public String getPatientId() 
    {
        return patientId;
    }
    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }
    public void setRecordType(Integer recordType) 
    {
        this.recordType = recordType;
    }

    public Integer getRecordType() 
    {
        return recordType;
    }
    public void setSoundType(Integer soundType) 
    {
        this.soundType = soundType;
    }

    public Integer getSoundType() 
    {
        return soundType;
    }
    public void setDeviceId(String deviceId) 
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId() 
    {
        return deviceId;
    }
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setTimestamp(Date timestamp) 
    {
        this.timestamp = timestamp;
    }

    public Date getTimestamp() 
    {
        return timestamp;
    }
    public void setUpdateNum(Integer updateNum) 
    {
        this.updateNum = updateNum;
    }

    public Integer getUpdateNum() 
    {
        return updateNum;
    }
    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Integer getEnabled() 
    {
        return enabled;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("account", getAccount())
            .append("patientId", getPatientId())
            .append("recordId", getRecordId())
            .append("recordType", getRecordType())
            .append("soundType", getSoundType())
            .append("deviceId", getDeviceId())
            .append("clientId", getClientId())
            .append("timestamp", getTimestamp())
            .append("updateNum", getUpdateNum())
            .append("sortOrder", getSortOrder())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
