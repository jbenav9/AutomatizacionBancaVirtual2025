package com.labdigbdbstgpb.virtual.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.labdigbdbstgpb.virtual.utils.TipoIdentificacionUtil.obtenerTipoIdentificacion;
import static com.labdigbdbstgpb.virtual.userInterface.EnviarDineroTagAlfanumericoYCtaAhUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.EnviarDineroTagAlfanumericoYCtaAhUI.MSJTRXEXITOSA;
import static com.labdigbdbstgpb.virtual.userInterface.EnviarDineroTagAlfanumericoYCtaCteUI.CTACCTE;
import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnviarDineroTagAlafanumericoYCtaCte implements Task {
    private final String tipoIdentificacion;
    private final String usuario;
    private final String clave;

    public EnviarDineroTagAlafanumericoYCtaCte(String tipoIdentificacion, String usuario, String clave) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.usuario = usuario;
        this.clave = clave;

    }

    public static EnviarDineroTagAlafanumericoYCtaCte con(String tipoIdentificacion, String usuario, String clave) {
        return Tasks.instrumented(EnviarDineroTagAlafanumericoYCtaCte.class, tipoIdentificacion, usuario, clave);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Login.con(tipoIdentificacion, usuario, clave),
                WaitUntil.the(MSJ_INICIO, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BTN_PAGAR_TRANSFERIR),
                Click.on(OPC_ENV_DIN),
                Click.on(OPC_TAG),
                Enter.theValue("@BBAAA813").into(TXT_TAG),
                Click.on(BTN_CONTINUARTAG),
                Enter.theValue("1212").into(TXT_VALOR),
                Click.on(CTACCTE),
                WaitUntil.the(CTAAHS, isVisible()).forNoMoreThan(60).seconds(),
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