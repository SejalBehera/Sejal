package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whutab")
public class WhUserType {
	
	@Id
	@GeneratedValue
	@Column(name="whuid")
	private Integer whuId;
	@Column(name="utype")
	private String whuType;
	@Column(name="ucode")
	private String whuCode;
	@Column(name="ufor")
	private String whuFor;
	@Column(name="uemail")
	private String whuEmail;
	@Column(name="ucntct")
	private int whuCntct;
	@Column(name="uidtype")
	private String whuIdType;
	@Column(name="uother")
	private String whuOther;
	@Column(name="uidno")
	private int whuIdNo;
	
	public WhUserType() {
		super();
	}
	public WhUserType(Integer whuId) {
		super();
		this.whuId = whuId;
	}
	public Integer getWhuId() {
		return whuId;
	}
	public void setWhuId(Integer whuId) {
		this.whuId = whuId;
	}
	public String getWhuType() {
		return whuType;
	}
	public void setWhuType(String whuType) {
		this.whuType = whuType;
	}
	public String getWhuCode() {
		return whuCode;
	}
	public void setWhuCode(String whuCode) {
		this.whuCode = whuCode;
	}
	public String getWhuFor() {
		return whuFor;
	}
	public void setWhuFor(String whuFor) {
		this.whuFor = whuFor;
	}
	public String getWhuEmail() {
		return whuEmail;
	}
	public void setWhuEmail(String whuEmail) {
		this.whuEmail = whuEmail;
	}
	public int getWhuCntct() {
		return whuCntct;
	}
	public void setWhuCntct(int whuCntct) {
		this.whuCntct = whuCntct;
	}
	public String getWhuIdType() {
		return whuIdType;
	}
	public void setWhuIdType(String whuIdType) {
		this.whuIdType = whuIdType;
	}
	public String getWhuOther() {
		return whuOther;
	}
	public void setWhuOther(String whuOther) {
		this.whuOther = whuOther;
	}
	public int getWhuIdNo() {
		return whuIdNo;
	}
	public void setWhuIdNo(int whuIdNo) {
		this.whuIdNo = whuIdNo;
	}
	@Override
	public String toString() {
		return "WhUserType [whuId=" + whuId + ", whuType=" + whuType + ", whuCode=" + whuCode + ", whuFor=" + whuFor
				+ ", whuEmail=" + whuEmail + ", whuCntct=" + whuCntct + ", whuIdType=" + whuIdType + ", whuOther="
				+ whuOther + ", whuIdNo=" + whuIdNo + "]";
	}
	


}
