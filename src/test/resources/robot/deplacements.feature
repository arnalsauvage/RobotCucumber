Feature: Robot
  A l'état initial le robot est en vol.
  Lorsque le robot atterrit il est orienté vers le nord.

  Scenario: Atterrissage
    Given Le robot est en vol
    When le robot atterrit en coordonnée (6, 5)
    Then les coordonnées du robot sont (6, 5)
    And il est orienté vers le nord

  Scenario: Avancer
    Given Le robot est en vol
    When le robot atterrit en coordonnée (6, 5)
    And le robot avance
    Then les coordonnées du robot sont (6, 4)
    And il est orienté vers le nord

  Scenario: Reculer
    Given Le robot est en vol
    When le robot atterrit en coordonnée (6, 5)
    And le robot recule
    Then les coordonnées du robot sont (6, 6)
    And il est orienté vers le nord

  Scenario: Tourner à droite
    Given Le robot est en vol
    When le robot atterrit en coordonnée (6, 5)
    And le robot tourne à droite
    Then les coordonnées du robot sont (6, 5)
    And il est orienté vers l'est

  Scenario: Tourner à gauche
    Given Le robot est en vol
    When le robot atterrit en coordonnée (6, 5)
    And le robot tourne à gauche
    Then les coordonnées du robot sont (6, 5)
    And il est orienté vers l'ouest