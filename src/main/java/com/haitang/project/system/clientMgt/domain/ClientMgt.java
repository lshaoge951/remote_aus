package com.haitang.project.system.clientMgt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 client_mgt
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class ClientMgt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** Pad 设备唯一ID */
    @Excel(name = "Pad 设备唯一ID")
    private String clientId;

    /** 所属客户编号 */
    @Excel(name = "所属客户编号")
    private String customerId;

    /** Pad客户端硬件唯一标识 */
    @Excel(name = "Pad客户端硬件唯一标识")
    private String padImei;

    /** Pad设备名称 （后续用于界面的显示） */
    @Excel(name = "Pad设备名称 ", readConverterExp = "后=续用于界面的显示")
    private String clientName;

    /** Pad客户端支持的听诊器数量 */
    @Excel(name = "Pad客户端支持的听诊器数量")
    private Long deviceNum;

    /** pad app软件版本号 */
    @Excel(name = "pad app软件版本号")
    private String softwareVersion;

    /** Pad客户端备案状态 1：无效 0：有效 */
    @Excel(name = "Pad客户端备案状态 1：无效 0：有效")
    private Integer status;

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
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }
    public void setPadImei(String padImei) 
    {
        this.padImei = padImei;
    }

    public String getPadImei() 
    {
        return padImei;
    }
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    public String getClientName() 
    {
        return clientName;
    }
    public void setDeviceNum(Long deviceNum) 
    {
        this.deviceNum = deviceNum;
    }

    public Long getDeviceNum() 
    {
        return deviceNum;
    }
    public void setSoftwareVersion(String softwareVersion) 
    {
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareVersion() 
    {
        return softwareVersion;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
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
            .append("clientId", getClientId())
            .append("customerId", getCustomerId())
            .append("padImei", getPadImei())
            .append("clientName", getClientName())
            .append("deviceNum", getDeviceNum())
            .append("softwareVersion", getSoftwareVersion())
            .append("status", getStatus())
            .append("sortOrder", getSortOrder())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
