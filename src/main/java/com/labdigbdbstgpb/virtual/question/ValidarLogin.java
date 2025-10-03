package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLogin implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaLoginUI.MSJ_INICIO.resolveFor(actor).isVisible()
                ||  PaginaLoginUI.MSJ_LOGIN.resolveFor(actor).isVisible();
    }

    public static Question validarLoginExitoso(){
        return new ValidarLogin();
    }

    public static Question validarLoginFallido(){
        return new ValidarLogin();
    }
}
