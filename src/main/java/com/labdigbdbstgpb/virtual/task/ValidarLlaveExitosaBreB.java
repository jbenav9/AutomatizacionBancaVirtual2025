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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ValidarLlaveExitosaBreB implements Task {

    private final String llaveBreB;

    public ValidarLlaveExitosaBreB(String llaveBreB) {
        this.llaveBreB = llaveBreB;
    }

    public static ValidarLlaveExitosaBreB conLlaveBreB(String llaveBreB) {
        return Tasks.instrumented(ValidarLlaveExitosaBreB.class, llaveBreB);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PAGAR_TRANSFERIR),
                Click.on(OPC_ENV_DIN),
                Click.on(OPC_BREB),
                WaitUntil.the(TXT_LLAVE_BREB, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(llaveBreB).into(TXT_LLAVE_BREB),
                Click.on(BTN_CONSULTAR_LLAVE_BREB),
                WaitUntil.the(MSJ_LLAVE_EXITOSA, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("12121").into(TXT_VALOR_BREB),
                Click.on(SELECCIONAR_CUENTA)





                );
//
//        // Ingreso del token si está visible
//        Performable[] accionesToken = TokenUtil.ingresarTokenSiVisible(actor, "8", "0", "1", "0", "8", "4").toArray(new Performable[0]);
//        if (accionesToken.length > 0) {
//            actor.attemptsTo(accionesToken);
//        }

//        // Continuar con la validación de la llave
//        actor.attemptsTo(
//                WaitUntil.the(llaveBreB, isVisible()).forNoMoreThan(10).seconds(),
//                Enter.theValue(llaveBreB).into(INGRESAR_LLAVE_BREB),
//                Click.on(BOTON_CONSULTAR_LLAVE)
//        );
    }
}
