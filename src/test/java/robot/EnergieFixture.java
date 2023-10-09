package robot;

import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.Random;

public class EnergieFixture {
    private MyWorld world;

    public EnergieFixture(MyWorld world) {
        this.world = world;
    }

    @Then("^la charge du robot est de (\\d+) unités$")
    public void laChargeEst(int charge) throws Throwable {
        Assert.assertEquals(charge, (int) world.getBattery().getChargeLevel());
    }

}
