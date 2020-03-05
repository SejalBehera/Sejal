package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomTypeDao;

import in.nit.model.UomTypeModel;

@Repository
public class UomTypeDaoImpl implements IUomTypeDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUomType(UomTypeModel uom) {
		Integer id=(Integer) ht.save(uom);
		return id;
	}

	@Override
	public List<UomTypeModel> getAllUomTypes() {
		return ht.loadAll(UomTypeModel.class);
	}

	@Override
	public void deleteUomType(Integer id) {
		ht.delete(new UomTypeModel(id));
		
	}

	@Override
	public UomTypeModel getOneUomType(Integer id) {
		return ht.get(UomTypeModel.class,id);
	}

	@Override
	public void updateUomType(UomTypeModel ob) {
		ht.update(ob);
		
	}

}
