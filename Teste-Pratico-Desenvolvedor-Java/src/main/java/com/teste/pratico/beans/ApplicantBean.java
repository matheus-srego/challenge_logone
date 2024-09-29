package com.teste.pratico.beans;

import com.teste.pratico.models.Applicant;
import com.teste.pratico.services.ApplicantService;
import com.teste.pratico.utils.MessageUtils;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Component
@ViewScoped
public class ApplicantBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private Applicant applicant;

    private final ApplicantService applicantService;

    public ApplicantBean( ApplicantService applicantService ) {
        this.applicantService = applicantService;
        applicant = new Applicant();
    }

    public void create() {
        applicantService.create(applicant);
        MessageUtils.addMessage(FacesMessage.SEVERITY_INFO, "solicitante criado com sucesso!");
    }

}
