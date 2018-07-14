package com.javahelps.importexternaldatabase;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<CarModel> {

    private Context mContext;
    private List<CarModel> carModelList = new ArrayList<>();

    public CustomAdapter(@NonNull Context context, ArrayList<CarModel> list){
        super(context,0,list);
        mContext = context;
        carModelList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.custom_list_layout,parent,false);

        CarModel currentCar = carModelList.get(position);

//        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
//        image.setImageResource(currentMovie.getmImageDrawable());

        TextView txtId = listItem.findViewById(R.id.tvId);
        txtId.setText(currentCar.getId());

        TextView txtName =  listItem.findViewById(R.id.tvName);
        txtName.setText(currentCar.getName());

//        TextView txtSpec =  listItem.findViewById(R.id.tvSpec);
//        txtSpec.setText(currentCar.getSpec());

        return listItem;
    }
}
