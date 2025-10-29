package com.labdigbdbstgpb.virtual.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.apache.poi.ss.formula.functions.T;

public class ValidacionLlaveExitosaBreBUI {
//    public static final Target BTN_PAGAR_BREB = Target.the("Boton de BreB").located(ByShadow.cssSelector("#item__2 > span", "#root > div > div.dash.shell-container__mf.shell-container__portal > div > dashboard-sp-ml-sidebar"));
//    public static final Target INGRESAR_LLAVE_BREB = Target.the("Ingresar llave BreB").located(ByShadow.cssSelector(".qr__input.ng-untouched.ng-pristine.ng-valid","#wrapper-spi > adl-spi-frontend-mfe-core-1759434548993-0 > ng-component"));
//    public static final Target BOTON_CONSULTAR_LLAVE = Target.the("Boton consultar llave BreB").located(ByShadow.cssSelector("div > ng-component > div > app-page-container > div > div > app-container:nth-child(2) > div > app-qr > div > input","#wrapper-spi > adl-spi-frontend-mfe-core-1759436561339-0 > ng-component"));
   public static final Target MSJ_LLAVE_BREB = Target.the("Validacion llave BreB").located(ByShadow.cssSelector("#content > label.sp-ml-content-title__content__title","#root > div > div.shell-container__transfers-spi-mfe-web-ui > main > span > span > section > form > tran-spi-sp-ml-content-title"));
    public static final Target BTN_PAGAR_TRANSFERIR = Target.the("Boton de pagar y transferir").located(ByShadow.cssSelector("#item__1 > div", "#root > div > div.dash.shell-container__mf.shell-container__portal > div > dashboard-sp-ml-sidebar"));
    public static final Target OPC_ENV_DIN = Target.the("Boton enviar dinero").located(ByShadow.cssSelector("#option__\\/pagar-transferir\\/enviar-dinero > div > div.sp-ml-sidebar__menu__sheet__content__option__contanier__icon-label > div", "#root > div > div.dash.shell-container__mf.shell-container__portal > div > dashboard-sp-ml-sidebar"));
    public static final Target OPC_BREB = Target.the("Boton BreB").located(ByShadow.cssSelector("dashboard-sp-at-backdrop:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)","#root > div > div.dash.shell-container__mf.shell-container__portal > div > dashboard-sp-ml-sidebar"));
    public static final Target TXT_LLAVE_BREB = Target.the("Ingresar llave Breb").located(ByShadow.cssSelector("#sp-at-input","#root > div > div.shell-container__transfers-spi-mfe-web-ui > main > span > span > section > form > tran-spi-sp-at-input"));
    public static final Target BTN_CONSULTAR_LLAVE_BREB = Target.the("Bonton consultar llave BreB").locatedBy("//*[@id=\"root\"]/div/div[4]/main/span/span/section/form/button");
    public static final Target MSJ_LLAVE_EXITOSA = Target.the("Llave exitosa").located(ByShadow.cssSelector("#content > label.sp-ml-content-title__content__title","#root > div > div.shell-container__transfers-spi-mfe-web-ui > main > span > span > section > form > tran-spi-sp-ml-content-title"));

}
