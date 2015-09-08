package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repository.RoleRepository;
import repository.UserRepository;
import entity.Role;
import entity.User;

@Transactional
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void delete(int id) {
		userRepository.delete(id);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	 public List<User> findByRoleName(String name) {
		 return userRepository.findByRoleName(name);
	 }

	public long count() {
		return userRepository.count();
	}
	
	@Autowired
	private RoleRepository roleRepository;

	public void add(User user) {
		userRepository.add(user);
		Role role = roleRepository.findByName("ROLE_USER");
		roleRepository.assignRole(user, role);
	}

	public void edit(User user) {
		userRepository.update(user);
	}

}
