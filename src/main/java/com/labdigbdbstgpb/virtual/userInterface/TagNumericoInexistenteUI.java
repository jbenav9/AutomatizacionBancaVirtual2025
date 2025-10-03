package com.labdigbdbstgpb.virtual.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class TagNumericoInexistenteUI {
    public static final Target MSJ_TAG_NUMERICO_INEXISTENTE = Target.the("Validación de llave alfanumerica inexistente").located(ByShadow.cssSelector("#modal > div > div.sp-ml-modal__content__box__title", "#notification-modal-overlay > transfers-sp-ml-modal"));

}
