package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IUomTypeDao;

import in.nit.model.UomTypeModel;
import in.nit.service.IUomTypeService;

@Service
public class UomTypeServiceImpl implements IUomTypeService {
	
	@Autowired
	private IUomTypeDao dao;

	@Override
	@Transactional
	public Integer saveUomType(UomTypeModel uom) {
		return dao.saveUomType(uom);
	}

	@Override
	@Transactional
	public List<UomTypeModel> getAllUomTypes() {
		List<UomTypeModel> list=dao.getAllUomTypes();
		Collections.sort(list,(o1,o2)->o1.getUomId()-o2.getUomId());
		return list;
	}

	@Override
	@Transactional
	public void deleteUomType(Integer id) {
		dao.deleteUomType(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public UomTypeModel getOneUomType(Integer id) {
		return dao.getOneUomType(id);
	}

	@Override
	@Transactional
	public void updateUomType(UomTypeModel ob) {
		dao.updateUomType(ob);
		
	}

}
