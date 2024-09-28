package com.teste.pratico.models;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "agendamento" )
@AttributeOverride( name = "id", column = @Column ( name = "id" ) )
public class Appointment extends AbstractEntity {
	
	@Column( name = "data", nullable = false )
	private final LocalDateTime date;
	
	@Column( name = "numero", length = 20 )
	private final String number;
	
	@Column( name = "motivo", length = 255 )
	private final String reason;
	
	@ManyToOne( fetch = FetchType.LAZY )
	@JoinColumn( name = "solicitante_id" )
	private final Applicant applicant;

	public Appointment( LocalDateTime date, String number, String reason, Applicant applicant ) {
		this.date = date;
		this.number = number;
		this.reason = reason;
		this.applicant = applicant;
	}

}
