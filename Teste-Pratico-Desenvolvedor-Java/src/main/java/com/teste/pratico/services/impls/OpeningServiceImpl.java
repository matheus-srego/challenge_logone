package com.teste.pratico.services.impls;

import com.teste.pratico.utils.ValidationUtils;

import com.teste.pratico.models.Opening;
import com.teste.pratico.repositories.OpeningRepository;
import com.teste.pratico.services.OpeningService;
import org.springframework.stereotype.Service;

@Service
public class OpeningServiceImpl implements OpeningService {
	
	private final OpeningRepository openingRepository;

	public OpeningServiceImpl( OpeningRepository openingRepository ) {
		this.openingRepository = openingRepository;
	}

    @Override
	public Opening create( Opening opening ) {
		ValidationUtils.isValidOpening( opening );
		return openingRepository.save( opening );
		
	}

}
