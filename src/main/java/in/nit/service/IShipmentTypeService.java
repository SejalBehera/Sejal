package in.nit.service;

import java.util.List;


import in.nit.model.ShipmentTypeModel;

public interface IShipmentTypeService {
	Integer saveShipmentType(ShipmentTypeModel ob);
	List<ShipmentTypeModel> getAllShipmentTypes();
	void deleteShipmentType(Integer id);
	ShipmentTypeModel getOneShipmentType(Integer id);
	void updateShipmentType(ShipmentTypeModel ob);
	public List<Object[]> getShipmentModeCount();


}
