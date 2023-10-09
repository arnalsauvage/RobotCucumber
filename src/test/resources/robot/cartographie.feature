Feature: Cartographie
  Lorsque le robot se pose il cartographie le terrain autour de lui sur un carré de 9x9
  Il peut améliorer la couverture du terrain en utilisant sa caméra

  Scenario: Cartographie de départ
    Given Le robot est en vol
    When le robot atterrit en coordonnée (6, 5)
    Then la carte du robot mesure 9 x 9 cases

  Scenario: Cartographie étendue
    Given Le robot est en vol
    When le robot atterrit en coordonnée (6, 5)
    And le robot se déplace en coordonnée (7, 5)
    And le robot utilise sa caméra
    Then la carte du robot mesure 10 x 9 cases
