package com.teste.pratico.beans;

import com.teste.pratico.dtos.OpeningDTO;
import com.teste.pratico.models.Opening;
import com.teste.pratico.services.OpeningService;
import com.teste.pratico.utils.CONSTANTS;
import com.teste.pratico.utils.MessageUtils;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Component
@ViewScoped
public class OpeningBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Setter
    @Getter
    private OpeningDTO openingDTO;

    private final OpeningService openingService;

    public OpeningBean( OpeningService openingService ) {
        this.openingDTO = new OpeningDTO();
        this.openingService = openingService;
    }

    public void create() {
        final Opening opening = new Opening( openingDTO.getStartDate(), openingDTO.getEndDate(), openingDTO.getQuantity() );

        try {
            openingService.create( opening );
            MessageUtils.addMessage( FacesMessage.SEVERITY_INFO, CONSTANTS.CREATE_SUCCESS_OPENING );
            openingDTO = new OpeningDTO();
        }
        catch (IllegalArgumentException exception) {
            MessageUtils.addMessage(FacesMessage.SEVERITY_ERROR, exception.getMessage() );
        }
    }

}
