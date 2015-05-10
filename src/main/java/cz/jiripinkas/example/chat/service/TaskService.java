package cz.jiripinkas.example.chat.service;

import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.jiripinkas.example.chat.annotation.TransactionalRO;
import cz.jiripinkas.example.chat.annotation.TransactionalRW;
import cz.jiripinkas.example.chat.dto.TaskDto;
import cz.jiripinkas.example.chat.entity.Chatmessage;
import cz.jiripinkas.example.chat.entity.Task;
import cz.jiripinkas.example.chat.repository.TaskRepository;

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
