package hdd.com.meikuang.fengji;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hdd.com.meikuang.R;


public class Fragment2 extends Fragment {


    private String[] names = new String[]
            { "联轴器", "电机", "电机", "叶轮","主轴", "主轴", "主轴",
                    "主轴","主轴","主轴","主轴","主轴","主轴","主轴","主轴"};
    private String[] descs = new String[]
            { "2016-08-14 10:46:36", "2016-07-30 23:12:00", "2016-07-29 23:12:00",
                    "2016-07-22 23:12:00","2016-07-17 23:12:00", "2016-07-17 20:12:00",
                    "2016-07-16 23:12:00", "2016-07-14 23:12:00","2016-07-13 23:12:00",
                    "2016-07-12 23:12:00", "2016-07-11 23:12:00","2016-07-10 23:12:00",
                    "2016-07-09 23:12:00", "2016-07-08 23:12:00", "2016-07-04 23:12:00"};
    private int[] imageIds = new int[]
            { R.drawable.pintu, R.drawable.pintu, R.drawable.jiayou,
                    R.drawable.pintu,R.drawable.zhinanzhen, R.drawable.zhinanzhen
                    , R.drawable.zhinanzhen, R.drawable.zhinanzhen,R.drawable.zhinanzhen,
                    R.drawable.zhinanzhen, R.drawable.zhinanzhen,R.drawable.zhinanzhen,
                    R.drawable.zhinanzhen, R.drawable.zhinanzhen, R.drawable.zhinanzhen};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment2, container, false);

        List<Map<String, Object>> listItems =
                new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++)
        {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", descs[i]);
            listItems.add(listItem);
        }
        // 创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), listItems,
                R.layout.fengji_item,
                new String[] { "personName", "header" , "desc"},
                new int[] { R.id.name, R.id.header , R.id.desc });
        ListView list = (ListView) view.findViewById(R.id.Fmylist);
        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);
        return view;
    }

}
