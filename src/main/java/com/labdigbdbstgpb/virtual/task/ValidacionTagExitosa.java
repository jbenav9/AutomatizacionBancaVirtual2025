package com.labdigbdbstgpb.virtual.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.*;
public class ValidacionTagExitosa implements Task{

    private final String tag;

    public ValidacionTagExitosa(String tag) {
        this.tag = tag;
    }

    public static TagAlfanumerico conTag(String tag) {
        return Tasks.instrumented(TagAlfanumerico.class, tag);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PAGAR_TRANSFERIR),
                Click.on(OPC_ENV_DIN),
                Click.on(OPC_TAG),
                Enter.theValue(tag).into(TXT_TAG),
                Click.on(BTN_CONTINUARTAG)
        );
    }

}
