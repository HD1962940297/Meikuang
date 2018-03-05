package hdd.com.meikuang.pidai;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import hdd.com.meikuang.R;
import hdd.com.meikuang.ZhuActivity;

public class pidaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pidai);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("皮带系统");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, ZhuActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //清除栈中在主页面之上的Activity
        startActivity(intent);
        return true;
    }
}
