package com.roberthenderson.fastestcars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Car> fastCars = new FastCars().getList();

        FastCarsAdaptor carsAdaptor = new FastCarsAdaptor(this, fastCars);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(carsAdaptor);
    }
}
