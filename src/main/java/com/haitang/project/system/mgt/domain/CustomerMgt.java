package com.haitang.project.system.mgt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 customer_mgt
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class CustomerMgt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 客户ID */
    @Excel(name = "客户ID")
    private String customerId;

    /** customer_id 的父ID，存储机构或者分支机构 0为根节点 */
    @Excel(name = "customer_id 的父ID，存储机构或者分支机构 0为根节点")
    private String prevId;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String name;

    /** 客户联系方式 */
    @Excel(name = "客户联系方式")
    private String phone;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String address;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 备案的听诊器设备数量    听诊器设备备案需要更新此字段 */
    @Excel(name = "备案的听诊器设备数量    听诊器设备备案需要更新此字段")
    private Long deviceNum;

    /** 备案的pad客户端数量    pad客户端备案需要更新此字段 */
    @Excel(name = "备案的pad客户端数量    pad客户端备案需要更新此字段")
    private Long clientNum;

    /** 备案的账号数量    账号备案需要更新此字段 */
    @Excel(name = "备案的账号数量    账号备案需要更新此字段")
    private Long accountNum;

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
    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }
    public void setPrevId(String prevId) 
    {
        this.prevId = prevId;
    }

    public String getPrevId() 
    {
        return prevId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setDeviceNum(Long deviceNum) 
    {
        this.deviceNum = deviceNum;
    }

    public Long getDeviceNum() 
    {
        return deviceNum;
    }
    public void setClientNum(Long clientNum) 
    {
        this.clientNum = clientNum;
    }

    public Long getClientNum() 
    {
        return clientNum;
    }
    public void setAccountNum(Long accountNum) 
    {
        this.accountNum = accountNum;
    }

    public Long getAccountNum() 
    {
        return accountNum;
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
            .append("customerId", getCustomerId())
            .append("prevId", getPrevId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("province", getProvince())
            .append("city", getCity())
            .append("deviceNum", getDeviceNum())
            .append("clientNum", getClientNum())
            .append("accountNum", getAccountNum())
            .append("remark", getRemark())
            .append("sortOrder", getSortOrder())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
