package tw.com.ei.mylisttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    private List<Map<String,Object>> data;
    private String []from =new String[]{"title","content","img"};
    private int [] to=new int[]{R.id.layout_title,R.id.layout_content,R.id.layout_img};
    private SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.list);

        initLayout();
    }
    public void initLayout(){

        data=new LinkedList<>();

        Map<String,Object> d0=new HashMap<>();
        d0.put("title","title 1");
        d0.put("content","content 1");
        d0.put("img",R.drawable.android);
        data.add(d0);

        Map<String,Object> d1=new HashMap<>();
        d1.put(from[0],"title 2");
        d1.put(from[1],"content 2");
        d1.put(from[2],R.drawable.android);
        data.add(d1);

        adapter=new SimpleAdapter(this,data,R.layout.layout_item,from,to);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1) {
                    Intent it = new Intent(MainActivity.this, Page2Activity.class);
                    startActivity(it);
                };
            }
        });


    }
    public void addData(View view){
        Map<String,Object> d0=new HashMap<>();
        d0.put("title","title 1");
        d0.put("content","content 1");
        d0.put("img",R.drawable.android);
        data.add(d0);
        adapter.notifyDataSetChanged();
    }

}
