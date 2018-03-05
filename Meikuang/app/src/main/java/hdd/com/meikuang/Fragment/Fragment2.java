package hdd.com.meikuang.Fragment;


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
            { "水泵1", "水泵2", "水泵3", "水泵4","水泵5", "水泵6", "水泵7",
                    "水泵8","水泵9","水泵10","水泵11","水泵12","水泵13","水泵14","水泵15"};
    private String[] descs = new String[]
            { "正常", "正常", "故障", "正常","正常", "故障", "正常", "正常","正常",
                    "故障", "正常","正常", "故障", "正常", "正常"};
    private int[] imageIds = new int[]
            { R.drawable.shuibeng2, R.drawable.shuibeng2, R.drawable.shuibeng2,
                    R.drawable.shuibeng2,R.drawable.shuibeng2, R.drawable.shuibeng2
                    , R.drawable.shuibeng2, R.drawable.shuibeng2,R.drawable.shuibeng2, R.drawable.shuibeng2,
                    R.drawable.shuibeng2,R.drawable.shuibeng2, R.drawable.shuibeng2
                    , R.drawable.shuibeng2, R.drawable.shuibeng2};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
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
        ListView list = (ListView) view.findViewById(R.id.mylist);
        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);
        return view;
    }
}
