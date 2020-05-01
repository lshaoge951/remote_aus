package com.haitang.project.system.conf.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 device_login_conf
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class DeviceLoginConf extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 听诊器设备编号（出厂编号） */
    @Excel(name = "听诊器设备编号", readConverterExp = "出=厂编号")
    private String deviceId;

    /** Pad 设备唯一ID */
    @Excel(name = "Pad 设备唯一ID")
    private String clientId;
    /** Pad 设备唯一ID */
    @Excel(name = "Pad 设备唯一ID")
    private Long accountId;

    /** 听诊器设备名称 */
    @Excel(name = "听诊器设备名称")
    private String deviceName;

    /** 所属科室 */
    @Excel(name = "所属科室")
    private String departments;

    /** 所属人 */
    @Excel(name = "所属人")
    private String owner;

    /** 用途 1：成人 2：儿童 */
    @Excel(name = "用途 1：成人 2：儿童")
    private Integer purpose;

    /** 显示排序 */
    @Excel(name = "显示排序")
    private Long sortOrder;

    /** 显示排序 */
    private String uid;

    /** 连接状态：1已连接、0未连接 */
    @Excel(name = "连接状态：1已连接、0未连接")
    private Integer connStatus;

    /** 软删除，1=是 已删除，0=否 未删除 */
    @Excel(name = "软删除，1=是 已删除，0=否 未删除")
    private Integer isDelete;

    private String token;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setDepartments(String departments) 
    {
        this.departments = departments;
    }

    public String getDepartments() 
    {
        return departments;
    }
    public void setOwner(String owner) 
    {
        this.owner = owner;
    }

    public String getOwner() 
    {
        return owner;
    }
    public void setPurpose(Integer purpose) 
    {
        this.purpose = purpose;
    }

    public Integer getPurpose() 
    {
        return purpose;
    }
    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }
    public void setConnStatus(Integer connStatus) 
    {
        this.connStatus = connStatus;
    }

    public Integer getConnStatus() 
    {
        return connStatus;
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
            .append("deviceId", getDeviceId())
            .append("clientId", getClientId())
            .append("deviceName", getDeviceName())
            .append("departments", getDepartments())
            .append("owner", getOwner())
            .append("purpose", getPurpose())
            .append("sortOrder", getSortOrder())
            .append("connStatus", getConnStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
