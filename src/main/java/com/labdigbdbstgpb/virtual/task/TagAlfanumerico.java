package com.labdigbdbstgpb.virtual.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.labdigbdbstgpb.virtual.utils.TipoIdentificacionUtil.obtenerTipoIdentificacion;
import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.labdigbdbstgpb.virtual.task.Login.con;

public class TagAlfanumerico implements Task {



    public static TagAlfanumerico con() {
        return Tasks.instrumented(TagAlfanumerico.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PAGAR_TRANSFERIR),
                Click.on(OPC_ENV_DIN),
                Click.on(OPC_TAG),
                Enter.theValue("@BBAAA813").into(TXT_TAG),
                Click.on(BTN_CONTINUARTAG)
        );
    }
}

