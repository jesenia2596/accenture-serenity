
Feature: Compra de multiples productos en SwagLabs

Scenario: Buy multiple items
  Given que el usuario inicio sesion y está en la página de productos
  When agrega multiples productos al carrito y realiza el checkout
  Then la compra debe ser exitosa


