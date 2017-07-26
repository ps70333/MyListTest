package tw.com.ei.mylisttest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {
    private ListView list;
    private String []data={"Android","IOS","Windows","SimonOS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        list=(ListView)findViewById(R.id.page2_list);
        initList();
    }
    public void initList(){
        //list.setAdapter(myAdapter);
    }
    public class myAdapter extends BaseAdapter{
        private LayoutInflater inflater;
        myAdapter(){
            inflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public Object getItem(int position) {
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView==null){
                convertView=inflater.inflate()
                TextView tv=(TextView)(convertView.findViewById(R.id.item2_tv));
                tv.setText(data[position]);
            }
            return convertView;
        }
    }
}
