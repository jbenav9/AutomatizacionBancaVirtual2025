package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.TagCorreoUI;
import com.labdigbdbstgpb.virtual.userInterface.TagNumericoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTagCorreo implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TagCorreoUI.MSJ_TAG_CORREO.resolveFor(actor).isVisible();

    }

    public static Question validarTagCorreoExitoso(){
        return new ValidarLogin();
    }


}
