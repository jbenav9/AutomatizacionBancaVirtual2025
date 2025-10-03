package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.TagCelularInexistenteUI;
import com.labdigbdbstgpb.virtual.userInterface.TagNumericoInexistenteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTagCelularInexistente {
    public Boolean answeredBy(Actor actor) {
        return TagCelularInexistenteUI.MSJ_TAG_CELULAR_INEXISTENTE.resolveFor(actor).isVisible();

    }

    public static Question ValidarTagCelularInexistente(){
        return new ValidarLogin();
    }
}
