/*@autor : Abraham Hernandez*/
package com.tsoft.bot.frontend.utility;

import com.tsoft.bot.frontend.helpers.Hook;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.NodeList;

import javax.xml.soap.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class CallerSOAP_PaymentsManagement {

    private static final String EXCEL_SERVICE = "excel/Service1.xlsx";
    private static final String HOJA_SERVICE = "Servicios";
    private static final String COLUMNA_URL = "Url";
    private static final String COLUMNA_RESQUEST = "Resquest";
    private static WebDriver driver;

    public static void API_API_TEST_PM(){
        driver = Hook.getDriver();
        try {
            String url = getDataFrom().get(0).get(COLUMNA_URL);
            String resquest = getDataFrom().get(0).get(COLUMNA_RESQUEST);
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
            con.setRequestProperty("Accept-Charset", "application/xml");
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.flush();
            wr.close();
            int responseStatus = con.getResponseCode();
            getValueTagXML(detailResponse(url, resquest), "serviceName", 0);
            if (responseStatus == 200) {
                System.out.println("Servicio culminó con éxito"  + " ==> " + "Estado : " +responseStatus);
                ExtentReportUtil.INSTANCE.stepPass(driver, "Nombre del Servicio : "+getValueTagXML(detailResponse(url, resquest), "serviceName", 0) + "              El servicio retornó estado: " + responseStatus);
            } else {
                if (responseStatus == 500) {
                    System.out.println("Error en el servicio"  + " ==> " + "Estado : " +responseStatus);
                    ExtentReportUtil.INSTANCE.stepFail(driver, "Nombre del Servicio : "+getValueTagXML(detailResponse(url, resquest), "serviceName", 0) + "              El servicio retornó estado: " + responseStatus);
                }
                System.out.println("El servicio retornó estado: " + responseStatus);
            }

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void main(String[] args) throws Throwable {
        String url = getDataFrom().get(0).get(COLUMNA_URL);
        String resquest = getDataFrom().get(0).get(COLUMNA_RESQUEST);
        getValueTagXML(detailResponse(url, resquest), "serviceName", 0);
    }



    public static String getValueTagXML(String getResponse, String getSpecificTag, int pos){

        String getVar1=null;

        try {

            String response = getResponse;
            InputStream inputStream = new ByteArrayInputStream(response.getBytes());
            SOAPMessage message = MessageFactory.newInstance().createMessage(null, inputStream);
            SOAPPart soapPart = message.getSOAPPart();
            SOAPEnvelope envelope = soapPart.getEnvelope();
            SOAPBody body = envelope.getBody();
            NodeList var1 = body.getElementsByTagNameNS("*", getSpecificTag);
            getVar1 = var1.item(pos).getChildNodes().item(0).getNodeValue();
            System.out.println(getVar1);

        }catch (Exception e){
            e.getMessage();
        }

        assert getVar1 != null;
        return getVar1;
    }

    public static String detailResponse(String urlExcel, String requestExcel) {

        StringBuffer response = null;

        try {

            String url = urlExcel;
            URL obj = new URL(url);
            long inicioDate = System.currentTimeMillis();
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
            con.setRequestProperty("Accept-Charset", "application/xml");
            String request = requestExcel;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(request);
            wr.flush();
            wr.close();
            int responseStatus = con.getResponseCode();

            if (responseStatus == 200) {
                System.out.println("Servicio culminó con éxito"  + " ==> " + "Estado : " +responseStatus);
            } else {
                if (responseStatus == 500) {
                    System.out.println("Error en el servicio"  + " ==> " + "Estado : " +responseStatus);
                }
                System.out.println("El servicio retornó estado: " + responseStatus);
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) { response.append(inputLine); }
            in.close();
            long finDate = System.currentTimeMillis();
            System.out.println("Tiempo de respuesta: " + ((finDate - inicioDate) / 1000.0) + " segs");

        } catch (Exception e) {
            System.out.println(e);
        }
        return response.toString();
    }

    private static List<HashMap<String, String>> getDataFrom() throws Throwable {
        return ExcelReader.data(EXCEL_SERVICE, HOJA_SERVICE);
    }
}
