#language: es

Característica: ingreso a la pagina web
  yo como usuario de internet
  quiero ingresar a la pagina web https://serenity.is/demo/
  para verificar su funcionamiento

  Antecedentes: : ingresar a la pagina web
    Dado  el usuario intenta loguearse en la pagina web
      | nombreusuario | clave    |
      | admin         | serenity |

    Escenario: seleccionar opcion customers
     Cuando   el usuario ingresa datos del cliente en la opcion customers

       | customerID | companyName | contactName | contactTitle | address             | country | city   | region | postalCode | phone   | lastContactBy   | email            |
       | 125        | choucair    | Ronie       | rnx          | av siempre viva 123 | USA     | Seatle | north  | 25698      | 2114568 | Steven Buchanan | steven@gmail.com |

      Entonces deberia ver el registro para customers exitoso