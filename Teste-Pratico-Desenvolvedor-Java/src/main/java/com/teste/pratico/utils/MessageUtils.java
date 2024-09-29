package com.teste.pratico.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUtils {

    public static void addMessage( FacesMessage.Severity severity, String message ) {
        FacesContext.getCurrentInstance().addMessage( null,  new FacesMessage( severity, message, null ) );
    }

}
