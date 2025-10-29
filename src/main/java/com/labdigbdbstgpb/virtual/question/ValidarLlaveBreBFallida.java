package com.labdigbdbstgpb.virtual.question;

import com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveExitosaBreBUI;
import com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveFallidaBreBUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLlaveBreBFallida implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ValidacionLlaveFallidaBreBUI.MSJ_LLAVE_NO_EXISTE.resolveFor(actor).isVisible();

    }

    public static Question ValidarLlaveBreBFallida(){
        return new ValidarLogin();
    }
}
