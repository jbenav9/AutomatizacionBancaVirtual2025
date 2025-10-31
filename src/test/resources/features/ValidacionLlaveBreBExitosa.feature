Feature: Validar diferentes tipos de llave BreB

  Background:
    Given que el usuario se encuentre en la pagina web
    And el usuario inicia sesión con los siguientes datos
      | TipoIdentificacion | Usuario  | Clave |
      | CC                 | 80802772 | 0208  |

  Scenario Outline: Validar tipo de llave <Descripcion>
    When ingrese a la opcion de BreB y el usuario ingresa la llave BreB "<Llave>"
    Then le da click en el boton continuar y vera que la consulta de la llave BreB exitosa

    Examples:
      | Descripcion  | Llave                  |
#      | Alfanumerico | @BBAAA813            |
      | Numérico     | 3102111111             |
#      | Celular      | 3102111111           |
#      | Correo       | pruebasbb1@gmail.com |