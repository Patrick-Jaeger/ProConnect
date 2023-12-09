package de.othr.proconnect.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UserChatKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "user_id")
	Long userId;

	@Column(name = "userwithprofession_id")
	Long userWithProfessionId;
	
	@Column(name = "chat_id")
	Long chatId;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserWithProfessionId() {
		return userWithProfessionId;
	}

	public void setUserWithProfessionId(Long userWithProfessionId) {
		this.userWithProfessionId = userWithProfessionId;
	}

	public Long getChatId() {
		return chatId;
	}

	public void setChatId(Long chatId) {
		this.chatId = chatId;
	}
}
