package com.labdigbdbstgpb.virtual.task;

import com.labdigbdbstgpb.virtual.utils.TokenUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.MSJ_INICIO;
import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.TXT_TAG;
import static com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveExitosaBreBUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveFallidaBreBUI.BTN_ENTENDIDO;
import static com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveFallidaBreBUI.MSJ_LLAVE_NO_EXISTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ValidarLlaveFallidaBreB implements Task {

    private final String llaveBreBFallida;

    public ValidarLlaveFallidaBreB(String llaveBreBFallida) {
        this.llaveBreBFallida = llaveBreBFallida;
    }

    public static ValidarLlaveFallidaBreB conLlaveBreBFallida(String llaveBreBFallida) {
        return Tasks.instrumented(ValidarLlaveFallidaBreB.class, llaveBreBFallida);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PAGAR_TRANSFERIR),
                Click.on(OPC_ENV_DIN),
                Click.on(OPC_BREB),
                WaitUntil.the(TXT_LLAVE_BREB, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(llaveBreBFallida).into(TXT_LLAVE_BREB),
                Click.on(BTN_CONSULTAR_LLAVE_BREB),
                WaitUntil.the(MSJ_LLAVE_NO_EXISTE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_ENTENDIDO)
        );
}
}
