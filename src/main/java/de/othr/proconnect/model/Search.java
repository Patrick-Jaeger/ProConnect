package de.othr.proconnect.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "search")
public class Search implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private Long searcherId;

	private String search;
	
	@DateTimeFormat(pattern = "HH:mm:ss dd:MM:yyyy")
	private LocalDate timestamp;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getSearcherId() {
		return searcherId;
	}
	
	public void setSearcherId(Long searcherId) {
		this.searcherId = searcherId;
	}

	public String getSearchText() {
		return search;
	}

	public void setSearchText(String search) {
		this.search = search;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}
