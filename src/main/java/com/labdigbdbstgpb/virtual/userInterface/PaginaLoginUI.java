package com.labdigbdbstgpb.virtual.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class PaginaLoginUI {
    public static final Target TXT_USUARIO = Target.the("Ingresr Usario").located(ByShadow.cssSelector("#bdb-at-input", "#root > div > div.shell-container__mf.shell-container__auth > div > div > div > div > div > div.kASZ-GVb1mV-F7wsG8XMrQ\\=\\=.col-xs-12.col-sm-10.col-lg-4.col-sm-offset-1.col-lg-offset-1 > div.sSx\\+Q-lIOPxgL65Y7MbQ-A\\=\\= > form > div > div.S2UoSavgNyQ5bZtWswES6g\\=\\= > div._38XTXN6LzdUclz9qYHcAyA\\=\\= > div", "#identificationNumber"));
    public static final Target LIST_IDENTI = Target.the("Tipo de identificación").located(ByShadow.cssSelector("#bdb-at-dropdown > div.container__input", "#identificationType"));
    public static final Target VAL_IDENTI = Target.the("Valor tipo documento CC").located(ByShadow.cssSelector("#option-CC", "#identificationType"));
    public static final Target TXT_CLAVE = Target.the("Ingresar clave").located(ByShadow.cssSelector("#bdb-at-input", "#root > div > div.shell-container__mf.shell-container__auth > div > div > div > div > div > div.kASZ-GVb1mV-F7wsG8XMrQ\\=\\=.col-xs-12.col-sm-10.col-lg-4.col-sm-offset-1.col-lg-offset-1 > div.sSx\\+Q-lIOPxgL65Y7MbQ-A\\=\\= > form > div > div.kEBB6\\+7IfbDPxUuB6G3LvQ\\=\\= > div", "#secure"));
    public static final Target BTN_INGRESAR = Target.the("Boton ingresar").locatedBy("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div/div[1]/div[3]/form/div/button");
    public static final Target MSJ_INICIO = Target.the("Inicio").locatedBy("//*[@id=\"root\"]/div/div[4]/div/div[2]/div[3]/div[2]/div/div[1]/div/div[1]");
    public static final Target VALORES_IDENTI_CC = Target.the("Valor tipo identificacion CC").located(ByShadow.cssSelector("#option-CC", "#identificationType"));
    public static final Target VALORES_IDENTI_CE = Target.the("Valor tipo identificacion CE").located(ByShadow.cssSelector("#option-CE", "#identificationType"));
    public static final Target VALORES_IDENTI_PA = Target.the("Valor tipo identificacion CE").located(ByShadow.cssSelector("#option-PA", "#identificationType"));
    public static final Target BTN_VOLVER_INICIO = Target.the("Botón Volver al inicio").located(ByShadow.cssSelector("#notification-modal-button-0", "#notification-modal-overlay > auth-bdb-ml-modal"));
    public static final Target BTN_BAJAR = Target.the("Botón bajar").located(ByShadow.cssSelector("#bdb-ml-terms__arrow-btn","#modal-terms-overlay > auth-bdb-ml-terms"));
    public static final Target BTN_ACEP_TERMCOND = Target.the("Botón aceptar terminos y condiciones").located(ByShadow.cssSelector("#title", "#modal-terms-overlay > auth-bdb-ml-terms"));
    public static final Target MSJ_LOGIN = Target.the("Mensaje inicio login").locatedBy("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div/div[1]/div[1]/div");

}
