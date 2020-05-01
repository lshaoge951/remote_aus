package com.haitang.project.system.connRecord.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 local_conn_record
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class LocalConnRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** pad客户端运行账号 */
    @Excel(name = "pad客户端运行账号")
    private String account;

    /** 本地听诊连接唯一ID，用于标识一次链接 */
    @Excel(name = "本地听诊连接唯一ID，用于标识一次链接")
    private Long connId;

    /** Pad 设备唯一ID */
    @Excel(name = "Pad 设备唯一ID")
    private String clientId;

    /** 链接类型，1：心音 2：肺音 */
    @Excel(name = "链接类型，1：心音 2：肺音")
    private Integer connType;

    /** 发起听诊器编号 */
    @Excel(name = "发起听诊器编号")
    private String sendStethId;

    /** 接收听诊器编号组（多个听诊器，以;分割） */
    @Excel(name = "接收听诊器编号组", readConverterExp = "多=个听诊器，以;分割")
    private String recvStethIdList;

    /** 本地听诊持续时间 （单位：秒） */
    @Excel(name = "本地听诊持续时间 ", readConverterExp = "单=位：秒")
    private Long duration;

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
    public void setConnId(Long connId) 
    {
        this.connId = connId;
    }

    public Long getConnId() 
    {
        return connId;
    }
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setConnType(Integer connType) 
    {
        this.connType = connType;
    }

    public Integer getConnType() 
    {
        return connType;
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
            .append("connId", getConnId())
            .append("clientId", getClientId())
            .append("connType", getConnType())
            .append("sendStethId", getSendStethId())
            .append("recvStethIdList", getRecvStethIdList())
            .append("duration", getDuration())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
