package com.labdigbdbstgpb.virtual.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.labdigbdbstgpb.virtual.userInterface.EnviarDineroTagAlfanumericoYCtaAhUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.BTN_CONTINUARTAG;
import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.TXT_TAG;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ContinuarFlujoTagAlfanumerico implements Task{


    public static ContinuarFlujoTagAlfanumerico nuevamente() {
        return Tasks.instrumented(ContinuarFlujoTagAlfanumerico.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("@BBAAA813").into(TXT_TAG),
                Click.on(BTN_CONTINUARTAG),
                Enter.theValue("1212").into(TXT_VALOR),
                Click.on(CTAAHS),
                Click.on(BTNCONTINUARTAGENVIARDINERO),
                Click.on(BTNENVIARDINEROTAG),
                Click.on(BTNOTP),
                Click.on(BTNENVIARCODIGO),
                Enter.theValue("8").into(CAMPOOTP1),
                Enter.theValue("0").into(CAMPOOTP2),
                Enter.theValue("1").into(CAMPOOTP3),
                Enter.theValue("0").into(CAMPOOTP4),
                Enter.theValue("8").into(CAMPOOTP5),
                Enter.theValue("4").into(CAMPOOTP6),
                Click.on(BTNVERIFICAR),
                WaitUntil.the(MSJTRXEXITOSA, isVisible())
        );
    }



}
