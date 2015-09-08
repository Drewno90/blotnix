package service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import annotation.TransactionalRW;
import entity.Role;
import entity.Task;
import entity.User;
import entity.UserRole;

@TransactionalRW
@Service
public class InitDbUserService {

	@PersistenceContext
	private EntityManager entityManager;

	public void init() {
		
		Map referenceData = new HashMap();
		Map<String,String> users = new LinkedHashMap<String,String>();
		users.put("admin", "Admin");
		users.put("guest", "Guest");
		users.put("konstruktor1", "Konstruktor1");
		
		referenceData.put("userList", users);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		userAdmin.setPassword("admin");
		userAdmin.setEmail("admin@o2.pl");
		entityManager.persist(userAdmin);
		
		
		User userGuest = new User();
		userGuest.setName("guest");
		userGuest.setPassword("guest");
		userGuest.setEmail("guest@o2.pl");
		entityManager.persist(userGuest);

		
		User userKonst = new User();
		userKonst.setName("konstruktor1");
		userKonst.setPassword("konst");
		userKonst.setEmail("konstr264@o2.pl");
		entityManager.persist(userKonst);
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		entityManager.persist(roleUser);

		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		entityManager.persist(roleAdmin);

		UserRole userRoleAdmin = new UserRole();
		userRoleAdmin.setRole(roleAdmin);
		userRoleAdmin.setUser(userAdmin);
		entityManager.persist(userRoleAdmin);

		UserRole userRoleUser = new UserRole();
		userRoleUser.setRole(roleUser);
		userRoleUser.setUser(userGuest);
		entityManager.persist(userRoleUser);

		UserRole userRoleUser2 = new UserRole();
		userRoleUser2.setRole(roleUser);
		userRoleUser2.setUser(userAdmin);
		entityManager.persist(userRoleUser2);

		UserRole userRoleUser3 = new UserRole();
		userRoleUser3.setRole(roleUser);
		userRoleUser3.setUser(userKonst);
		entityManager.persist(userRoleUser3);
	}
}
