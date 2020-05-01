package com.haitang.project.system.clientLoginInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 【请填写功能名称】对象 client_login_info
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class ClientLoginInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** pad客户端运行账号 */
    @Excel(name = "pad客户端运行账号")
    private String account;

    /** Pad 设备唯一ID */
    @Excel(name = "Pad 设备唯一ID")
    private String clientId;

    /** pad 临时运行秘钥Token */
    @Excel(name = "pad 临时运行秘钥Token")
    private String token;

    /** token有效时间戳 */
    @Excel(name = "token有效时间戳", width = 30, dateFormat = "yyyy-MM-dd")
    private Date timestamp;

    /** 录音时长，针对本地教学、听诊录音、远程教学都会用到此字段 */
    @Excel(name = "录音时长，针对本地教学、听诊录音、远程教学都会用到此字段")
    private Integer recordDuration;

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
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setToken(String token) 
    {
        this.token = token;
    }

    public String getToken() 
    {
        return token;
    }
    public void setTimestamp(Date timestamp) 
    {
        this.timestamp = timestamp;
    }

    public Date getTimestamp() 
    {
        return timestamp;
    }
    public void setRecordDuration(Integer recordDuration) 
    {
        this.recordDuration = recordDuration;
    }

    public Integer getRecordDuration() 
    {
        return recordDuration;
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
            .append("account", getAccount())
            .append("clientId", getClientId())
            .append("token", getToken())
            .append("timestamp", getTimestamp())
            .append("recordDuration", getRecordDuration())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
