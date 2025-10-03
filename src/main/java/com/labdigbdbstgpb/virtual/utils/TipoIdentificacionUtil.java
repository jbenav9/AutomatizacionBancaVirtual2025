package com.labdigbdbstgpb.virtual.utils;


import net.serenitybdd.screenplay.targets.Target;

import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.*;


public class TipoIdentificacionUtil {


    public static Target obtenerTipoIdentificacion(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "CC" -> VALORES_IDENTI_CC;
            case "CE" -> VALORES_IDENTI_CE;
            case "PA" -> VALORES_IDENTI_PA;
            default -> throw new IllegalArgumentException("Tipo de identificación no soportado: " + tipo);
        };
    }


}
