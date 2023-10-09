package robot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CartographieFixture {
    private MyWorld world;

    public CartographieFixture(MyWorld world) {
        this.world = world;
    }

    @And("^le robot utilise sa caméra$")
    public void leRobotUtiliseSaCamera() throws Throwable {
        world.getRobot().cartographier();
    }

    @Then("^la carte du robot mesure (\\d+) x (\\d+) cases$")
    public void laCarteMesure(int sizeX, int sizeY) throws Throwable {
        // TODO
    }

}
