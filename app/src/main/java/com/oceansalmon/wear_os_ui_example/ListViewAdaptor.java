package com.oceansalmon.wear_os_ui_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdaptor extends BaseAdapter {
    private TextView tvCategory;
    private TextView tvTitle;
    private TextView tvStartTime;

    private ArrayList<RoutineModel> routineModelList = new ArrayList<RoutineModel>();

    public  ListViewAdaptor() {

    }

    public int getCount() {
        return routineModelList.size();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }

        tvCategory = (TextView) convertView.findViewById(R.id.category);
        tvTitle = (TextView) convertView.findViewById(R.id.routineTitle);
        tvStartTime = (TextView) convertView.findViewById(R.id.startTime);

        RoutineModel routineModel = routineModelList.get(position);

        tvCategory.setText(routineModel.getCategory());
        tvTitle.setText(routineModel.getTitle());
        tvStartTime.setText(routineModel.getStartTime());

        return convertView;
    }

    public  long getItemId(int position) {
        return position;
    }

    public Object getItem(int position) {
        return routineModelList.get(position);
    }

    public  void addItem(String title, String category, String startTime, String endTime) {
        RoutineModel routineModel = new RoutineModel();

        routineModel.setTitle(title);
        routineModel.setCategory(category);
        routineModel.setStartTime(startTime);
        routineModel.setEndTime(endTime);

        routineModelList.add(routineModel);
    }
}
