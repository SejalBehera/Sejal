package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poTab")
public class PurchaseOrder {
	
	@Id
	@GeneratedValue
	@Column(name="poid")
	private Integer pOrderId;
	@Column(name="pocode")
	private String pOrderCode;
	@Column(name="refno")
	private int refNo;
	@Column(name="qacheck")
	private String qaCheck;
	@Column(name="status")
	private String dStatus;
	@Column(name="podesc")
	private String desc;
	
	public PurchaseOrder() {
		super();
	}

	public PurchaseOrder(Integer pOrderId) {
		super();
		this.pOrderId = pOrderId;
	}


	public Integer getpOrderId() {
		return pOrderId;
	}

	public void setpOrderId(Integer pOrderId) {
		this.pOrderId = pOrderId;
	}

	public String getpOrderCode() {
		return pOrderCode;
	}

	public void setpOrderCode(String pOrderCode) {
		this.pOrderCode = pOrderCode;
	}

	public int getRefNo() {
		return refNo;
	}

	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}

	public String getQaCheck() {
		return qaCheck;
	}

	public void setQaCheck(String qaCheck) {
		this.qaCheck = qaCheck;
	}

	public String getdStatus() {
		return dStatus;
	}

	public void setdStatus(String dStatus) {
		this.dStatus = dStatus;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [pOrderId=" + pOrderId + ", pOrderCode=" + pOrderCode + ", refNo=" + refNo + ", qaCheck="
				+ qaCheck + ", dStatus=" + dStatus + ", desc=" + desc + "]";
	}
	

	}