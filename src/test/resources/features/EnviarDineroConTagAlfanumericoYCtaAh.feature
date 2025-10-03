Feature: Enviar dinero con tag alfanumerico y cta ahs

  Scenario Outline: Enviar dinero con tag alfanumerico y cta ahs

    Given el usuario haya validado el tag alfanumerico y esta en la opcion de seleccionar cuenta
    When ingrese el valor a enviar seleccione la cuenta de ahs y le de click en el boton continuar
      | TipoIdentificacion | Usuario   | Clave   |
      | <tipo>             | <usuario> | <clave> |
    Then Valide la informacion y le de click en enviar dinero vera exitosa la trx

    Examples:
      | tipo | usuario  | clave |
      | CC   | 80802772 | 0907  |