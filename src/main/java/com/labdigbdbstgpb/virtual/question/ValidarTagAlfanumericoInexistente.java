package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoInexistenteUI;
import com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTagAlfanumericoInexistente implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TagAlfanumericoInexistenteUI.MSJ_TAG_ALFANUMERICO_INEXISTENTE.resolveFor(actor).isVisible();

    }

    public static Question validarTagAlfanumericoInexistente(){
        return new ValidarLogin();
    }

}
