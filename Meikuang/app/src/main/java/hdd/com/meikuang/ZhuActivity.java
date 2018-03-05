package hdd.com.meikuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hdd.com.meikuang.fengji.fengjiActivity;
import hdd.com.meikuang.gongre.GRMainActivity;
import hdd.com.meikuang.paishui.MainActivity;
import hdd.com.meikuang.pidai.pidaiActivity;

public class ZhuActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu);
    }

    public void inten(View resourse) {
        intent = new Intent(ZhuActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void intenfengji(View re) {
        intent = new Intent(ZhuActivity.this,fengjiActivity.class);
        startActivity(intent);
    }

    public void intertidal(View re) {
        intent = new Intent(ZhuActivity.this,pidaiActivity.class);
        startActivity(intent);
    }
    public void intengongre(View re) {
        intent = new Intent(ZhuActivity.this,GRMainActivity.class);
        startActivity(intent);
    }
}
