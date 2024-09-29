package com.teste.pratico.models;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "vagas" )
@AttributeOverride( name = "id", column = @Column ( name = "id" ) )
@NoArgsConstructor
public class Opening extends AbstractEntity {
	
	@Column( name = "inicio" )
	private LocalDateTime startDate;
	
	@Column( name = "fim" )
	private LocalDateTime endDate;
	
	@Column( name = "quantidade" )
	private Integer quantity;

	public Opening( LocalDateTime startDate, LocalDateTime endDate, Integer quantity ) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.quantity = quantity;
	}
	
}
