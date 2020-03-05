package in.nit.dao;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeDao {
	
	Integer saveWhuType(WhUserType whu);
	List<WhUserType> getAllWhuTypes();
	void deleteWhuType(Integer id);



}
