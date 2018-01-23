package com.roberthenderson.fastestcars;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/01/2018.
 */

public class CarsTest {

    Car car;

    @Before
    public void before(){
        car = new Car(1, "Lamborghini", "Huracan Performante", 2.9);
    }

    @Test
    public void getRankingTest(){
        assertEquals((Integer)1, car.getRanking());
    }

    @Test
    public void getMakeTest(){
        assertEquals("Lamborghini", car.getMake());
    }

    @Test
    public void getModelTest(){
        assertEquals("Huracan Performante", car.getModel());
    }

    @Test
    public void getZeroToSixtyTest(){
        assertEquals(2.9, car.getZeroToSixty(), 0.1);
    }
}
