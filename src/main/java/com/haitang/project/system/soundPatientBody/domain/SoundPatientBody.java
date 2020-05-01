package com.haitang.project.system.soundPatientBody.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 身体部位录音对象 sound_patient_body
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class SoundPatientBody extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 录音的编号，每次录音生成一个唯一编号 */
    @Excel(name = "录音的编号，每次录音生成一个唯一编号")
    private String recordId;

    /** 声音类型 1：心音 2：肺音 */
    @Excel(name = "声音类型 1：心音 2：肺音")
    private Integer soundType;

    /** 一个record_id下面，存在多批次的录音记录，从1到多，第1次，第N次. */
    @Excel(name = "一个record_id下面，存在多批次的录音记录，从1到多，第1次，第N次.")
    private Integer ranking;

    /** 身体部位ID */
    @Excel(name = "身体部位ID")
    private Long bodyId;

    /** 声音的文件URL */
    @Excel(name = "声音的文件URL")
    private String soundUrl;

    /** 声音时长 （单位：秒） */
    @Excel(name = "声音时长 ", readConverterExp = "单=位：秒")
    private Long duration;

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
    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }
    public void setSoundType(Integer soundType) 
    {
        this.soundType = soundType;
    }

    public Integer getSoundType() 
    {
        return soundType;
    }
    public void setRanking(Integer ranking) 
    {
        this.ranking = ranking;
    }

    public Integer getRanking() 
    {
        return ranking;
    }
    public void setBodyId(Long bodyId) 
    {
        this.bodyId = bodyId;
    }

    public Long getBodyId() 
    {
        return bodyId;
    }
    public void setSoundUrl(String soundUrl) 
    {
        this.soundUrl = soundUrl;
    }

    public String getSoundUrl() 
    {
        return soundUrl;
    }
    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
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
            .append("recordId", getRecordId())
            .append("soundType", getSoundType())
            .append("ranking", getRanking())
            .append("bodyId", getBodyId())
            .append("soundUrl", getSoundUrl())
            .append("duration", getDuration())
            .append("remark", getRemark())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
