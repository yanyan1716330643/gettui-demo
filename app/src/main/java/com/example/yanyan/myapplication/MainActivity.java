package com.example.yanyan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.igexin.sdk.PushManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //821899cec21342c68690f1f9eb034bfb
        setContentView(R.layout.activity_main);
        // com.getui.demo.DemoPushService 为第三方自定义推送服务
        PushManager.getInstance().initialize(this.getApplicationContext(), com.example.yanyan.myapplication.DemoPushService.class);
        // com.getui.demo.DemoIntentService 为第三方自定义的推送服务事件接收类
        PushManager.getInstance().registerPushIntentService(this.getApplicationContext(), com.example.yanyan.myapplication.DemoIntentService.class);

        PushManager.getInstance().setHeartbeatInterval(this.getApplicationContext(),5);
    }
}
