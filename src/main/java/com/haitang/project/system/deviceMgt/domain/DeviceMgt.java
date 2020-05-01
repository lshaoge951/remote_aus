package com.haitang.project.system.deviceMgt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 【请填写功能名称】对象 device_mgt
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class DeviceMgt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 听诊器设备编号（出厂编号） */
    @Excel(name = "听诊器设备编号", readConverterExp = "出=厂编号")
    private String deviceId;

    /** 所属客户编号 */
    @Excel(name = "所属客户编号")
    private String customerId;

    /** 听诊器设备名称 */
    @Excel(name = "听诊器设备名称")
    private String deviceName;
    /** 所属医院名称 */
    @Excel(name = "听诊器设备名称")
    private String hosName;

    /** 备案类型 1：默认，所有软件都支持 2：支持指定Pad客户端 */
    @Excel(name = "备案类型 1：默认，所有软件都支持 2：支持指定Pad客户端")
    private Integer recordType;

    /** 备案范围，当record_type为2时生效，pad客户端ID组 */
    @Excel(name = "备案范围，当record_type为2时生效，pad客户端ID组")
    private String recordList;

    /** 听诊器备案开始时间 */
    @Excel(name = "听诊器备案开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 听诊器备案结束时间 */
    @Excel(name = "听诊器备案结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 听诊器备案状态 1：无效 0：有效 */
    @Excel(name = "听诊器备案状态 1：无效 0：有效")
    private Integer status;

    /** 显示排序 */
    @Excel(name = "显示排序")
    private Long sortOrder;

    /** 状态：1启用、0禁用 */
    @Excel(name = "状态：1启用、0禁用")
    private Integer enabled;

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
    public void setDeviceId(String deviceId) 
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId() 
    {
        return deviceId;
    }
    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setRecordType(Integer recordType) 
    {
        this.recordType = recordType;
    }

    public Integer getRecordType() 
    {
        return recordType;
    }
    public void setRecordList(String recordList) 
    {
        this.recordList = recordList;
    }

    public String getRecordList() 
    {
        return recordList;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public Integer getStatus()
    {
        return status;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deviceId", getDeviceId())
            .append("customerId", getCustomerId())
            .append("deviceName", getDeviceName())
            .append("recordType", getRecordType())
            .append("recordList", getRecordList())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .append("sortOrder", getSortOrder())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
