package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI;
import com.labdigbdbstgpb.virtual.userInterface.TagNumericoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTagNumerico implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return TagNumericoUI.MSJ_TAG_NUMERICO.resolveFor(actor).isVisible();

    }

    public static Question validarTagNumericoExitoso(){
        return new ValidarLogin();
    }

    public static Question validarLoginFallido(){
        return new ValidarLogin();
    }
}
