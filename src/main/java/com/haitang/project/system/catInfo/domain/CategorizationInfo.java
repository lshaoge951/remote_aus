package com.haitang.project.system.catInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 categorization_info
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class CategorizationInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String name;



    /** 数据类型 1：输入框 2：单选框 3：多选框 4：下拉框 */
    @Excel(name = "数据类型 1：输入框 2：单选框 3：多选框 4：下拉框")
    private Integer dataType;

    /** 分类ID */
    @Excel(name = "分类ID")
    private String currentId;

    /** 父ID，上一级ID */
    @Excel(name = "父ID，上一级ID")
    private String prevId;

    /** 分类等级  0：非叶子节点 1：叶子节点 叶子节点，才能用于选择 */
    @Excel(name = "分类等级  0：非叶子节点 1：叶子节点 叶子节点，才能用于选择")
    private Integer layer;

    /** 显示排序 */
    @Excel(name = "显示排序")
    private Long sortOrder;

    /** 状态：1启用、0禁用 */
    @Excel(name = "状态：1启用、0禁用")
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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setDataType(Integer dataType) 
    {
        this.dataType = dataType;
    }

    public Integer getDataType() 
    {
        return dataType;
    }
    public void setCurrentId(String currentId) 
    {
        this.currentId = currentId;
    }

    public String getCurrentId() 
    {
        return currentId;
    }
    public void setPrevId(String prevId) 
    {
        this.prevId = prevId;
    }

    public String getPrevId() 
    {
        return prevId;
    }
    public void setLayer(Integer layer) 
    {
        this.layer = layer;
    }

    public Integer getLayer() 
    {
        return layer;
    }
    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
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
            .append("name", getName())
            .append("type", getType())
            .append("dataType", getDataType())
            .append("currentId", getCurrentId())
            .append("prevId", getPrevId())
            .append("layer", getLayer())
            .append("sortOrder", getSortOrder())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
