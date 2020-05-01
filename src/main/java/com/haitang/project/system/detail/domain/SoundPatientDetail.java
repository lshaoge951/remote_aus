package com.haitang.project.system.detail.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sound_patient_detail
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class SoundPatientDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 录音的编号，每次录音生成一个唯一编号 */
    private String recordId;

    /** 患者唯一标识ID */
    @Excel(name = "患者唯一标识ID")
    private String patientId;

    /** 数据类型：1：体格检查 2：辅助检查 3：初步诊断 */
    @Excel(name = "数据类型：1：体格检查 2：辅助检查 3：初步诊断")
    private Integer dataType;

    /** 数据记录数量，从1开始计算 */
    @Excel(name = "数据记录数量，从1开始计算")
    private Integer dataNum;

    /** 心率 */
    @Excel(name = "心率")
    private String heartRate;

    /** 血压 */
    @Excel(name = "血压")
    private String bloodPressure;

    /** 其它 */
    @Excel(name = "其它")
    private String other;

    /** 听诊 */
    @Excel(name = "听诊")
    private String auscultation;

    private String enStep;

    /** 心电图 */
    @Excel(name = "心电图")
    private String eeg;

    /** 心超 */
    @Excel(name = "心超")
    private String heartSoul;

    /** 治疗方案 */
    @Excel(name = "治疗方案")
    private String treatmentPlan;

    /** 详细检查记录 */
    @Excel(name = "详细检查记录")
    private String log;

    /** 状态：1启用、0禁用 */
    @Excel(name = "状态：1启用、0禁用")
    private Integer enabled;

    /** 软删除，1=是 已删除，0=否 未删除 */
    @Excel(name = "软删除，1=是 已删除，0=否 未删除")
    private Integer isDelete;
    @Excel(name = "软删除，1=是 已删除，0=否 未删除")
    private String uid;

    private String basicinfoId;


    public String getEnStep() {
        return enStep;
    }

    public void setEnStep(String enStep) {
        this.enStep = enStep;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBasicinfoId() {
        return basicinfoId;
    }

    public void setBasicinfoId(String basicinfoId) {
        this.basicinfoId = basicinfoId;
    }

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
    public void setDataType(Integer dataType) 
    {
        this.dataType = dataType;
    }

    public Integer getDataType() 
    {
        return dataType;
    }
    public void setDataNum(Integer dataNum) 
    {
        this.dataNum = dataNum;
    }

    public Integer getDataNum() 
    {
        return dataNum;
    }
    public void setHeartRate(String heartRate) 
    {
        this.heartRate = heartRate;
    }

    public String getHeartRate() 
    {
        return heartRate;
    }
    public void setBloodPressure(String bloodPressure)
    {
        this.bloodPressure = bloodPressure;
    }

    public String getBloodPressure()
    {
        return bloodPressure;
    }
    public void setOther(String other) 
    {
        this.other = other;
    }

    public String getOther() 
    {
        return other;
    }
    public void setAuscultation(String auscultation) 
    {
        this.auscultation = auscultation;
    }

    public String getAuscultation() 
    {
        return auscultation;
    }
    public void setEeg(String eeg) 
    {
        this.eeg = eeg;
    }

    public String getEeg() 
    {
        return eeg;
    }
    public void setHeartSoul(String heartSoul) 
    {
        this.heartSoul = heartSoul;
    }

    public String getHeartSoul() 
    {
        return heartSoul;
    }
    public void setTreatmentPlan(String treatmentPlan) 
    {
        this.treatmentPlan = treatmentPlan;
    }

    public String getTreatmentPlan() 
    {
        return treatmentPlan;
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
            .append("dataType", getDataType())
            .append("dataNum", getDataNum())
            .append("heartRate", getHeartRate())
            .append("bloodPressure", getBloodPressure())
            .append("other", getOther())
            .append("auscultation", getAuscultation())
            .append("eeg", getEeg())
            .append("heartSoul", getHeartSoul())
            .append("treatmentPlan", getTreatmentPlan())
            .append("remark", getRemark())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
