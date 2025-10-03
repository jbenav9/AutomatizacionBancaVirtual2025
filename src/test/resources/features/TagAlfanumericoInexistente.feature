Feature: Validar tipo de llave alfanumerico

  Scenario Outline: Validar tipo de llave alfanumerico inexistente

    Given el usuario este en el DahsBoard
    When ingrese a la opcion de enviar dinero por tag aval y el usuario ingresa el tag alfanumerico
      | TipoIdentificacion | Usuario   | Clave   |
      | <tipo>             | <usuario> | <clave> |
    Then le da click en el boton continuar y vera que la consulta del tag fallida

    Examples:
      | tipo | usuario  | clave |
      | CC   | 80802772 | 0906  |