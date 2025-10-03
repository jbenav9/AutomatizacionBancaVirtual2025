package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoInexistenteUI;
import com.labdigbdbstgpb.virtual.userInterface.TagNumericoInexistenteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTagNumericoInexistente implements Question {
    public Boolean answeredBy(Actor actor) {
        return TagNumericoInexistenteUI.MSJ_TAG_NUMERICO_INEXISTENTE.resolveFor(actor).isVisible();

    }

    public static Question ValidarTagNumericoInexistente(){
        return new ValidarLogin();
    }
}
