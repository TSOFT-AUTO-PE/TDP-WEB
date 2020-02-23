package com.tsoft.bot.frontend.pageobject.mimovistar;

import org.sikuli.script.Pattern;

public class PageObject_Recargas {

    public static String TXT_NUMERO_MOVISTAR    = "input_celular"; //id
    public static String TXT_MONTO              = "input_monto"; //id
    public static String BTN_CONTINUAR          = "button_recargar"; //id
    public static final Pattern TXT_CORREO      = new Pattern("/src/main/resources/sikuli_images/txt_correo.PNG");
    public static final Pattern BTN_CONTINUAR2  = new Pattern("/src/main/resources/sikuli_images/btn_continuar2.PNG");
    public static String TXT_NUMERO_TARJETA  = "/html/body/div/div/div[3]/form/div/div/div[13]/input"; //id
    public static String LIST_FV_MES        = "expiryDateMonthInput"; //id
    public static String LIST_FV_ANIO       = "expiryDateYearInput"; //id
    public static String TXT_CVV            = "csc"; //id
    public static String IMG_CARGA    = "/html/body/app-root/app-checkout/div/div/img"; //xpath
    public static String LBL_EXITO          = "/html/body/app-root/app-confirmation/div/div[1]/div[2]/label";
}
