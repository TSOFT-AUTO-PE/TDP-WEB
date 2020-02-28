package com.tsoft.bot.frontend.steps.servicios;

import com.tsoft.bot.frontend.utility.CallerSOAP_CustomerInformation;
import com.tsoft.bot.frontend.utility.CallerSOAP_PaymentsManagement;

import cucumber.api.java.en.Given;



public class steps_servicios {


    @Given("^Se verifica el API CustomerInformation$")
    public void seVerificaElAPICustomerInformation() {
        CallerSOAP_CustomerInformation.API_API_TEST_CI();



    }

    @Given("^Se verifica el API PaymentManagement$")
    public void seVerificaElAPIPaymentManagement() {
        CallerSOAP_PaymentsManagement.API_API_TEST_PM();
    }
}
