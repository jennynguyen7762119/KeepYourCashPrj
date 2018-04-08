/**
 * 
 */
package com.kyc.dao;

import org.springframework.data.repository.CrudRepository;

import com.kyc.model.ExpenseCategory;

/**
 * @author otocon
 *
 */
public interface ExpenseCategoryDao extends CrudRepository<ExpenseCategory, Integer>, ExpenseCategoryDaoCustomMethods {

}
