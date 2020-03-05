
package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhUserTypeDao;

import in.nit.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveWhuType(WhUserType whu) {
		Integer id=(Integer) ht.save(whu);
		return id;
	}

	@Override
	public List<WhUserType> getAllWhuTypes() {
		return ht.loadAll(WhUserType.class);

	}

	@Override
	public void deleteWhuType(Integer id) {
		ht.delete(new WhUserType(id));

	}

}
