Feature: Validar tipo de llave alfanumerico

  Background:
    Given que el usuario se encuentre en la pagina web
    And el usuario inicia sesión con los siguientes datos
      | TipoIdentificacion | Usuario  | Clave |
      | CC                 | 80802772 | 0907  |

  Scenario: Validar tipo de llave alfanumerico
    When ingrese a la opcion de enviar dinero por tag aval y el usuario ingresa el tag alfanumerico
    Then le da click en el boton continuar y vera que la consulta del tag exitosa
