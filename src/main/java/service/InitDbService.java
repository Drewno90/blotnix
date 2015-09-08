package service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import annotation.TransactionalRW;
import entity.Chatroom;

@Service
public class InitDbService {

	@Autowired
	private ChatroomService chatroomService;

	@Autowired
	private InitDbUserService initDbUserService;

	@TransactionalRW
	@PostConstruct
	// initialize database each day
	@Scheduled(fixedDelay = 86400000, initialDelay = 86400000)
	public void init() {
		System.out.println("*** START INIT DATABASE ***");
		chatroomService.deleteAll();
		
		initDbUserService.init();
		
		{
			Chatroom chatroom = new Chatroom();
			chatroom.setName("Konstruktorzy");
		//	chatroom.setDescription("");
			chatroomService.save(chatroom);
		}

		{
			Chatroom chatroom = new Chatroom();
			chatroom.setName("Technolodzy");
		//	chatroom.setDescription("How to code like a pro :)");
			chatroomService.save(chatroom);
		}

		{
			Chatroom chatroom = new Chatroom();
			chatroom.setName("Analitycy MES");
	//		chatroom.setDescription("Is it a boy or a woman?");
			chatroomService.save(chatroom);
		}
		System.out.println("*** FINISH INIT DATABASE ***");
	}
}
