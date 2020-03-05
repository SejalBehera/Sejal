package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {
	
	@Autowired
	private IWhUserTypeDao dao;

	@Override
	@Transactional
	public Integer saveWhuType(WhUserType whu) {
		return dao.saveWhuType(whu);
	}

	@Override
	@Transactional
	public List<WhUserType> getAllWhuTypes() {
		List<WhUserType> list=dao.getAllWhuTypes();
		Collections.sort(list,(o1,o2)->o1.getWhuId()-o2.getWhuId());
		return list;
	}

	@Override
	@Transactional
	public void deleteWhuType(Integer id) {
		dao.deleteWhuType(id);
	}

}
