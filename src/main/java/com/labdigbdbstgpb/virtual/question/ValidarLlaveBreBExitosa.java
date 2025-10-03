package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveExitosaBreBUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLlaveBreBExitosa implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ValidacionLlaveExitosaBreBUI.MSJ_LLAVE_BREB.resolveFor(actor).isVisible();

    }

    public static Question ValidarLlaveBreBExitosa(){
        return new ValidarLogin();
    }

}
