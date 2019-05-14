package com.example.mahe.mttndirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.mahe.mttndirectory.Adapter.MyAdapter;
import com.example.mahe.mttndirectory.Model.TitleChild;
import com.example.mahe.mttndirectory.Model.TitleCreator;
import com.example.mahe.mttndirectory.Model.TitleParent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((MyAdapter)recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView) findViewById(R.id.myRecyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this,initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        TitleCreator titleCreator=TitleCreator.get(this);
        List<TitleParent> titles = titleCreator.getAll();
        List<ParentObject> parentObject =new ArrayList<>();
        for(TitleParent title:titles)
        {
            List<Object> childList = new ArrayList<>();

                childList.add(new TitleChild("Dasharatha - 08202574202", "Eshwar Nagar - 0820257200"));


            title.setChildObjectList(childList);
            parentObject.add(title);
        }

        return parentObject;
    }
}
