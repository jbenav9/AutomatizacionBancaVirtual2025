package com.labdigbdbstgpb.virtual.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class ValidacionLlaveFallidaBreBUI {
    public static final Target MSJ_LLAVE_NO_EXISTE = Target.the("Llave no existe").located(ByShadow.cssSelector("#modal > div > div.sp-ml-modal__content__box__title","#tran-spi-notification-modal-overlay > tran-spi-sp-ml-modal"));
    public static final Target BTN_ENTENDIDO = Target.the("Boton entendido").located(ByShadow.cssSelector("#notification-modal-button-0","#tran-spi-notification-modal-overlay > tran-spi-sp-ml-modal"));

}
