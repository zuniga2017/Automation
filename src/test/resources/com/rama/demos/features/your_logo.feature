Feature: comprar ropa
  Yo como clienta de una pagina web
  Necesito automatizar la página automationpractice
  Para registrarme y comprar ropa

  Scenario Outline: Registrar usuario
    Given "Jhoiner" Desea ir a la pagina de <url>
    When Ingresa a la pagina y hace el registro de usuario
      | emailAddress   | title   | firstName   | lastName   | password   | dateOfBirth   | company   | address   | addressLine   | city   | state   | postalCode   | information   | homePhone   | mobilePhone   | alias   |
      | <emailAddress> | <title> | <firstName> | <lastName> | <password> | <dateOfBirth> | <company> | <address> | <addressLine> | <city> | <state> | <postalCode> | <information> | <homePhone> | <mobilePhone> | <alias> |
    Then Valido que el usuario quede registrado

    Examples:
      | url                                       | emailAddress                    | firstName | lastName | password   | dateOfBirth     | company      | address     | addressLine   | city     | state   | postalCode | information                   | homePhone | mobilePhone | alias       |
      | "http://automationpractice.com/index.php" | prouleummegeco-13@yopmail.com | Jhonatan  | Nagles   | 124@*#GLsa | 26-10-2011 | Atrato river | cra 164-567 | calle 164-567 | Norcross | Georgia | 30003      | Prueba de registro de usuario | 214567890 | 9876754567  | Mis compras |


