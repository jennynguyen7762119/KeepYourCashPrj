/**
 * 
 */
package com.kyc.service;

import java.io.Serializable;
import java.util.List;

import com.kyc.model.User;

/**
 * @author otocon
 *
 */
public interface UserService extends Serializable {

	List<User> getAllUser();
}
