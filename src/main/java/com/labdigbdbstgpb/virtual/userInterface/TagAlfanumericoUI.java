package com.labdigbdbstgpb.virtual.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class TagAlfanumericoUI {

    public static final Target BTN_PAGAR_TRANSFERIR = Target.the("Boton de pagar y transferir").located(ByShadow.cssSelector("#item__1 > div", "#root > div > div.dash.shell-container__mf.shell-container__portal > div > dashboard-sp-ml-sidebar"));
    public static final Target OPC_ENV_DIN = Target.the("Boton enviar dinero").located(ByShadow.cssSelector("#option__\\/pagar-transferir\\/enviar-dinero > div > div.sp-ml-sidebar__menu__sheet__content__option__contanier__icon-label > div", "#root > div > div.dash.shell-container__mf.shell-container__portal > div > dashboard-sp-ml-sidebar"));
    public static final Target OPC_TAG = Target.the("Boton A un Tag Aval o llave").located(ByShadow.cssSelector("dashboard-sp-at-backdrop:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)", "#root > div > div.dash.shell-container__mf.shell-container__portal > div > dashboard-sp-ml-sidebar"));
    public static final Target TXT_TAG = Target.the("Ingresar Tag o Llave").located(ByShadow.cssSelector("#sp-at-input", "#root > div > div.shell-container__mf.shell-container__portal > div > div.Bd52\\+oONj5gdhbaHI75R1A\\=\\= > div > div > div > div > div > div > div.aYnul5LM893tB\\+6ygSu7hg\\=\\= > div > main > form > transfers-sp-at-input"));
    public static final Target BTN_CONTINUARTAG = Target.the("Boton continuar tag aval").locatedBy("#root > div > div.shell-container__mf.shell-container__portal > div > div.Bd52\\+oONj5gdhbaHI75R1A\\=\\= > div > div > div > div > div > div > div.aYnul5LM893tB\\+6ygSu7hg\\=\\= > div > main > form > div > button");
    public static final Target MSJ_TAG = Target.the("Validación de llave").located(ByShadow.cssSelector("#content > label:nth-child(2)", "#root > div > div.shell-container__mf.shell-container__portal > div > div.Bd52\\+oONj5gdhbaHI75R1A\\=\\= > div > div > div > div > div > div > div.aYnul5LM893tB\\+6ygSu7hg\\=\\= > div > div > div.wF6iMpaos3XDc-rk3lQmTw\\=\\= > transfers-sp-ml-content-title"));

}
