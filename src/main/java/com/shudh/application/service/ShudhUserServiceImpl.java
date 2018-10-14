package com.shudh.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shudh.application.dao.ShudhUserDao;
import com.shudh.application.model.ShudhUser;

/**
* <h1>Shudh Applications Backend</h1><br>
* 
* <h1>Class Name:/h1> ShudhUserService<br>
* 
* <h2>This service class consists all CRUD methods and business logic method related to ShudhUser</h2>
* 
*
* @author  Utkarsh Gupta
* @version 1.0
* @since   14-10-2018
*/
@Service
public class ShudhUserServiceImpl implements ShudhUserService {

	@Autowired
	private ShudhUserDao shudhUserDao;
	
	/**
	* <h1>Shudh Applications Backend</h1>
	* <h2>This method returns a list of ShudhUser objects from the database witha given range.</h2>
	* 
	*
	* @author  Utkarsh Gupta
	* @version 1.0
	* @since   14-10-2018
	*/
	@Override
	public List<ShudhUser> getAllShudhUser(Integer start, Integer end) {
		
		@SuppressWarnings("unchecked")
		List<ShudhUser> getShudhUsers = (List<ShudhUser>) (List<?>) shudhUserDao.getAllEntities(0, 20);
		
		return getShudhUsers;
	}

	@Override
	public ShudhUser getShudhUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShudhUser createShudhUser(ShudhUser shudhUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShudhUser updateShudhUSer(ShudhUser shudhUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShudhUser deleteShudhUser(ShudhUser shudhUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShudhUser> getAllShudhUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
