package robot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        int nombreDeLignes = world.getRobot().carte().size() - 3;
        int nombreDeColonnes = countOccurrences(world.getRobot().carte().get(3),'\t') -3;
        Assert.assertEquals(sizeX  , nombreDeColonnes);
        Assert.assertEquals( sizeY , nombreDeLignes);
    }

    private static int countOccurrences(String str, char ch) {

        Matcher matcher = Pattern.compile(String.valueOf(ch))
                .matcher(str);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

}
