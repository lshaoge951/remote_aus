package com.haitang.project.system.baseinfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

import java.util.Date;

/**
 * 【请填写功能名称】对象 sound_patient_baseinfo
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class SoundPatientBaseinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 录音的编号，每次录音生成一个唯一编号 */
    private String recordId;

    /** 患者唯一标识ID */
    @Excel(name = "患者唯一标识ID")
    private String patientId;
    private Long accountId;

    /** 患者唯一标识ID */
    private String clientId;

    /** 患者姓名 */
    @Excel(name = "患者姓名")
    private String patientName;
    /** 患者姓名 */
    private String deviceId;

    /** 患者性别 1：男士  2：女士 */
    @Excel(name = "患者性别 1：男士  2：女士")
    private Integer patientSex;

    /** 患者年龄 */
    @Excel(name = "患者年龄")
    private Integer patientAge;

    /** 住院号 */
    @Excel(name = "住院号")
    private String admissionNum;

    /** 科室 */
    @Excel(name = "科室")
    private String department;

    /** 现病史 */
    @Excel(name = "现病史")
    private String hpi;

    /** 既往史 */
    @Excel(name = "既往史")
    private String pmh;
    /** 既往史 */
    private String uid;

    /** 主诉 */
    @Excel(name = "主诉")
    private String chiefComplaint;

    /** 个人史 */
    @Excel(name = "个人史")
    private String personalHistory;
    private String paintType;
    /** 治疗方案 */
    @Excel(name = "治疗方案")
    private String treatmentPlan;
    /** 治疗方案 */

    /** 治疗方案 */
    private String doctorName;

    /** 初步诊断，是选择框，内容以，分隔开 */
    @Excel(name = "初步诊断，是选择框，内容以，分隔开")
    private String diagnosis;

    /** 状态：1启用、0禁用 */
    @Excel(name = "状态：1启用、0禁用")
    private Integer enabled;

    /** 软删除，1=是 已删除，0=否 未删除 */
    @Excel(name = "软删除，1=是 已删除，0=否 未删除")
    private Integer isDelete;

    private String fileId;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Date getNow_time() {
        return new Date();
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
    public void setPatientName(String patientName) 
    {
        this.patientName = patientName;
    }

    public String getPatientName() 
    {
        return patientName;
    }
    public void setPatientSex(Integer patientSex) 
    {
        this.patientSex = patientSex;
    }

    public Integer getPatientSex() 
    {
        return patientSex;
    }
    public void setPatientAge(Integer patientAge) 
    {
        this.patientAge = patientAge;
    }

    public Integer getPatientAge() 
    {
        return patientAge;
    }
    public void setAdmissionNum(String admissionNum) 
    {
        this.admissionNum = admissionNum;
    }

    public String getAdmissionNum() 
    {
        return admissionNum;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setHpi(String hpi) 
    {
        this.hpi = hpi;
    }

    public String getHpi() 
    {
        return hpi;
    }
    public void setPmh(String pmh) 
    {
        this.pmh = pmh;
    }

    public String getPmh() 
    {
        return pmh;
    }
    public void setChiefComplaint(String chiefComplaint) 
    {
        this.chiefComplaint = chiefComplaint;
    }

    public String getChiefComplaint() 
    {
        return chiefComplaint;
    }
    public void setPersonalHistory(String personalHistory) 
    {
        this.personalHistory = personalHistory;
    }

    public String getPersonalHistory() 
    {
        return personalHistory;
    }
    public void setTreatmentPlan(String treatmentPlan) 
    {
        this.treatmentPlan = treatmentPlan;
    }

    public String getTreatmentPlan() 
    {
        return treatmentPlan;
    }
    public void setDiagnosis(String diagnosis) 
    {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() 
    {
        return diagnosis;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Integer getEnabled()
    {
        return enabled;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getUid() {
        return uid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
            .append("patientName", getPatientName())
            .append("patientSex", getPatientSex())
            .append("patientAge", getPatientAge())
            .append("admissionNum", getAdmissionNum())
            .append("department", getDepartment())
            .append("hpi", getHpi())
            .append("pmh", getPmh())
            .append("chiefComplaint", getChiefComplaint())
            .append("personalHistory", getPersonalHistory())
            .append("treatmentPlan", getTreatmentPlan())
            .append("diagnosis", getDiagnosis())
            .append("remark", getRemark())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
