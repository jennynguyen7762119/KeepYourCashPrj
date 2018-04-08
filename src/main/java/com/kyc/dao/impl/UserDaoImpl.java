/**
 * 
 */
package com.kyc.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kyc.dao.UserDaoCustomMethods;

/**
 * @author otocon
 *
 */
@Repository
public class UserDaoImpl implements UserDaoCustomMethods {
	@Autowired
    @Qualifier("associationEntityManager")
    private EntityManager entityManager;

}
