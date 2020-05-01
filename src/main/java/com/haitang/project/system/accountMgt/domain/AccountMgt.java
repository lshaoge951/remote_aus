package com.haitang.project.system.accountMgt.domain;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 【请填写功能名称】对象 account_mgt
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class AccountMgt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** pad客户端运行账号 */
    @ApiModelProperty("pad客户端运行账号")
    @Excel(name = "pad客户端运行账号")
    private String account;

    /** pad客户端运行密码 */
    @Excel(name = "pad客户端运行密码")
    @ApiModelProperty("pad客户端运行密码")
    private String password;

    /** 客户ID */
    @Excel(name = "客户ID")
    @ApiModelProperty("客户ID")
    private String customerId;

    /** 是否指定Pad才能运行 0：不指定 1：指定  */
    @Excel(name = "是否指定Pad才能运行 0：不指定 1：指定 ")
    @ApiModelProperty("是否指定Pad才能登录 0：不指定 1：指定 ")
    private Integer isFixed;

    /** client_id 列表，用于锁定具体哪些pad可以使用此账号，以，分割 */
    @Excel(name = "client_id 列表，用于锁定具体哪些pad可以使用此账号，以，分割")
    @ApiModelProperty("用于锁定具体哪些pad可以使用此账号，以','分割 ")
    private String clientList;

    /** 账号备案开始时间 */
    @Excel(name = "账号备案开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty("账号备案开始时间")
    private Date startTime;

    /** 账号备案结束时间 */
    @Excel(name = "账号备案结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty("账号备案结束时间(到期则无效)")
    private Date endTime;

    /** 账号状态 1：无效 0：有效 */
    @Excel(name = "账号状态 1：无效 0：有效")
    @ApiModelProperty("账号状态 1：无效 0：有效")
    private Integer status;

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
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }
    public void setIsFixed(Integer isFixed) 
    {
        this.isFixed = isFixed;
    }

    public Integer getIsFixed() 
    {
        return isFixed;
    }
    public void setClientList(String clientList) 
    {
        this.clientList = clientList;
    }

    public String getClientList() 
    {
        return clientList;
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

    public Integer getStatus() 
    {
        return status;
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
            .append("password", getPassword())
            .append("customerId", getCustomerId())
            .append("isFixed", getIsFixed())
            .append("clientList", getClientList())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
