/**
 * 
 */
package com.kyc.dao;

import org.springframework.data.repository.CrudRepository;

import com.kyc.model.IncomeCategory;

/**
 * @author otocon
 *
 */
public interface IncomeCategoryDao extends CrudRepository<IncomeCategory, Integer>, IncomeCategoryDaoCustomMethods {

}
