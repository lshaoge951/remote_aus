package com.haitang.project.system.log.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 operation_log
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class OperationLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 操作记录ID */
    @Excel(name = "操作记录ID")
    private Long opId;

    /** 数据库操作账号 */
    @Excel(name = "数据库操作账号")
    private String dbAccount;

    /** 后台管理操作账号 */
    @Excel(name = "后台管理操作账号")
    private String sysAccount;

    /** 所属模块 1、听诊配置 2、本地教学 3、听诊录音 4、远程听诊 5、其他 */
    @Excel(name = "所属模块 1、听诊配置 2、本地教学 3、听诊录音 4、远程听诊 5、其他")
    private String module;

    /** 操作表 */
    @Excel(name = "操作表")
    private String table;



    /** 具体操作细节，SQL语句 */
    @Excel(name = "具体操作细节，SQL语句")
    private String detail;

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
    public void setOpId(Long opId) 
    {
        this.opId = opId;
    }

    public Long getOpId() 
    {
        return opId;
    }
    public void setDbAccount(String dbAccount) 
    {
        this.dbAccount = dbAccount;
    }

    public String getDbAccount() 
    {
        return dbAccount;
    }
    public void setSysAccount(String sysAccount) 
    {
        this.sysAccount = sysAccount;
    }

    public String getSysAccount() 
    {
        return sysAccount;
    }
    public void setModule(String module) 
    {
        this.module = module;
    }

    public String getModule() 
    {
        return module;
    }
    public void setTable(String table) 
    {
        this.table = table;
    }

    public String getTable() 
    {
        return table;
    }

    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
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
            .append("opId", getOpId())
            .append("dbAccount", getDbAccount())
            .append("sysAccount", getSysAccount())
            .append("module", getModule())
            .append("table", getTable())
            .append("type", getType())
            .append("detail", getDetail())
            .append("createTime", getCreateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
