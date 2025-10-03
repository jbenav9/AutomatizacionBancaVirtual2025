package com.labdigbdbstgpb.virtual.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class TagAlfanumericoInexistenteUI {
    public static final Target MSJ_TAG_ALFANUMERICO_INEXISTENTE = Target.the("Validación de llave alfanumerica inexistente").located(ByShadow.cssSelector("#modal > div > div.sp-ml-modal__content__box__title", "#notification-modal-overlay > transfers-sp-ml-modal"));
    public static final Target BTNREGRESARTAG = Target.the("Boton regresar tag inexistente").located(ByShadow.cssSelector("#notification-modal-button-0","#notification-modal-overlay > transfers-sp-ml-modal"));
}
