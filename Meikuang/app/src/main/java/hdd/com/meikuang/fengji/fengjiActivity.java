package hdd.com.meikuang.fengji;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import hdd.com.meikuang.R;
import hdd.com.meikuang.ZhuActivity;


public class fengjiActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fengji);
        if(Build.VERSION.SDK_INT >=21){
            getSupportActionBar().setElevation(0);
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null) {
            actionBar.setTitle("风机检测");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        b1 = (Button) findViewById(R.id.id_Fb1);
        b2 = (Button) findViewById(R.id.id_Fb2);
        b3 = (Button) findViewById(R.id.id_Fb3);
        b4 = (Button) findViewById(R.id.id_Fb4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        replaceFragment(new Fragment1());
        b1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_Fb1:
                replaceFragment(new Fragment1());
                b1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
                b2.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b3.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b4.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                break;
            case R.id.id_Fb2:
                replaceFragment(new Fragment2());
                b2.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
                b1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b3.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b4.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                break;
            case R.id.id_Fb3:
                replaceFragment(new Fragment3());
                b3.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
                b1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b2.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b4.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                break;
            case R.id.id_Fb4:
                replaceFragment(new Fragment4());
                b4.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
                b1.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b2.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
                b3.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.id_Ffragment, fragment);
        transaction.commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, ZhuActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        return true;
    }
}
