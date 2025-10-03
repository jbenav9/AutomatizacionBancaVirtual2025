package com.labdigbdbstgpb.virtual.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.labdigbdbstgpb.virtual.userInterface.EnviarDineroTagAlfanumericoYCtaAhUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnviarDineroTagAlafanumericoYCtaAh implements Task {
    private final String tipoIdentificacion;
    private final String usuario;
    private final String clave;

    public EnviarDineroTagAlafanumericoYCtaAh(String tipoIdentificacion, String usuario, String clave) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.usuario = usuario;
        this.clave = clave;

    }

    public static EnviarDineroTagAlafanumericoYCtaAh con(String tipoIdentificacion, String usuario, String clave) {
        return Tasks.instrumented(EnviarDineroTagAlafanumericoYCtaAh.class, tipoIdentificacion, usuario, clave);

    }

    private Target obtenerTipoIdentificacion(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "CC" -> VALORES_IDENTI_CC;
            case "CE" -> VALORES_IDENTI_CE;
            case "PA" -> VALORES_IDENTI_PA;
            default -> throw new IllegalArgumentException("Tipo de identificación no soportado: " + tipo);
        };
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Login.con(tipoIdentificacion, usuario, clave),
                Click.on(BTN_INGRESAR),
                WaitUntil.the(MSJ_INICIO, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BTN_PAGAR_TRANSFERIR),
                Click.on(OPC_ENV_DIN),
                Click.on(OPC_TAG),
                Enter.theValue("@BBAAA813").into(TXT_TAG),
                Click.on(BTN_CONTINUARTAG),
                Enter.theValue("1212").into(TXT_VALOR),
                Click.on(CTAAHS),
                //RefrescarPagina.ahora(),
                NavegarAtrasSiPaginaEstaEnBlanco.verificar(),
                //WaitUntil.the(CTAAHS, isVisible()).forNoMoreThan(5).seconds(),
                ContinuarFlujoTagAlfanumerico.nuevamente()
//                Click.on(BTNCONTINUARTAGENVIARDINERO),
//                Click.on(BTNENVIARDINEROTAG),
//                Click.on(BTNOTP),
//                Click.on(BTNENVIARCODIGO),
//                Enter.theValue("8").into(CAMPOOTP1),
//                Enter.theValue("0").into(CAMPOOTP2),
//                Enter.theValue("1").into(CAMPOOTP3),
//                Enter.theValue("0").into(CAMPOOTP4),
//                Enter.theValue("8").into(CAMPOOTP5),
//                Enter.theValue("4").into(CAMPOOTP6),
//                Click.on(BTNVERIFICAR),
//                WaitUntil.the(MSJTRXEXITOSA,isVisible())
        );

    }






}
