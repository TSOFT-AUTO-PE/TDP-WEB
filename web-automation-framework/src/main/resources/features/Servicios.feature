Feature: Servicios Varios

  @CustomerInformation.retrieveIndividualGovernmentDetails
  Scenario Outline: Validar Servicio CustomerInformation.retrieveIndividualGovernmentDetails

    Given Se verifica el API CustomerInformation

    Examples:
      | caso_prueba |
      |           1 |

  @SOAP_CustomerInformation
  Scenario Outline: Validar Servicio PaymentManagement.RetrieveOpenDebts

    Given Se verifica el API PaymentManagement

    Examples:
      | caso_prueba |
      |           1 |