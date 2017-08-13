package com.example.login.ojassloginsignup.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.adapter.FAQAdapter;
import com.example.login.ojassloginsignup.model.TitleChild;
import com.example.login.ojassloginsignup.model.TitleCreater;
import com.example.login.ojassloginsignup.model.TitleParent;

import java.util.ArrayList;
import java.util.List;

public class FAQActivity extends Activity {

    RecyclerView recyclerView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((FAQAdapter)recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        recyclerView=(RecyclerView)findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FAQAdapter adapter = new FAQAdapter(this,initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);
        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        TitleCreater titleCreater= TitleCreater.get(this);
        List<TitleParent> titles=titleCreater.getAll();
        List<ParentObject> parentObject = new ArrayList<>();
        for(TitleParent title:titles)
        {
            List<Object> childList = new ArrayList<>();
            childList.add(new TitleChild("It is LSE web style to title a page of FAQs 'Frequently asked questions (FAQs)'. While the abbreviation is in quite common usage this ensures that there can be no mistaking what they are"));
            title.setChildObjectList(childList);
            parentObject.add(title);
        }
        return parentObject;
    }
}