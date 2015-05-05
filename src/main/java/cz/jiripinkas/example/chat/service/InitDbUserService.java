package cz.jiripinkas.example.chat.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import cz.jiripinkas.example.chat.annotation.TransactionalRW;
import cz.jiripinkas.example.chat.entity.Role;
import cz.jiripinkas.example.chat.entity.User;
import cz.jiripinkas.example.chat.entity.UserRole;

@TransactionalRW
@Service
public class InitDbUserService {

	@PersistenceContext
	private EntityManager entityManager;

	public void init() {
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
