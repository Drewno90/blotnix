package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.RoleRepository;
import entity.Role;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	public Role findOne(int id) {
		return roleRepository.findOne(id);
	}

	public Role findByName(String name) {
		return roleRepository.findByName(name);
	}
	
	public List<Role> findByUserName(String name) {
		return roleRepository.findByUserName(name);
	}
	
	public long count() {
		return roleRepository.count();
	}
}
