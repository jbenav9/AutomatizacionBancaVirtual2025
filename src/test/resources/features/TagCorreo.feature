Feature: Validar tipo de llave correo

  Scenario Outline: Validar tipo de llave correo

    Given el usuario este en el DahsBoard
    When ingrese a la opcion de enviar dinero por tag aval y el usuario ingresa el tag correo
      | TipoIdentificacion | Usuario   | Clave   |
      | <tipo>             | <usuario> | <clave> |
    Then le da click en el boton continuar y vera que la consulta del tag exitosa

    Examples:
      | tipo | usuario  | clave |
      | CC   | 80802772 | 0906  |