package com.entity;

import com.auth0.jwt.internal.com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Help {

	@ApiModelProperty(value = "帮助ID，创建时不填，修改信息时必填")
	private Long helpId;
	@ApiModelProperty(value = "用户名", required = true)
	private String userName;

	@ApiModelProperty(value = "求助ID", required = true)
	private Long appealId;

	@ApiModelProperty(value = "求助标题", required = true)
	private String appealTitle;
	@ApiModelProperty(value = "帮助者用户id", hidden = true)
	private Long userId;
	 // 帮助状态 0求助用户未确定帮助对象，1已接受帮助， 2已完成，3已失效
	@ApiModelProperty(value = "帮助状态 0求助用户未确定帮助对象，1已接受帮助， 2已完成，3已失效")
	private Integer helpStatus;
	//完成程度分，范围：0-5分整数
	@ApiModelProperty(value = "完成程度分，范围：0-5分整数")
	private Integer completion;
	//效率分，范围：0-5分整数
	@ApiModelProperty(value = "效率分，范围：0-5分整数")
	private Integer efficiency;
	//态度分，范围：0-5分整数
	@ApiModelProperty(value = "态度分，范围：0-5分整数")
	private Integer attitude;
	//之前的平均完成程度分，范围：0-5分保留一位小数
	@ApiModelProperty(value = "之前的平均完成程度分，范围：0-5分保留一位小数", hidden = true)
	private Float avgCompletion;
	//之前的平均效率分，范围：0-5分保留一位小数
	@ApiModelProperty(value = "之前的平均完成效率分，范围：0-5分保留一位小数", hidden = true)
	private Float avgEfficiency;
	//之前的平均态度分，范围：0-5分保留一位小数
	@ApiModelProperty(value = "之前的平均完成态度分，范围：0-5分保留一位小数", hidden = true)
	private Float avgAttitude;

	@ApiModelProperty(value = "获得的总搜币数量")
	private Long allCoin;
	// 追加赏金
	@ApiModelProperty(value = "追加赏金")
	private Long additionalCoin;

	@ApiModelProperty(value = "失效时间", hidden = true)

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	
	/*@ApiModelProperty(value = "帮助者信息", hidden = true)
	private PersonInfo personInfo;*/

	@ApiModelProperty(value = "评论")
	private String commentInfo;

	public String getCommentInfo() {
		return commentInfo;
	}

	public void setCommentInfo(String commentInfo) {
		this.commentInfo = commentInfo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Float getAvgCompletion() {
		return avgCompletion;
	}

	public void setAvgCompletion(Float avgCompletion) {
		this.avgCompletion = avgCompletion;
	}

	public Float getAvgEfficiency() {
		return avgEfficiency;
	}

	public void setAvgEfficiency(Float avgEfficiency) {
		this.avgEfficiency = avgEfficiency;
	}

	public Float getAvgAttitude() {
		return avgAttitude;
	}

	public void setAvgAttitude(Float avgAttitude) {
		this.avgAttitude = avgAttitude;
	}

	public Long getHelpId() {
		return helpId;
	}

	public void setHelpId(Long helpId) {
		this.helpId = helpId;
	}

	public Long getAppealId() {
		return appealId;
	}

	public void setAppealId(Long appealId) {
		this.appealId = appealId;
	}

	public String getAppealTitle() {
		return appealTitle;
	}

	public void setAppealTitle(String appealTitle) {
		this.appealTitle = appealTitle;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getHelpStatus() {
		return helpStatus;
	}

	public void setHelpStatus(Integer helpStatus) {
		this.helpStatus = helpStatus;
	}

	public Integer getCompletion() {
		return completion;
	}

	public void setCompletion(Integer completion) {
		this.completion = completion;
	}

	public Integer getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(Integer efficiency) {
		this.efficiency = efficiency;
	}

	public Integer getAttitude() {
		return attitude;
	}

	public void setAttitude(Integer attitude) {
		this.attitude = attitude;
	}

	public Long getAllCoin() {
		return allCoin;
	}

	public void setAllCoin(Long allCoin) {
		this.allCoin = allCoin;
	}

	public Long getAdditionalCoin() {
		return additionalCoin;
	}

	public void setAdditionalCoin(Long additionalCoin) {
		this.additionalCoin = additionalCoin;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/*public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
*/
	@Override
	public String toString() {
		return "Help [helpId=" + helpId + ", appealId=" + appealId + ", appealTitle=" + appealTitle + ", userId="
				+ userId + ", helpStatus=" + helpStatus + ", completion=" + completion + ", efficiency=" + efficiency
				+ ", attitude=" + attitude + ", avgCompletion=" + avgCompletion + ", avgEfficiency=" + avgEfficiency
				+ ", avgAttitude=" + avgAttitude + ", allCoin=" + allCoin + ", additionalCoin=" + additionalCoin
				+ ", endTime=" + endTime +", commentInfo=" + commentInfo+ ",userName=" + userName + "]";
	}

}
