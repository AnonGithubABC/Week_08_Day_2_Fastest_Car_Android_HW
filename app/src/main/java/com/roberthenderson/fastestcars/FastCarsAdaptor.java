package com.roberthenderson.fastestcars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by user on 23/01/2018.
 */

public class FastCarsAdaptor extends ArrayAdapter<Car> {

    public FastCarsAdaptor(Context context, ArrayList<Car> cars){
        super(context,0, cars);

    }

    @Override

    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.car_item, parent, false);
        }

        Car currentCar = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentCar.getRanking().toString());

        TextView make = listItemView.findViewById(R.id.make);
        make.setText(currentCar.getMake().toString());

        TextView model = listItemView.findViewById(R.id.model);
        model.setText(currentCar.getModel().toString());

        TextView zeroToSixty = listItemView.findViewById(R.id.zeroToSixty);
        zeroToSixty.setText(currentCar.getZeroToSixty().toString());

        listItemView.setTag(currentCar);

        return listItemView;

    }
}
