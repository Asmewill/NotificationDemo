package com.example.jianshui.notificationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_send_notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_send_notification=findViewById(R.id.tv_send_notification);
        tv_send_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"正在发送通知...",Toast.LENGTH_LONG).show();
                NotificationUtils notificationUtils = new NotificationUtils(MainActivity.this);
                notificationUtils.sendNotification("测试标题", "测试内容");

            }
        });
    }
}
