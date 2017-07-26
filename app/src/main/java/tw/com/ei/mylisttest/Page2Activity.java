package tw.com.ei.mylisttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

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
            return null;
        }
    }
}
