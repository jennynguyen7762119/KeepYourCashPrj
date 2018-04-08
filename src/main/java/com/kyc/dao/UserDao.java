package com.kyc.dao;

import org.springframework.data.repository.CrudRepository;

import com.kyc.model.User;

/**
 * 
 * @author otocon
 *
 */
public interface UserDao extends CrudRepository<User, Integer>, UserDaoCustomMethods {

}
