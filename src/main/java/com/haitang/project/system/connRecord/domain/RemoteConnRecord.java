package com.haitang.project.system.connRecord.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 remote_conn_record
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class RemoteConnRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** pad客户端运行账号 */
    @Excel(name = "pad客户端运行账号")
    private String account;

    /** 远程听诊连接唯一ID，用于标识一次连接 */
    @Excel(name = "远程听诊连接唯一ID，用于标识一次连接")
    private Long remoteConnId;

    /** Pad 设备唯一ID */
    @Excel(name = "Pad 设备唯一ID")
    private String clientId;

    /** 听诊模式，1：心音 2：肺音 */
    @Excel(name = "听诊模式，1：心音 2：肺音")
    private Integer auscultationMode;

    /** 通话模式 1：无  2：音频  3：音视频 */
    @Excel(name = "通话模式 1：无  2：音频  3：音视频")
    private String callMode;

    /** 发起听诊器编号 */
    @Excel(name = "发起听诊器编号")
    private String sendStethId;

    /** 接收听诊器编号组（接收端所属软件+接收端下面听诊器） */
    @Excel(name = "接收听诊器编号组", readConverterExp = "接=收端所属软件+接收端下面听诊器")
    private String recvStethIdList;

    /** 远程听诊持续时间 （单位：秒） */
    @Excel(name = "远程听诊持续时间 ", readConverterExp = "单=位：秒")
    private Long duration;

    /** 通话模式为音频，音视频，存储通话音频文件 */
    @Excel(name = "通话模式为音频，音视频，存储通话音频文件")
    private String audioFile;

    /** 显示排序 */
    @Excel(name = "显示排序")
    private Long sortOrder;

    /** 软删除，1=是 已删除，0=否 未删除 */
    @Excel(name = "软删除，1=是 已删除，0=否 未删除")
    private Integer isDelete;

    public void setId(Long id) 
    {
        this.id = id;
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
    public void setRemoteConnId(Long remoteConnId) 
    {
        this.remoteConnId = remoteConnId;
    }

    public Long getRemoteConnId() 
    {
        return remoteConnId;
    }
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setAuscultationMode(Integer auscultationMode) 
    {
        this.auscultationMode = auscultationMode;
    }

    public Integer getAuscultationMode() 
    {
        return auscultationMode;
    }
    public void setCallMode(String callMode) 
    {
        this.callMode = callMode;
    }

    public String getCallMode() 
    {
        return callMode;
    }
    public void setSendStethId(String sendStethId) 
    {
        this.sendStethId = sendStethId;
    }

    public String getSendStethId() 
    {
        return sendStethId;
    }
    public void setRecvStethIdList(String recvStethIdList) 
    {
        this.recvStethIdList = recvStethIdList;
    }

    public String getRecvStethIdList() 
    {
        return recvStethIdList;
    }
    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
    }
    public void setAudioFile(String audioFile) 
    {
        this.audioFile = audioFile;
    }

    public String getAudioFile() 
    {
        return audioFile;
    }
    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("account", getAccount())
            .append("remoteConnId", getRemoteConnId())
            .append("clientId", getClientId())
            .append("auscultationMode", getAuscultationMode())
            .append("callMode", getCallMode())
            .append("sendStethId", getSendStethId())
            .append("recvStethIdList", getRecvStethIdList())
            .append("duration", getDuration())
            .append("audioFile", getAudioFile())
            .append("sortOrder", getSortOrder())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
