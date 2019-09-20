#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: funcionalidad de login


  @tag1 @exitoso
  Scenario: 1. ingreso exitoso de logueo
    Given ingreso aplicativo con usuario  Y contraseña 
		And dar click
		When validar que cargue el formulario 
		
		
		
  @tag2
  Scenario Outline: Title of your scenario outline
    Given ingreso aplicativo con usuario "<ingreso>" Y password "<password>" 
		And dar click
		When validar que cargue el formulario 
		
    Examples: 
      | ingreso  | password | status  |
      | ingreso1 |     12 | success |
      | name2 |     7 | Fail    |
