package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.TagCelularUI;
import com.labdigbdbstgpb.virtual.userInterface.TagCorreoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTagCelular implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TagCelularUI.MSJ_TAG_CELULAR.resolveFor(actor).isVisible();

    }

    public static Question validarTagCelularExitoso(){
        return new ValidarLogin();
    }
}
