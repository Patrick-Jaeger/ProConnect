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
@Table(name = "paytopspot")
public class PayTopspot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private boolean payed;
	
	@DateTimeFormat(pattern = "HH:mm:ss dd-MM-yyyy")
	private LocalDate payedWhen;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean hasPayed() {
		return payed;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
	}

	public LocalDate getPayedWhen() {
		return payedWhen;
	}

	public void setPayedWhen(LocalDate payedWhen) {
		this.payedWhen = payedWhen;
	}
}
