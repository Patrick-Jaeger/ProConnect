package de.othr.proconnect.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appoinment")
public class Appointment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST) //Was bedeutet PERSIST und was ALL
	@JoinColumn(name = "timeslot_id", referencedColumnName = "id")
	private Timeslot timeslot;
	
	@DateTimeFormat(pattern = "HH:mm dd") // das muss runterzählend implementiert werden
	private LocalDate ETA;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "userwithprofession_id", referencedColumnName = "id")
	private UserWithProfession userWithProfession;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timeslot getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(Timeslot timeslot) {
		this.timeslot = timeslot;
	}

	public LocalDate getETA() {
		return ETA;
	}

	public void setETA(LocalDate eTA) {
		ETA = eTA;
	}	
}