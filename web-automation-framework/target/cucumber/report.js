$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MiMovistar_FlujoRecargas.feature");
formatter.feature({
  "line": 1,
  "name": "Mi Movistar Flujo de Recargas",
  "description": "",
  "id": "mi-movistar-flujo-de-recargas",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Recargas en Mi Movistar",
  "description": "",
  "id": "mi-movistar-flujo-de-recargas;recargas-en-mi-movistar",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@MiMovistar_Recargas_Completo"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "se genera la URL mediante el API_TEST_recargas",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "se ingresa en la URL el token generado \"\u003ccaso_prueba\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "se ingresa el numero celular \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "monto a recargar \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "se da click en el boton Continuar",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "se ingresa el email \"\u003ccaso_prueba\u003e\" y se da click en continuar",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "se ingresa el numero de tarjeta \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "se ingresa el mes de vencimiento \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "se ingresa el anio de vencimiento \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "se ingresa el codigo de verificacion \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "se da click en el boton Pagar",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "se verifica que se hizo la recarga correcta.",
  "keyword": "Then "
});
formatter.examples({
  "line": 39,
  "name": "",
  "description": "",
  "id": "mi-movistar-flujo-de-recargas;recargas-en-mi-movistar;",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 40,
      "id": "mi-movistar-flujo-de-recargas;recargas-en-mi-movistar;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 41,
      "id": "mi-movistar-flujo-de-recargas;recargas-en-mi-movistar;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10995277200,
  "status": "passed"
});
formatter.before({
  "duration": 101597200,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Recargas en Mi Movistar",
  "description": "",
  "id": "mi-movistar-flujo-de-recargas;recargas-en-mi-movistar;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@MiMovistar_Recargas_Completo"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "se genera la URL mediante el API_TEST_recargas",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "se ingresa en la URL el token generado \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "se ingresa el numero celular \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "monto a recargar \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "se da click en el boton Continuar",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "se ingresa el email \"1\" y se da click en continuar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "se ingresa el numero de tarjeta \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "se ingresa el mes de vencimiento \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "se ingresa el anio de vencimiento \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "se ingresa el codigo de verificacion \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "se da click en el boton Pagar",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "se verifica que se hizo la recarga correcta.",
  "keyword": "Then "
});
formatter.match({
  "location": "MiMovistar_Recargas.seGeneraLaURLMedianteElAPI_TEST_recargas()"
});
formatter.result({
  "duration": 16686900000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 40
    }
  ],
  "location": "MiMovistar_Recargas.seIngresaEnLaURLElTokenGenerado(String)"
});
formatter.result({
  "duration": 3968718600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    }
  ],
  "location": "MiMovistar_Recargas.seIngresaElNumeroCelular(String)"
});
formatter.result({
  "duration": 61254701000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    }
  ],
  "location": "MiMovistar_Recargas.montoARecargar(String)"
});
