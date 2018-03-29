package net.masonliu.gridviewpager.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Toast;


import net.masonliu.gridviewpager.GridViewPager;
import net.masonliu.gridviewpager.GridViewPagerDataAdapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liumeng on 10/30/15.
 */
public class MainActivity extends Activity {

    private String[] mStrs = new String[]{"", "", "", "", "", "", ""};

    private GridViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (GridViewPager) findViewById(R.id.myviewpager);

        final List<String> list= Arrays.asList(mStrs);


        mViewPager.setGridViewPagerDataAdapter(new GridViewPagerDataAdapter<String>(list, 1, 2) {
            @Override
            public BaseAdapter getGridViewAdapter(List<String> currentList,int pageIndex) {
                return new MyGridViewAdapter(getApplicationContext(), currentList);
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id, int pageIndex) {

            }
        });
    }
}
