package com.teste.pratico.models;

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
@Table( name = "solicitante" )
@AttributeOverride( name = "id", column = @Column ( name = "id" ) )
@NoArgsConstructor
public class Applicant extends AbstractEntity {
	
	@Column( name = "nome" )
	private String name;

	public Applicant( String name ) {
		this.name = name;
	}

}
