package com.entity;

//求助事务
import com.alibaba.fastjson.annotation.JSONField;
import com.auth0.jwt.internal.com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class Appeal {

	@ApiModelProperty(value = "求助ID，创建时不填，修改信息时必填")
	private Long appealId;
	@ApiModelProperty(value = "用户名", required = true)
	private String userName;
	@ApiModelProperty(value = "用户ID", required = true)
	private Long userId;
	@ApiModelProperty(value = "求助标题", required = true)
	private String appealTitle;
	@ApiModelProperty(value = "求助相关图片", hidden = true)
	private List<AppealImg> appealImgList;
	@ApiModelProperty(value = "求助联系电话", required = true)
	private String phone;
	@ApiModelProperty(value = "求助内容", required = true)
	private String appealContent;
	@ApiModelProperty(value = "省份", required = true)
	private String province;
	@ApiModelProperty(value = "城市", required = true)
	private String city;
	@ApiModelProperty(value = "地区", required = true)
	private String district;
	@ApiModelProperty(value = "详细地址", required = true)
	private String fullAddress;
	@ApiModelProperty(value = "补充地址", required = false)
	private String appealMoreInfo;
	@ApiModelProperty(value = "求助奖励搜币", required = true)
	private Long souCoin;
	//求助的状态 0不确定帮助对象，1已确定帮助对象，2已完成,3已过时失效
	@ApiModelProperty(value = "求助状态： 0不确定帮助对象，1已确定帮助对象，2已完成,3已过时失效")
	private Integer appealStatus;
	@ApiModelProperty(value = "纬度", required = true)
	private Float latitude;
	@ApiModelProperty(value = "经度", required = true)
	private Float longitude;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "求助开始时间", required = true)
	private Date startTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "求助结束时间", required = true)
	private Date endTime;

	public String getUserName() { return userName; }

	public void setUserName(String userName) { this.userName = userName; }

	public Long getAppealId() { return appealId; }

	public void setAppealId(Long appealId) { this.appealId = appealId; }

	public Long getUserId() { return userId; }

	public void setUserId(Long userId) { this.userId = userId; }

	public String getAppealTitle() { return appealTitle; }

	public void setAppealTitle(String appealTitle) { this.appealTitle = appealTitle; }

	public List<AppealImg> getAppealImgList() { return appealImgList; }

	public void setAppealImgList(List<AppealImg> appealImgList) { this.appealImgList = appealImgList; }

	public String getPhone() { return phone; }

	public void setPhone(String phone) { this.phone = phone; }

	public String getAppealContent() { return appealContent; }

	public void setAppealContent(String appealContent) { this.appealContent = appealContent; }

	public String getProvince() { return province; }

	public void setProvince(String province) { this.province = province; }

	public String getCity() { return city; }

	public void setCity(String city) { this.city = city; }

	public String getDistrict() { return district; }

	public void setDistrict(String district) { this.district = district; }

	public String getFullAddress() { return fullAddress; }

	public void setFullAddress(String fullAddress) { this.fullAddress = fullAddress; }

	public String getAppealMoreInfo() { return appealMoreInfo; }

	public void setAppealMoreInfo(String appealMoreInfo) { this.appealMoreInfo = appealMoreInfo; }

	public Long getSouCoin() { return souCoin; }

	public void setSouCoin(Long souCoin) { this.souCoin = souCoin; }

	public Integer getAppealStatus() { return appealStatus; }

	public void setAppealStatus(Integer appealStatus) { this.appealStatus = appealStatus; }

	public Float getLatitude() { return latitude; }

	public void setLatitude(Float latitude) { this.latitude = latitude; }

	public Float getLongitude() { return longitude; }

	public void setLongitude(Float longitude) { this.longitude = longitude; }

	public Date getStartTime() { return startTime; }

	public void setStartTime(Date startTime) { this.startTime = startTime; }

	public Date getEndTime() {	return endTime;	}

	public void setEndTime(Date endTime) { this.endTime = endTime; }

	@Override
	public String toString() {
		return "Appeal [appealId=" + appealId + ", userId=" + userId + ",userName="+userName+", appealTitle=" + appealTitle
				+ ", appealImgList=" + appealImgList + ", phone=" + phone + ", appealContent=" + appealContent
				+ ", province=" + province + ", city=" + city + ", district=" + district + ", fullAddress="
				+ fullAddress + ", appealMoreInfo=" + appealMoreInfo + ", souCoin=" + souCoin + ", appealStatus="
				+ appealStatus + ", latitude=" + latitude + ", longitude=" + longitude + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

}
