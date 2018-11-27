package haoran.bwie.com.haoran20181112;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import haoran.bwie.com.haoran20181112.fragment.PlusOneFragment;
import haoran.bwie.com.haoran20181112.fragment.PlusOneFragment2;

public class MainActivity extends AppCompatActivity {

    private ImageView touxiang;
    private ListView listview;
    private List<String> list = new ArrayList<>();
    private FragmentActivity fragmentactivity;
    private FragmentManager fragment=getSupportFragmentManager();
    private PlusOneFragment frag1;
    private PlusOneFragment2 frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        list.add("客服热线");
        list.add("营业部网点");
        list.add("系统设置");

        MyAdapter1 myAdapter1 = new MyAdapter1(MainActivity.this, list);
        listview.setAdapter(myAdapter1);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        fragment.beginTransaction().replace(R.id.frameLayout,frag1).commit();
                        break;
                    case 1:
                        fragment.beginTransaction().replace(R.id.frameLayout,frag2).commit();
                        break;
                    case 2:

                        break;

                }
            }
        });


    }

    private void initView() {
        touxiang = (ImageView) findViewById(R.id.touxiang);
        listview = (ListView) findViewById(R.id.listview);
    }
}
