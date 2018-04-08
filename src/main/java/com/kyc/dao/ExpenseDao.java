/**
 * 
 */
package com.kyc.dao;

import org.springframework.data.repository.CrudRepository;

import com.kyc.model.Expense;

/**
 * @author otocon
 *
 */
public interface ExpenseDao extends CrudRepository<Expense, Integer>, ExpenseDaoCustomMethods {

}
