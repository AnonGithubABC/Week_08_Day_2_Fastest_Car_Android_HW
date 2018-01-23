package com.roberthenderson.fastestcars;


import java.util.ArrayList;

class FastCars {

    private ArrayList<Car> list;

    public FastCars() {
        list = new ArrayList<Car>();
        list.add(new Car(1, "Porsche", "918 Spyder", 2.2));
        list.add(new Car(2, "Tesla", "Model S P100D", 2.28));
        list.add(new Car(3, "Bugatti", "Chiron", 2.3));
        list.add(new Car(4, "Dodge", "Challenger SRT Demon", 2.3));
        list.add(new Car(5, "Ferrari", "LaFerrari", 2.4));
        list.add(new Car(6, "Lamborghini", "Aventador SV", 2.4));
        list.add(new Car(7, "Bugatti", "Veyron", 2.5));
        list.add(new Car(8, "Porsche", "911 Turbo S (991)", 2.5));
        list.add(new Car(9, "Lamborghini", "Huracan Performante", 2.5));
        list.add(new Car(10, "Tesla", "Tesla Model S P90D", 2.6));
        list.add(new Car(11, "Mclaren", "P1", 2.6));
        list.add(new Car(12, "Audi", "R8 V10 Plus", 2.6));
        list.add(new Car(13, "Porsche", "GT2 RS", 2.7));
        list.add(new Car(14, "Porsche", "911 Turbo S (997)", 2.7));
        list.add(new Car(15, "Nissan", "Nismo GT-R", 2.7));
        list.add(new Car(16, "Lamborghini", "Aventador", 2.7));
        list.add(new Car(17, "Mclaren", "675 LT", 2.7));
        list.add(new Car(18, "Honda", "NSX", 2.7));
        list.add(new Car(19, "Ferrari", "F12 TDF", 2.7));
        list.add(new Car(20, "BAC", "Mono", 2.8));
    }

    public ArrayList<Car> getList() {
        return new ArrayList<Car>(list);
    }
}
