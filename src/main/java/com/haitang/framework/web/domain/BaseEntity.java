package com.haitang.framework.web.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Maps;

/**
 * Entity基类
 * 
 * @author haitang
 */
public class BaseEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** 搜索值 */
    private String searchValue;

    /**
     *创建者 */
    private String createUser;

    /** 创建者 */
    private String createBy;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /** 创建时间(start) */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createBegin;
    /** 创建时间(end) */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createEnd;

    /** 更新者 */
    private String updateUser;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 更新时间(start) */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateBegin;

    /** 更新时间(end) */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateEnd;

    /** 备注 */
    private String remark;
    /** 备注 */
    private String token;
    /** 备注 */
    private Long type;

    /** 请求参数 */
    private Map<String, Object> params;

    public String getSearchValue()
    {
        return searchValue;
    }

    public void setSearchValue(String searchValue)
    {
        this.searchValue = searchValue;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public Map<String, Object> getParams()
    {
        if (params == null)
        {
            params = Maps.newHashMap();
        }
        return params;
    }

    public void setParams(Map<String, Object> params)
    {
        this.params = params;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateBegin() {
        return createBegin;
    }

    public void setCreateBegin(Date createBegin) {
        this.createBegin = createBegin;
    }

    public Date getCreateEnd() {
        return createEnd;
    }

    public void setCreateEnd(Date createEnd) {
        this.createEnd = createEnd;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateBegin() {
        return updateBegin;
    }

    public void setUpdateBegin(Date updateBegin) {
        this.updateBegin = updateBegin;
    }

    public Date getUpdateEnd() {
        return updateEnd;
    }

    public void setUpdateEnd(Date updateEnd) {
        this.updateEnd = updateEnd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
