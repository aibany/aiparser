package com.aibany.aiparser.model;

import com.alibaba.fastjson.annotation.JSONField;
import net.dongliu.apk.parser.bean.GlEsVersion;
import net.dongliu.apk.parser.bean.Permission;
import net.dongliu.apk.parser.bean.UseFeature;

import java.util.ArrayList;
import java.util.List;

public class AppInfo {

    /**
     * ==========公共特性
     */

    /**
     * 包名
     */
    private String packageName;

    /**
     * 应用名
     */
    private String label;

    /**
     * 应用图片标名
     */
    private String icon;

    /**
     * 应用图片二进制
     */
    @JSONField(serialize = false)
    private byte[] iconData;

    /**
     * 版本名
     */
    private String versionName;

    /**
     * 版本号
     */
    private Long versionCode;

    /**
     * 最低系统要求
     */
    private String minSdkVersion;

    /**
     * 最低系统要求
     */
    private String minSdkString;

    /**
     * 文件大小字节
     */
    private long fileSize;


    /**
     * 安卓特性
     */
    private String installLocation;
    private String targetSdkVersion;
    private String maxSdkVersion;
    private GlEsVersion glEsVersion;
    private boolean anyDensity;
    private boolean smallScreens;
    private boolean normalScreens;
    private boolean largeScreens;
    private List<String> usesPermissions = new ArrayList();
    private List<UseFeature> usesFeatures = new ArrayList();
    private List<Permission> permissions = new ArrayList();

    /**
     * iOS特性
     */
    private String requiredDeviceCapabilities;
    private String platformVersion;
    private Boolean iPadSupport;
    private Boolean iPhoneSupport;
    private String provisioningProfileName;
    private String provisioningProfileCreationDate;
    private String provisioningProfileExpirationDate;
    private List<String>provisioningProfileDevices;
    private String teamIdentifier;
    private String teamName;
    private byte[] infoPlistFile;
    private byte[] mobileProvisionFile;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public byte[] getIconData() {
        return iconData;
    }

    public void setIconData(byte[] iconData) {
        this.iconData = iconData;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Long getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Long versionCode) {
        this.versionCode = versionCode;
    }

    public String getMinSdkVersion() {
        return minSdkVersion;
    }

    public void setMinSdkVersion(String minSdkVersion) {
        this.minSdkVersion = minSdkVersion;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation;
    }

    public String getTargetSdkVersion() {
        return targetSdkVersion;
    }

    public void setTargetSdkVersion(String targetSdkVersion) {
        this.targetSdkVersion = targetSdkVersion;
    }

    public String getMaxSdkVersion() {
        return maxSdkVersion;
    }

    public void setMaxSdkVersion(String maxSdkVersion) {
        this.maxSdkVersion = maxSdkVersion;
    }

    public GlEsVersion getGlEsVersion() {
        return glEsVersion;
    }

    public void setGlEsVersion(GlEsVersion glEsVersion) {
        this.glEsVersion = glEsVersion;
    }

    public boolean isAnyDensity() {
        return anyDensity;
    }

    public void setAnyDensity(boolean anyDensity) {
        this.anyDensity = anyDensity;
    }

    public boolean isSmallScreens() {
        return smallScreens;
    }

    public void setSmallScreens(boolean smallScreens) {
        this.smallScreens = smallScreens;
    }

    public boolean isNormalScreens() {
        return normalScreens;
    }

    public void setNormalScreens(boolean normalScreens) {
        this.normalScreens = normalScreens;
    }

    public boolean isLargeScreens() {
        return largeScreens;
    }

    public void setLargeScreens(boolean largeScreens) {
        this.largeScreens = largeScreens;
    }

    public List<String> getUsesPermissions() {
        return usesPermissions;
    }

    public void setUsesPermissions(List<String> usesPermissions) {
        this.usesPermissions = usesPermissions;
    }

    public List<UseFeature> getUsesFeatures() {
        return usesFeatures;
    }

    public void setUsesFeatures(List<UseFeature> usesFeatures) {
        this.usesFeatures = usesFeatures;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getRequiredDeviceCapabilities() {
        return requiredDeviceCapabilities;
    }

    public void setRequiredDeviceCapabilities(String requiredDeviceCapabilities) {
        this.requiredDeviceCapabilities = requiredDeviceCapabilities;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public Boolean getiPadSupport() {
        return iPadSupport;
    }

    public void setiPadSupport(Boolean iPadSupport) {
        this.iPadSupport = iPadSupport;
    }

    public Boolean getiPhoneSupport() {
        return iPhoneSupport;
    }

    public void setiPhoneSupport(Boolean iPhoneSupport) {
        this.iPhoneSupport = iPhoneSupport;
    }

    public String getProvisioningProfileName() {
        return provisioningProfileName;
    }

    public void setProvisioningProfileName(String provisioningProfileName) {
        this.provisioningProfileName = provisioningProfileName;
    }

    public String getProvisioningProfileCreationDate() {
        return provisioningProfileCreationDate;
    }

    public void setProvisioningProfileCreationDate(String provisioningProfileCreationDate) {
        this.provisioningProfileCreationDate = provisioningProfileCreationDate;
    }

    public String getProvisioningProfileExpirationDate() {
        return provisioningProfileExpirationDate;
    }

    public void setProvisioningProfileExpirationDate(String provisioningProfileExpirationDate) {
        this.provisioningProfileExpirationDate = provisioningProfileExpirationDate;
    }

    public List<String> getProvisioningProfileDevices() {
        return provisioningProfileDevices;
    }

    public void setProvisioningProfileDevices(List<String> provisioningProfileDevices) {
        this.provisioningProfileDevices = provisioningProfileDevices;
    }

    public String getTeamIdentifier() {
        return teamIdentifier;
    }

    public void setTeamIdentifier(String teamIdentifier) {
        this.teamIdentifier = teamIdentifier;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public byte[] getInfoPlistFile() {
        return infoPlistFile;
    }

    public void setInfoPlistFile(byte[] infoPlistFile) {
        this.infoPlistFile = infoPlistFile;
    }

    public byte[] getMobileProvisionFile() {
        return mobileProvisionFile;
    }

    public void setMobileProvisionFile(byte[] mobileProvisionFile) {
        this.mobileProvisionFile = mobileProvisionFile;
    }

    public String getMinSdkString() {
        return minSdkString;
    }

    public void setMinSdkString(String minSdkString) {
        this.minSdkString = minSdkString;
    }
}
