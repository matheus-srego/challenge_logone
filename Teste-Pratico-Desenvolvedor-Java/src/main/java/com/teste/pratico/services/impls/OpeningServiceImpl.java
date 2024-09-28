package com.teste.pratico.services.impls;

import com.teste.pratico.utils.ValidationUtils;
import org.jvnet.hk2.annotations.Service;

import com.teste.pratico.models.Opening;
import com.teste.pratico.repositories.OpeningRepository;
import com.teste.pratico.services.OpeningService;

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
