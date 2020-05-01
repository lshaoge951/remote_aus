package com.haitang.project.system.clientBaseinfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.haitang.framework.aspectj.lang.annotation.Excel;
import com.haitang.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 client_baseinfo
 * 
 * @author haitang
 * @date 2020-03-19
 */
public class ClientBaseinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** pad自增长ID */
    private Long id;

    /** Pad 设备唯一ID */
    @Excel(name = "Pad 设备唯一ID")
    private String clientId;

    /** 厂商名 */
    @Excel(name = "厂商名")
    private String manufacturer;

    /** 产品名 */
    @Excel(name = "产品名")
    private String product;

    /** pad品牌 */
    @Excel(name = "pad品牌")
    private String brand;

    /** pad型号 */
    @Excel(name = "pad型号")
    private String model;

    /** 主板名 */
    @Excel(name = "主板名")
    private String board;

    /** 硬件序列号 */
    @Excel(name = "硬件序列号")
    private String deviceSerial;

    /** SDK版本 */
    @Excel(name = "SDK版本")
    private String deviceSdk;

    /** android版本 */
    @Excel(name = "android版本")
    private String androidVersion;

    /** 默认语言 */
    @Excel(name = "默认语言")
    private String defaultLanguage;

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
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setManufacturer(String manufacturer) 
    {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() 
    {
        return manufacturer;
    }
    public void setProduct(String product) 
    {
        this.product = product;
    }

    public String getProduct() 
    {
        return product;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setBoard(String board) 
    {
        this.board = board;
    }

    public String getBoard() 
    {
        return board;
    }
    public void setDeviceSerial(String deviceSerial) 
    {
        this.deviceSerial = deviceSerial;
    }

    public String getDeviceSerial() 
    {
        return deviceSerial;
    }
    public void setDeviceSdk(String deviceSdk) 
    {
        this.deviceSdk = deviceSdk;
    }

    public String getDeviceSdk() 
    {
        return deviceSdk;
    }
    public void setAndroidVersion(String androidVersion) 
    {
        this.androidVersion = androidVersion;
    }

    public String getAndroidVersion() 
    {
        return androidVersion;
    }
    public void setDefaultLanguage(String defaultLanguage) 
    {
        this.defaultLanguage = defaultLanguage;
    }

    public String getDefaultLanguage() 
    {
        return defaultLanguage;
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
            .append("clientId", getClientId())
            .append("manufacturer", getManufacturer())
            .append("product", getProduct())
            .append("brand", getBrand())
            .append("model", getModel())
            .append("board", getBoard())
            .append("deviceSerial", getDeviceSerial())
            .append("deviceSdk", getDeviceSdk())
            .append("androidVersion", getAndroidVersion())
            .append("defaultLanguage", getDefaultLanguage())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
