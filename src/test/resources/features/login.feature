Feature: login de usuario

  Scenario Outline: login de usuario exitoso con diferentes tipos de identificación
    Given que el usuario se encuentre en la pagina web
    When ingrese el usuario con la clave y tipo de identificación
      | TipoIdentificacion | Usuario   | Clave   |
      | <tipo>             | <usuario> | <clave> |
    Then el usuario visualizara un mensaje de login exitoso

    Examples:
      | tipo | usuario  | clave |
      | CC   | 80802772 | 0907  |
      | CE   | 203731   | 0907  |
#      | PA   | 303113   | 0905  |


#  Scenario Outline: login de usuario fallido con diferentes tipos de ID
#    Given que el usuario se encuentre en la pagina web
#    When ingrese el usuario con la clave
#      | TipoIdentificacion | Usuario   | Clave   |
#      | <tipo>             | <usuario> | <clave> |
#    Then el usuario visualizara un mensaje de credenciales incorrectas
#
#    Examples:
#      | tipo | usuario | clave |
#      | CC   | 121232  | 4321  |
#      | CE   | 203731   | 0905  |
#      | PA   | 123123  | 4321  |
#
#
#  Scenario Outline: login de usuario fallido por contraseña incorrecta
#    Given que el usuario se encuentre en la pagina web
#    When ingrese el usuario con la clave incorrecta
#      | TipoIdentificacion | Usuario   | Clave   |
#      | <tipo>             | <usuario> | <clave> |
#    Then el usuario que ingreso la contraseña incorrecta visualizara un mensaje de credenciales incorrectas
#
#    Examples:
#      | tipo | usuario  | clave |
  #      | CC   | 80802772 | 0901  |
#      | CE   | 203731   | 0909  |
#      | PA   | 303113   | 8521  |