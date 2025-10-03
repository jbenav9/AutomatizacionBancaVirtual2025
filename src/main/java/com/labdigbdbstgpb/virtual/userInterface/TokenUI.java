package com.labdigbdbstgpb.virtual.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class TokenUI {

    public static final Target CAMPOOTP1 = Target.the("Campo 1").located(ByShadow.cssSelector("#input_0", "#two-factor-authentication-overlay > div > div.sherpa-grid > div > div > div > miscellaneous-bdb-ml-bm-token", "#inputs > miscellaneous-bdb-at-input-token"));
    public static final Target CAMPOOTP2 = Target.the("Campo 2").located(ByShadow.cssSelector("#input_1", "#two-factor-authentication-overlay > div > div.sherpa-grid > div > div > div > miscellaneous-bdb-ml-bm-token", "#inputs > miscellaneous-bdb-at-input-token"));
    public static final Target CAMPOOTP3 = Target.the("Campo 3").located(ByShadow.cssSelector("#input_2", "#two-factor-authentication-overlay > div > div.sherpa-grid > div > div > div > miscellaneous-bdb-ml-bm-token", "#inputs > miscellaneous-bdb-at-input-token"));
    public static final Target CAMPOOTP4 = Target.the("Campo 4").located(ByShadow.cssSelector("#input_3", "#two-factor-authentication-overlay > div > div.sherpa-grid > div > div > div > miscellaneous-bdb-ml-bm-token", "#inputs > miscellaneous-bdb-at-input-token"));
    public static final Target CAMPOOTP5 = Target.the("Campo 5").located(ByShadow.cssSelector("#input_4", "#two-factor-authentication-overlay > div > div.sherpa-grid > div > div > div > miscellaneous-bdb-ml-bm-token", "#inputs > miscellaneous-bdb-at-input-token"));
    public static final Target CAMPOOTP6 = Target.the("Campo 6").located(ByShadow.cssSelector("#input_5", "#two-factor-authentication-overlay > div > div.sherpa-grid > div > div > div > miscellaneous-bdb-ml-bm-token", "#inputs > miscellaneous-bdb-at-input-token"));
    public static final Target BTNVERIFICAR = Target.the("Boton de verificar").located(ByShadow.cssSelector("div > div.bdb-ml-bm-token__actions > div.bdb-ml-bm-token__actions__send > button","#two-factor-authentication-overlay > div > div.sherpa-grid > div > div > div > miscellaneous-bdb-ml-bm-token","#inputs > miscellaneous-bdb-at-input-token"));

}
