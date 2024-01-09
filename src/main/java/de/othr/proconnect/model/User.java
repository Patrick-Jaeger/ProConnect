package de.othr.proconnect.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Size(min = 5, max = 20, message = "username has to be at least 5 characters long!")
	private String username;
	
	@NotBlank(message = "firstname must not be blank")
	private String firstname;
	
	@NotBlank(message = "lastname must not be blank")
	private String lastname;
	
	@NotBlank(message = "Email must not be blank!")
	private String email;

	@NotBlank(message = "Password must not be blank!")
	private String password;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	
	// optional ?
	private int phoneNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private List<Address> addresses;
	
	@OneToMany(mappedBy = "user") 
	private Set<UserChat> userChat;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
