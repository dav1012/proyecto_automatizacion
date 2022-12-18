#language: es

  Característica: ingreso a la pagina web
    yo como usuario de internet
    quiero ingresar a la pagina web https://serenity.is/demo/
    para verificar su funcionamiento

  Escenario: ingresar a la pagina web
    Cuando   el usuario intenta loguearse en la pagina web
      | nombreusuario | clave    |
      | admin         | serenity |
    Entonces deberia que el ingreso fue correcto




