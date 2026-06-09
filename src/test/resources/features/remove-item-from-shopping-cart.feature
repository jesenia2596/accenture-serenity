
Feature: Remover productos del carrito en SwagLabs

Scenario: Remove item form shopping
  Given que el usuario inicio sesion y está en la página de productos
  And agrega el producto "Sauce Labs Bike Light" al carrito
  When remueve el producto "Sauce Labs Bike Light" del carrito
  Then el producto "Sauce Labs Bike Light" no debe aparecer en el carrito



