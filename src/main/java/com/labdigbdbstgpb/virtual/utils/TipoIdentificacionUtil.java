package com.labdigbdbstgpb.virtual.utils;


import net.serenitybdd.screenplay.targets.Target;

import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveExitosaBreBUI.CTA_AHORROS;
import static com.labdigbdbstgpb.virtual.userInterface.ValidacionLlaveExitosaBreBUI.CTA_CORRIENTE;


public class TipoIdentificacionUtil {


    public static Target obtenerTipoIdentificacion(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "CTA_AH" -> CTA_AHORROS;
            case "CTA_CTE" -> CTA_CORRIENTE;
            default -> throw new IllegalArgumentException("Tipo de identificación no soportado: " + tipo);
        };
    }


}
