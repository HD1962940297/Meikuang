package hdd.com.meikuang.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import hdd.com.meikuang.R;


public class Fragment1 extends Fragment implements View.OnClickListener {


    Button button1;
    Button button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        button1 = (Button) view.findViewById(R.id.bu_1);
        button2 = (Button) view.findViewById(R.id.bu_2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        replaceFragment(new Fragment1_1());
        button1.setTextColor(ContextCompat.getColor(getActivity(),R.color.colorPrimary));
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bu_1:
                replaceFragment(new Fragment1_1());
                button1.setTextColor(ContextCompat.getColor(getActivity(),R.color.colorPrimary));
                button2.setTextColor(ContextCompat.getColor(getActivity(),R.color.colorPrimaryDark));
                break;
            case R.id.bu_2:
                replaceFragment(new Fragment1_2());
                button2.setTextColor(ContextCompat.getColor(getActivity(),R.color.colorPrimary));
                button1.setTextColor(ContextCompat.getColor(getActivity(),R.color.colorPrimaryDark));
                break;
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.bu_fragment, fragment);
        transaction.commit();
    }
}
