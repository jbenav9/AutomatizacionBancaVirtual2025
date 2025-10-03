package com.labdigbdbstgpb.virtual.task;

import com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.labdigbdbstgpb.virtual.utils.TipoIdentificacionUtil.obtenerTipoIdentificacion;

public class LoginFallido implements Task {


    private final String tipoIdentificacion;
    private final String usuario;
    private final String clave;

    public LoginFallido(String tipoIdentificacion, String usuario, String clave) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.usuario = usuario;
        this.clave = clave;

    }

    public static LoginFallido con(String tipoIdentificacion, String usuario, String clave) {
        return Tasks.instrumented(LoginFallido.class, tipoIdentificacion, usuario, clave);
    }

    public static LoginFallido volverAlInicio() {

        return Tasks.instrumented(LoginFallido.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Login.con(tipoIdentificacion, usuario, clave),
                WaitUntil.the(PaginaLoginUI.BTN_VOLVER_INICIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PaginaLoginUI.BTN_VOLVER_INICIO),
                WaitUntil.the(MSJ_LOGIN, isVisible()).forNoMoreThan(15).seconds()
        );
    }
}
