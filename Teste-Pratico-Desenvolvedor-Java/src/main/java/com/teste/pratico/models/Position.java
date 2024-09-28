package com.teste.pratico.models;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@AttributeOverride( name = "id", column = @Column ( name = "id" ) )
public class Position extends AbstractEntity {
	
	@Column( name = "inicio" )
	private final LocalDateTime startDate;
	
	@Column( name = "fim" )
	private final LocalDateTime endDate;
	
	@Column( name = "quantidade" )
	private final Integer quantity;

	public Position( LocalDateTime startDate, LocalDateTime endDate, Integer quantity ) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.quantity = quantity;
	}
	
}
