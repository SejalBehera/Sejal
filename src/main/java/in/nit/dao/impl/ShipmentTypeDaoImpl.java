package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentTypeModel;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveShipmentType(ShipmentTypeModel ob) {
		Integer id=(Integer) ht.save(ob);
		return id;
	}

	@Override
	public List<ShipmentTypeModel> getAllShipmentTypes() {
		return ht.loadAll(ShipmentTypeModel.class);

	}

	@Override
	public void deleteShipmentType(Integer id) {
		ht.delete(new ShipmentTypeModel(id));

	}

	@Override
	public ShipmentTypeModel getOneShipmentType(Integer id) {
		return ht.get(ShipmentTypeModel.class,id);
	}

	@Override
	public void updateShipmentType(ShipmentTypeModel ob) {
		ht.update(ob);

	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Object[]> getShipmentModeCount() {
		String hql= " select shipMode , count (shipMode) "
	                + " from in.nit.model.ShipmentTypeModel " +
			         " group by shipMode ";
		return (List<Object[]>)ht.find(hql);
	}

}
