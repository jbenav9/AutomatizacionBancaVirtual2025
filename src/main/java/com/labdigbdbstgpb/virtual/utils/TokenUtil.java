package com.labdigbdbstgpb.virtual.utils;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.labdigbdbstgpb.virtual.userInterface.TokenUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveExitosaBreBUI.*;

public class TokenUtil {

    public static List<Performable> ingresarTokenSiVisible(Actor actor, String... valores) {
        if (valores.length != 6) {
            throw new IllegalArgumentException("El token debe tener exactamente 6 dígitos.");
        }

        if (!CAMPOOTP1.resolveFor(actor).isVisible()) {
            // Si el campo no está visible, no se hace nada
            return List.of();
        }

        // Si está visible, se retorna la lista de acciones
        return List.of(
                Enter.theValue(valores[0]).into(CAMPOOTP1),
                Enter.theValue(valores[1]).into(CAMPOOTP2),
                Enter.theValue(valores[2]).into(CAMPOOTP3),
                Enter.theValue(valores[3]).into(CAMPOOTP4),
                Enter.theValue(valores[4]).into(CAMPOOTP5),
                Enter.theValue(valores[5]).into(CAMPOOTP6),
                Click.on(BTNVERIFICAR)
        );
    }
}
