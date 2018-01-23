package com.roberthenderson.fastestcars;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class FastCarsTest {

    @Test
    public void getListTest() {
        FastCars fastCars = new FastCars();
        Assert.assertEquals(20, fastCars.getList().size());
    }


}
