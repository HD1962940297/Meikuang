package hdd.com.meikuang.pidai;

import android.support.v4.app.Fragment;
import android.os.Bundle;
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

public class Fragment1 extends Fragment {

    private String[] names = new String[]
            { "创采主运二部皮带", "创采主运一部皮带", "大巷一部皮带", "大巷二部皮带","大巷三部皮带","小巷一部皮带", "小巷二部皮带", "小巷三部皮带",
                    "小巷四部皮带","中巷一部皮带","中巷二部皮带","中巷三部皮带","中巷四部皮带","中巷五部皮带","中巷六部皮带","创采主运二部皮带"};
    private String[] descs = new String[]
            { "转速:40", "转速:50", "转速:50",
                    "转速:45","转速:47", "转速:49", "转速:50",
                    "转速:50", "转速:45", "转速:46", "转速:50",
                    "转速:50", "转速:45","转速:40", "转速:50",
                    "转速:50"};
    private int[] imageIds = new int[]
            { R.drawable.pintu, R.drawable.pintu, R.drawable.jiayou,
                    R.drawable.pintu,R.drawable.zhinanzhen, R.drawable.zhinanzhen
                    , R.drawable.zhinanzhen, R.drawable.zhinanzhen,R.drawable.zhinanzhen,
                    R.drawable.zhinanzhen, R.drawable.zhinanzhen,R.drawable.zhinanzhen,
                    R.drawable.zhinanzhen, R.drawable.zhinanzhen, R.drawable.zhinanzhen,
                    R.drawable.zhinanzhen, R.drawable.zhinanzhen};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_pidai1, container, false);

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
        ListView list = (ListView) view.findViewById(R.id.Pmylist1);
        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);
        return view;
    }

}
