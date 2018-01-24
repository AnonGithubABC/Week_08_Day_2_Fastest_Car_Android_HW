package com.roberthenderson.fastestcars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

    public void onListItemClick(View listItem) {
        Car car = (Car) listItem.getTag();
        Log.d("Car Model: ", car.getModel());

        Intent intent = new Intent(this, CarActivity.class); //NEW
        intent.putExtra("car", car); //NEW
        startActivity(intent); //NEW
    }



}
