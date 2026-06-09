
Feature: Compra de productos en SwagLabs

Scenario: Buy item
  Given que el usuario inicio sesion y está en la página de productos
  When agrega un producto al carrito y realiza el checkout
  Then la compra debe ser exitosa




