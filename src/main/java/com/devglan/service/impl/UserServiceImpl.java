package com.devglan.service.impl;


import com.devglan.model.User;
import com.devglan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
	
	/*
	 * @Autowired private UserDao userDao;
	 */
	
	@Autowired
	private User user;

	/*
	 * public UserDetails loadUserByUsername(String userId) throws
	 * UsernameNotFoundException { User user = userDao.findByUsername(userId);
	 * if(user == null){ throw new
	 * UsernameNotFoundException("Invalid username or password."); } return new
	 * org.springframework.security.core.userdetails.User(user.getUsername(),
	 * user.getPassword(), getAuthority()); }
	 * 
	 * private List<SimpleGrantedAuthority> getAuthority() { return
	 * Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")); }
	 */

	public List<User> findAll() {
		
		List<User> list = new ArrayList<>();
		user.setId(1);
		user.setUsername("Alex123");
		user.setAge(33);
		user.setSalary(3456);
		list.add(user);
		//userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	/*
	 * @Override public void delete(long id) { userDao.delete(id); }
	 * 
	 * @Override public User save(User user) { return userDao.save(user); }
	 */
}
