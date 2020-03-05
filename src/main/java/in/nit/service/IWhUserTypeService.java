package in.nit.service;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeService {
	
	Integer saveWhuType(WhUserType whu);
	List<WhUserType> getAllWhuTypes();
	void deleteWhuType(Integer id);

}
