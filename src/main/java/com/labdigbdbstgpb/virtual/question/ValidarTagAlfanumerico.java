package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTagAlfanumerico implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TagAlfanumericoUI.MSJ_TAG.resolveFor(actor).isVisible();

    }

    public static Question validarTagAlfanumericoExitoso(){
        return new ValidarLogin();
    }

    public static Question validarLoginFallido(){
        return new ValidarLogin();
    }

}
