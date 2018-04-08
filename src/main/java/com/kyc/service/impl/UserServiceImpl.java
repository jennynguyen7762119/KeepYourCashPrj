/**
 * 
 */
package com.kyc.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyc.dao.UserDao;
import com.kyc.model.User;
import com.kyc.service.UserService;

/**
 * @author otocon
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2420872279915303276L;
	
	@Autowired
	private UserDao userDao;

	
	public List<User> getAllUser() {
		List<User> result = null;
		try {
			result = this.userDao.findAllUser();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

}
