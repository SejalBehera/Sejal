package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uomtab")
public class UomTypeModel {
	
	@Id
	@GeneratedValue
	@Column(name="uomid")
	private Integer uomId;
	@Column(name="uomtype")
	private String uomType;
	@Column(name="model")
	private String uomModel;
	@Column(name="udesc")
	private String uomDesc;
	
	public UomTypeModel() {
		super();
	}
	

	public UomTypeModel(Integer uomId) {
		super();
		this.uomId = uomId;
	}


	public Integer getUomId() {
		return uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getUomModel() {
		return uomModel;
	}

	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}

	public String getUomDesc() {
		return uomDesc;
	}

	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}

	@Override
	public String toString() {
		return "UomTypeModel [uomId=" + uomId + ", uomType=" + uomType + ", uomModel=" + uomModel + ", uomDesc="
				+ uomDesc + "]";
	}
	

}
