package de.othr.proconnect.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class UserChat {
	
	@EmbeddedId UserChatKey id;
	
	@ManyToOne
	@MapsId("userId") 
	@JoinColumn(name = "user_id")
	User user;
	
	@ManyToOne
	@MapsId("userWithProfessionId") 
	@JoinColumn(name = "userwithprofession_id")
	UserWithProfession userWithProfession;
	
	@ManyToOne
	@MapsId("chatId") 
	@JoinColumn(name = "chat_id")
	Chat chat;

	public UserChatKey getId() {
		return id;
	}

	public void setId(UserChatKey id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserWithProfession getUserWithProfession() {
		return userWithProfession;
	}

	public void setUserWithProfession(UserWithProfession userWithProfession) {
		this.userWithProfession = userWithProfession;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}
	
}
