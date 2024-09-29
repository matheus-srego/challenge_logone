package com.teste.pratico.services.impls;

import com.teste.pratico.models.Applicant;
import com.teste.pratico.repositories.ApplicantRepository;
import com.teste.pratico.services.ApplicantService;
import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    private ApplicantRepository applicantRepository;

    public ApplicantServiceImpl( ApplicantRepository applicantRepository ) {
        this.applicantRepository = applicantRepository;
    }

    public Applicant create(Applicant applicant) {
        return applicantRepository.save(applicant);
    }
}
