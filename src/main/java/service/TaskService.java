package service;

import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.TaskRepository;
import annotation.TransactionalRO;
import annotation.TransactionalRW;
import dto.TaskDto;
import entity.Chatmessage;
import entity.Task;

@TransactionalRO
@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private DozerBeanMapper mapper;

	public List<Task> getTasks() {
		return taskRepository.list();
	}

	public Task findOne(int id) {
		return taskRepository.findOne(id);
	}

	public TaskDto findOneDto(int id) {
		Task task = taskRepository.findOne(id);
		return mapper.map(task, TaskDto.class);
	}

	@TransactionalRW
	public void delete(int id) {
		taskRepository.delete(id);
	}

	@TransactionalRW
	public void save(Task task) {
		taskRepository.save(task);
	}

	@Autowired
	private UserService userService;

	public void deleteAll() {
		taskRepository.deleteAll();
	}
}
