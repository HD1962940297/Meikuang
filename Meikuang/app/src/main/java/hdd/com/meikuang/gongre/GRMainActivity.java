package hdd.com.meikuang.gongre;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import hdd.com.meikuang.R;
import hdd.com.meikuang.ZhuActivity;
import hdd.com.meikuang.gongre.Fragment.Fragment01;
import hdd.com.meikuang.gongre.Fragment.Fragment021;

public class GRMainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt1;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gongre_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("供热系统");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
         bt1 = (Button)findViewById(R.id.gongre_yuce);
         bt1.setOnClickListener(this);
         bt2 = (Button)findViewById(R.id.gongre_pingjia);
         bt2.setOnClickListener(this);

         replaceFragment(new Fragment01());
         bt1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gongre_yuce:
                replaceFragment(new Fragment01());
                bt1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
                bt2.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                break;
            case R.id.gongre_pingjia:
                replaceFragment(new Fragment021());
                bt1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                bt2.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
                break;
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.gongre_fragment, fragment);
        transaction.commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, ZhuActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //清除栈中在主页面之上的Activity
        startActivity(intent);
        return true;
    }
}
