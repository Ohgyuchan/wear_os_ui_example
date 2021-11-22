package com.oceansalmon.wear_os_ui_example;

import android.app.Activity;
import android.content.Intent;
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

        adaptor.addItem("알고리즘 공부","💻","오후 8시 0분","오후 10시 0분", "백준 알고리즘 문제\n\n저는 단계별로 문제 풀기를 할 겁니다:)\n\n 1시간 : 내 힘으로 풀기\n1시간 : 답 찾아보기 1시간만에 해결했을 때에는 다른 문제를 풀거나 쉬기\n하루에 딱 2시간씩만 풀어보아요:)");
        adaptor.addItem("공부란 무엇인가","📚","오후 3시 0분","오후 10시 0분", "김영민 저서");
        adaptor.addItem("로스쿨 공부","💻","오전 10시 0분","오후 10시 0분", "1. QT\n2. 밥\n3. 형재실 스터디\n4. 검찰 스터디\n5. 열람실 공");
        adaptor.addItem("모닝 다리교정 필라테스","💪","오전 8시 30분","오후 10시 0분", "1. 고관절 스트레칭\n2.한발떼기");
        adaptor.addItem("함께하는 가을 등산 ","🎶","오후 12시 0분","오후 10시 0분", "등산 함께 얘기하면서 해요!");
        adaptor.addItem("운동 ","💪","오후 1시 0분","오후 10시 0분", "3분할\n");

        adaptor.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position != 0) {
                    RoutineModel routineModel = (RoutineModel) adapterView.getItemAtPosition(position);
                    Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                    intent.putExtra("title", routineModel.getTitle());
                    intent.putExtra("category", routineModel.getCategory());
                    intent.putExtra("startTime", routineModel.getStartTime());
                    intent.putExtra("endTime", routineModel.getEndTime());
                    intent.putExtra("desc", routineModel.getDesc());
                    startActivity(intent);
                }
            }
        });
    }
}