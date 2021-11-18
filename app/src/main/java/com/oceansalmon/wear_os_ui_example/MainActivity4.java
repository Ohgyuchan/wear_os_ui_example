package com.oceansalmon.wear_os_ui_example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ListViewAdaptor adaptor = new ListViewAdaptor();
        final View header = getLayoutInflater().inflate(R.layout.listview_header, null, false) ;

        ListView listView = findViewById(R.id.listView);
        listView.addHeaderView(header);
        listView.setAdapter(adaptor);

        adaptor.addItem("알고리즘 공부","💻","오후 8시 0분","오후 10시 0분");
        adaptor.addItem("공부란 무엇인가","📚","오후 3시 0분","오후 10시 0분");
        adaptor.addItem("로스쿨 공부","💻","오전 10시 0분","오후 10시 0분");
        adaptor.addItem("모닝 다리교정 필라테스","💪","오전 8시 30분","오후 10시 0분");
        adaptor.addItem("함께하는 가을 등산 ","🎶","오후 12시 0분","오후 10시 0분");
        adaptor.addItem("운동 ","💪","오후 1시 0분","오후 10시 0분");

        adaptor.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                RoutineModel data = (RoutineModel) adapterView.getItemAtPosition(position);
                System.out.println(data.getTitle());
            }
        });
    }
}