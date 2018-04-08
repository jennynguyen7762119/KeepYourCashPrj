/**
 * 
 */
package com.kyc.dao;

import org.springframework.data.repository.CrudRepository;

import com.kyc.model.Income;

/**
 * @author otocon
 *
 */
public interface IncomeDao extends CrudRepository<Income, Integer>, IncomeDaoCustomMethods {

}
