package com.haitang.project.system.info.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sound_patient_info
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class SoundPatientInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 录音的编号，每次录音生成一个唯一编号 */
    @Excel(name = "录音的编号，每次录音生成一个唯一编号")
    private String recordId;

    /** 患者唯一标识ID */
    @Excel(name = "患者唯一标识ID")
    private String patientId;

    /** 声音类型 1：心音 2：肺音 */
    @Excel(name = "声音类型 1：心音 2：肺音")
    private Integer soundType;

    /** 初步诊断，是选择框，内容以，分隔开 */
    @Excel(name = "初步诊断，是选择框，内容以，分隔开")
    private String diagnosis;

    /** 报告1 sound_type为1 则心超报告      否则 胸部X光报告 */
    @Excel(name = "报告1 sound_type为1 则心超报告      否则 胸部X光报告")
    private String report1;

    /** 报告2 sound_type为1 则心电图报告  否则 胸部CT报告 */
    @Excel(name = "报告2 sound_type为1 则心电图报告  否则 胸部CT报告")
    private String report2;

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
    public void setPatientId(String patientId) 
    {
        this.patientId = patientId;
    }

    public String getPatientId() 
    {
        return patientId;
    }
    public void setSoundType(Integer soundType) 
    {
        this.soundType = soundType;
    }

    public Integer getSoundType() 
    {
        return soundType;
    }
    public void setDiagnosis(String diagnosis) 
    {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() 
    {
        return diagnosis;
    }
    public void setReport1(String report1) 
    {
        this.report1 = report1;
    }

    public String getReport1() 
    {
        return report1;
    }
    public void setReport2(String report2) 
    {
        this.report2 = report2;
    }

    public String getReport2() 
    {
        return report2;
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
            .append("patientId", getPatientId())
            .append("soundType", getSoundType())
            .append("diagnosis", getDiagnosis())
            .append("report1", getReport1())
            .append("report2", getReport2())
            .append("remark", getRemark())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
