package in.nit.dao;

import java.util.List;


import in.nit.model.ShipmentTypeModel;

public interface IShipmentTypeDao {
	Integer saveShipmentType(ShipmentTypeModel ob);
	List<ShipmentTypeModel> getAllShipmentTypes();
	void deleteShipmentType(Integer id);
	ShipmentTypeModel getOneShipmentType(Integer id);
	void updateShipmentType(ShipmentTypeModel ob);
	public List<Object[]> getShipmentModeCount();

}
