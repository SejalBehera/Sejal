package in.nit.dao;

import java.util.List;

import in.nit.model.UomTypeModel;



public interface IUomTypeDao {
	
	Integer saveUomType(UomTypeModel uom);
	List<UomTypeModel> getAllUomTypes();
	void deleteUomType(Integer id);
	UomTypeModel getOneUomType(Integer id);
	void updateUomType(UomTypeModel ob);

}
