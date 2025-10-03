Feature: Validar diferentes tipos de llave TAG

  Background:
    Given que el usuario se encuentre en la pagina web
    And el usuario inicia sesión con los siguientes datos
      | TipoIdentificacion | Usuario  | Clave |
      | CC                 | 80802772 | 0801     |

  Scenario Outline: Validar tipo de llave <Descripcion>
    When ingrese a la opcion de enviar dinero por tag aval y el usuario ingresa el tag "<Tag>"
    Then le da click en el boton continuar y vera que la consulta del tag fallida

    Examples:
      | Descripcion  | Tag                     |
      | Alfanumerico | @BBAAA81311             |
      | Numérico     | 80802772111             |
      | Celular      | 3100000000              |
      | Correo       | pruebasbb1_11@gmail.com |