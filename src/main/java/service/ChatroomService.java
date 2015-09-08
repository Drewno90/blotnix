package service;

import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.ChatroomRepository;
import annotation.TransactionalRO;
import annotation.TransactionalRW;
import dto.ChatroomDto;
import entity.Chatmessage;
import entity.Chatroom;

@TransactionalRO
@Service
public class ChatroomService {

	@Autowired
	private ChatroomRepository chatroomRepository;

	@Autowired
	private DozerBeanMapper mapper;

	public List<Chatroom> getChatrooms() {
		return chatroomRepository.list();
	}

	public Chatroom findOne(int id) {
		return chatroomRepository.findOne(id);
	}

	public ChatroomDto findOneDto(int id) {
		Chatroom chatroom = chatroomRepository.findOne(id);
		return mapper.map(chatroom, ChatroomDto.class);
	}

	@TransactionalRW
	public void delete(int id) {
		chatroomRepository.delete(id);
	}

	@TransactionalRW
	public void save(Chatroom chatroom) {
		chatroomRepository.save(chatroom);
	}

	@Autowired
	private UserService userService;

	@TransactionalRW
	public void saveChatMessage(Chatmessage chatMessage, int id, String userName) {
		Chatroom chatroom = chatroomRepository.findOne(id);
		chatMessage.setChatroom(chatroom);
		chatMessage.setAddedDate(new Date());
		chatMessage.setUser(userService.findByName(userName));
		chatroomRepository.saveMessage(chatMessage);
	}

	public void deleteAll() {
		chatroomRepository.deleteAll();
	}
}
