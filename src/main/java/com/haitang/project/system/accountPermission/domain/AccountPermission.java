package com.haitang.project.system.accountPermission.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 权限管理对象 account_permission
 * 
 * @author hch
 * @date 2020-05-01
 */
public class AccountPermission extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 系统id */
    private Long id;

    /** 用户账号 */
    @Excel(name = "用户账号")
    private String account;

    /** 听诊配置 */
    @Excel(name = "听诊配置")
    private String configure;

    /** 听诊教学 */
    @Excel(name = "听诊教学")
    private String teaching;

    /** 听诊录音 */
    @Excel(name = "听诊录音")
    private String recording;

    /** 远程听诊 */
    @Excel(name = "远程听诊")
    private String faraway;

    /** 音库 */
    @Excel(name = "音库")
    private String database;

    /** 本地测试 */
    @Excel(name = "本地测试")
    private String test;

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
    public void setConfigure(String configure) 
    {
        this.configure = configure;
    }

    public String getConfigure() 
    {
        return configure;
    }
    public void setTeaching(String teaching) 
    {
        this.teaching = teaching;
    }

    public String getTeaching() 
    {
        return teaching;
    }
    public void setRecording(String recording) 
    {
        this.recording = recording;
    }

    public String getRecording() 
    {
        return recording;
    }
    public void setFaraway(String faraway) 
    {
        this.faraway = faraway;
    }

    public String getFaraway() 
    {
        return faraway;
    }
    public void setDatabase(String database) 
    {
        this.database = database;
    }

    public String getDatabase() 
    {
        return database;
    }
    public void setTest(String test) 
    {
        this.test = test;
    }

    public String getTest() 
    {
        return test;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("account", getAccount())
            .append("configure", getConfigure())
            .append("teaching", getTeaching())
            .append("recording", getRecording())
            .append("faraway", getFaraway())
            .append("database", getDatabase())
            .append("test", getTest())
            .toString();
    }
}
