package hdd.com.meikuang.gongre.Fragment;

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

public class Fragment01 extends Fragment {
    private String[] names = new String[]
            { "故障0", "故障1", "故障2", "故障3","故障4", "故障5", "故障6", "故障7","故障8","故障9"};
    private String[] descs = new String[]
            { "2017-11-20 14.12.34", "2017-11-20 14.12.34", "2017-11-20 14.12.34", "2017-11-20 14.12.34","2017-11-20 14.12.34",
                    "2017-11-20 14.12.34", "2017-11-20 14.12.34", "2017-11-20 14.12.34","2017-11-20 14.12.34", "2017-11-20 14.12.34"};
    private int[] imageIds = new int[]
            { R.drawable.a , R.drawable.b , R.drawable.c , R.drawable.d ,R.drawable.e ,
                    R.drawable.f , R.drawable.g , R.drawable.h ,R.drawable.i , R.drawable.j };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gongre_yuce, container, false);

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
                R.layout.simple_item,
                new String[] { "personName", "header" , "desc"},
                new int[] { R.id.name, R.id.header , R.id.desc });
        ListView list = (ListView) view.findViewById(R.id.yuce_main);
        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);
        return view;
    }
}
