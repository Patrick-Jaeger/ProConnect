package de.othr.proconnect.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "userwithprofession")
public class UserWithProfession extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "userprofession",
			joinColumns = @JoinColumn(name="iduser"),
			inverseJoinColumns = @JoinColumn(name = "idprofession")
			)
	private List<Profession> profession = new ArrayList<Profession>();
	
	@OneToMany(mappedBy="userWithProfession") 
	private List<Appointment> appointment;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "timeslot_id", referencedColumnName = "id")
	private Timeslot timeslot;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paytopspot_id", referencedColumnName = "id")
	private PayTopspot payTopspot;

	public List<Profession> getProfession() {
		return profession;
	}

	public void setProfession(List<Profession> profession) {
		this.profession = profession;
	}
	
	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Timeslot getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(Timeslot timeslot) {
		this.timeslot = timeslot;
	}

	public PayTopspot getPayTopspot() {
		return payTopspot;
	}

	public void setPayTopspot(PayTopspot payTopspot) {
		this.payTopspot = payTopspot;
	}

}
