package com.haitang.project.system.parts.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 body_parts
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class BodyParts extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 身体部位ID */
    @Excel(name = "身体部位ID")
    private Long bodyId;



    /** 身体部位名称 */
    @Excel(name = "身体部位名称")
    private String name;

    /** 身体部位图标URL */
    @Excel(name = "身体部位图标URL")
    private String icon;

    /** 身体部位波形图 */
    @Excel(name = "身体部位波形图")
    private String waveformUrl;

    /** 显示排序 */
    @Excel(name = "显示排序")
    private Long sortOrder;

    /** 允许删除 */
    @Excel(name = "允许删除")
    private Integer allowDel;

    /** 状态：1启用、0禁用 */
    @Excel(name = "状态：1启用、0禁用")
    private Integer enabled;

    /** 软删除，1=是 已删除，0=否 未删除 */
    @Excel(name = "软删除，1=是 已删除，0=否 未删除")
    private Integer isDelete;

    public Integer getAllowDel() {
        return allowDel;
    }

    public void setAllowDel(Integer allowDel) {
        this.allowDel = allowDel;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBodyId(Long bodyId) 
    {
        this.bodyId = bodyId;
    }

    public Long getBodyId() 
    {
        return bodyId;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setWaveformUrl(String waveformUrl) 
    {
        this.waveformUrl = waveformUrl;
    }

    public String getWaveformUrl() 
    {
        return waveformUrl;
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
            .append("bodyId", getBodyId())
            .append("type", getType())
            .append("name", getName())
            .append("icon", getIcon())
            .append("waveformUrl", getWaveformUrl())
            .append("sortOrder", getSortOrder())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
