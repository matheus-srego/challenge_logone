package com.teste.pratico.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class AbstractEntity {
	
	@Id
	@Column( name = "id" )
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
}
