Feature: Ordenamiento de productos en SwagLabs

  Scenario Outline: Validar orden de productos según filtro seleccionado
    Given que el usuario inicio sesion y está en la página de productos
    When selecciona el filtro "<filtro>"
    Then los productos deben mostrarse en orden "<orden>"

    Examples:
      | filtro      | orden             |
      | az          | ascendente_nombre |
      | za          | descendente_nombre |
      | lohi        | ascendente_precio |
      | hilo        | descendente_precio |