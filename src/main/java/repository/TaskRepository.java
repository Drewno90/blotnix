package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import entity.Task;

@Repository
public class TaskRepository {


		@PersistenceContext
		private EntityManager entityManager;

		public List<Task> list() {
			return entityManager
					.createNamedQuery(Task.FIND_ALL, Task.class)
					.getResultList();
		}

		public Task findOne(int id) {
//			return entityManager
//					.createNamedQuery(Chatroom.FIND_ONE, Chatroom.class)
//					.setParameter("id", id).getSingleResult();
			return entityManager.find(Task.class, id);
		}

		public void delete(int id) {
			entityManager.remove(entityManager.find(Task.class, id));
		}

		public void save(Task task) {
			if (task.getId() == 0) {
				entityManager.persist(task);
			} else {
				entityManager.merge(task);
			}
		}

		public void saveTask(Task task) {
			entityManager.persist(task);
		}

		public void deleteAll() {
			entityManager.createNativeQuery("delete from task")
					.executeUpdate();
		}

	}


