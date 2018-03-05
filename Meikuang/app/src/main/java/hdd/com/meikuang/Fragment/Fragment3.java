package hdd.com.meikuang.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hdd.com.meikuang.R;


public class Fragment3 extends Fragment {

    TextView t11,t12,t13,t14,t21,t22,t23,t24;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_fragment3, container, false);
        t11 = (TextView) view.findViewById(R.id.id_s11);
        t12 = (TextView) view.findViewById(R.id.id_s12);
        t13 = (TextView) view.findViewById(R.id.id_s13);
        t14 = (TextView) view.findViewById(R.id.id_s14);
        t21 = (TextView) view.findViewById(R.id.id_s21);
        t22 = (TextView) view.findViewById(R.id.id_s22);
        t23 = (TextView) view.findViewById(R.id.id_s23);
        t24 = (TextView) view.findViewById(R.id.id_s24);
        t11.setText("15");
        t12.setText("12");
        t13.setText("2");
        t14.setText("1");
        t21.setText("20");
        t22.setText("0.22");
        t23.setText("23");
        t24.setText("24");
        return view;
    }

}
