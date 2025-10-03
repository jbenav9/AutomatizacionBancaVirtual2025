Feature: Validar tipo de llave numerica

  Scenario Outline: Validar tipo de llave numerica inexistente

    Given el usuario este en el DahsBoard
    When ingrese a la opcion de enviar dinero por tag aval y el usuario ingresa el tag numerica
      | TipoIdentificacion | Usuario   | Clave   |
      | <tipo>             | <usuario> | <clave> |
    Then le da click en el boton continuar y vera que la consulta del tag fallida

    Examples:
      | tipo | usuario  | clave |
      | CC   | 80802772 | 0906  |