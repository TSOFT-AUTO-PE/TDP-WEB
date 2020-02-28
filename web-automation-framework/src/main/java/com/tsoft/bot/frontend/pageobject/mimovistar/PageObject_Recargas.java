package com.tsoft.bot.frontend.pageobject.mimovistar;

import org.openqa.selenium.By;
import org.sikuli.script.Pattern;

public class PageObject_Recargas {

    public static By TXT_NUMERO_MOVISTAR                = By.id("input_celular"); //id
    public static By TXT_MONTO                          = By.id("input_monto"); //id
    public static By BTN_CONTINUAR                      = By.id("button_recargar"); //id
    public static final Pattern TXT_CORREO              = new Pattern("/src/main/resources/sikuli_images/txt_correo.PNG");
    public static final Pattern BTN_CONTINUAR2          = new Pattern("/src/main/resources/sikuli_images/btn_continuar2.PNG");
    public static final Pattern TXT_NUMERO_TARJETA      = new Pattern("/src/main/resources/sikuli_images/txt_numtarjeta.PNG");
    public static final Pattern LIST_FECHVEN            = new Pattern("/src/main/resources/sikuli_images/list_fechven.PNG");
    public static final Pattern SELECT_MES              = new Pattern("/src/main/resources/sikuli_images/select_mes.PNG");
    public static final Pattern LIST_ANIO               = new Pattern("/src/main/resources/sikuli_images/list_anio.PNG");
    public static final Pattern SELECT_ANIO             = new Pattern("/src/main/resources/sikuli_images/select_anio.PNG");
    public static final Pattern TXT_CVV                 = new Pattern("/src/main/resources/sikuli_images/txt_cvv.PNG");
    public static final Pattern BTN_PAGAR               = new Pattern("/src/main/resources/sikuli_images/btn_pagar.PNG");
    public static String LBL_EXITO                      = "/html/body/app-root/app-confirmation/div/div[1]/div[2]/label";
}
