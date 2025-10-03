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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    private final String tipoIdentificacion;
    private final String usuario;
    private final String clave;

    public Login(String tipoIdentificacion, String usuario, String clave) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Login con(String tipoIdentificacion, String usuario, String clave) {
        return Tasks.instrumented(Login.class, tipoIdentificacion, usuario, clave);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USUARIO, isVisible()),
                Click.on(LIST_IDENTI),
                Click.on(obtenerTipoIdentificacion(tipoIdentificacion)),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR),
                WaitUntil.the(MSJ_INICIO, isVisible()).forNoMoreThan(60).seconds()
        );
        }
    }

