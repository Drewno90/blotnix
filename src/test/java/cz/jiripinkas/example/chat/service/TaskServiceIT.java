package cz.jiripinkas.example.chat.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.example.chat.entity.Task;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-config.xml")
@Transactional
public class TaskServiceIT {

	@Autowired
	private TaskService taskService;

	@Test
	public void testSave() {
		int size = taskService.getTasks().size();
		Task task = new Task();
		taskService.save(task);
		assertEquals(size + 1, taskService.getTasks().size());
	}

}
