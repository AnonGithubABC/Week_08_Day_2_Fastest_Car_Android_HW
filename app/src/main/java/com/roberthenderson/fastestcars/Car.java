package com.roberthenderson.fastestcars;

/**
 * Created by user on 23/01/2018.
 */

class Car {

    private Integer ranking;
    private String make;
    private String model;
    private Double zeroToSixty;

    public Car (Integer ranking, String make, String model, Double zeroToSixty) {
        this.ranking = ranking;
        this.make = make;
        this.model = model;
        this.zeroToSixty = zeroToSixty;

    }

        public Integer getRanking(){
        return this.ranking;
        }

        public String getMake(){
            return this.make;
        }

        public String getModel(){
            return this.model;
        }

        public Double getZeroToSixty(){
            return this.zeroToSixty;
        }

        @Override
        public String toString(){
            return this.getMake();
        }


}
