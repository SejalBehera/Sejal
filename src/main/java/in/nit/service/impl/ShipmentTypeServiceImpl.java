package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentTypeModel;
import in.nit.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
	
	@Autowired
	private IShipmentTypeDao dao;

	@Transactional
	public Integer saveShipmentType(ShipmentTypeModel ob) {
		return dao.saveShipmentType(ob);
	}

	@Transactional(readOnly=true)
	public List<ShipmentTypeModel> getAllShipmentTypes() {
		List<ShipmentTypeModel> list=dao.getAllShipmentTypes();
		Collections.sort(list,(o1,o2)->o1.getShipId()-o2.getShipId());
		return list;
	}

	@Transactional
	public void deleteShipmentType(Integer id) {
		dao.deleteShipmentType(id);
		
	}

	@Transactional(readOnly=true)
	public ShipmentTypeModel getOneShipmentType(Integer id) {
		return dao.getOneShipmentType(id);
	}

	@Transactional
	public void updateShipmentType(ShipmentTypeModel ob) {
		dao.updateShipmentType(ob);
	}

	@Transactional(readOnly=true)
	public List<Object[]> getShipmentModeCount() {
		return dao.getShipmentModeCount();
		
	}

}
