package com.teste.pratico.utils;

import com.teste.pratico.models.Opening;

import java.time.LocalDateTime;

public class ValidationUtils {

	public static void isValidOpening( Opening opening ) {
		if( opening.getStartDate().isBefore( LocalDateTime.now() ) || opening.getEndDate().isBefore( LocalDateTime.now() ) ) {
			throw new IllegalArgumentException( CONSTANTS.EXCEPTION_START_CANNOT_BE_PAST );
		}
	}

}
