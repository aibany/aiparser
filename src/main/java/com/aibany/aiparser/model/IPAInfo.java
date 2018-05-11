package com.aibany.aiparser.model;

import java.util.List;


public class IPAInfo {

	private String minimumOSVersion;
	private String bundleVersionString;
	private String buildNumber;
	private String bundleName;
	private String requiredDeviceCapabilities;
	private byte[] bundleIcon;
	private String platformVersion;
	private Boolean iPadSupport;
	private Boolean iPhoneSupport;
	private String bundleIdentifier;
	private String provisioningProfileName;
	private String provisioningProfileCreationDate;
	private String provisioningProfileExpirationDate;
	private List<String>provisioningProfileDevices;
	private String teamIdentifier;
	private String teamName;
	private byte[] infoPlistFile;
	private byte[] mobileProvisionFile;
	private long fileSize;
	private String bundleIconFileName;

	public String getMinimumOSVersion() {
		return minimumOSVersion;
	}

	public void setMinimumOSVersion(String minimumOSVersion) {
		this.minimumOSVersion = minimumOSVersion;
	}

	public String getBundleVersionString() {
		return bundleVersionString;
	}

	public void setBundleVersionString(String bundleVersionString) {
		this.bundleVersionString = bundleVersionString;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public String getBundleName() {
		return bundleName;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	public String getRequiredDeviceCapabilities() {
		return requiredDeviceCapabilities;
	}

	public void setRequiredDeviceCapabilities(String requiredDeviceCapabilities) {
		this.requiredDeviceCapabilities = requiredDeviceCapabilities;
	}

	public byte[] getBundleIcon() {
		return bundleIcon;
	}

	public void setBundleIcon(byte[] bundleIcon) {
		this.bundleIcon = bundleIcon;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public Boolean getIPadSupport() {
		return iPadSupport;
	}

	public void setIPadSupport(Boolean iPadSupport) {
		this.iPadSupport = iPadSupport;
	}

	public Boolean getIPhoneSupport() {
		return iPhoneSupport;
	}

	public void setIPhoneSupport(Boolean iPhoneSupport) {
		this.iPhoneSupport = iPhoneSupport;
	}

	public String getBundleIdentifier() {
		return bundleIdentifier;
	}

	public void setBundleIdentifier(String bundleIdentifier) {
		this.bundleIdentifier = bundleIdentifier;
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

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getBundleIconFileName() {
		return bundleIconFileName;
	}

	public void setBundleIconFileName(String bundleIconFileName) {
		this.bundleIconFileName = bundleIconFileName;
	}
}


