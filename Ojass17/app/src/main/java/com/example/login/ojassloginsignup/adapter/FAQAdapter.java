package com.example.login.ojassloginsignup.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.Widgets.TitleChildViewHolder;
import com.example.login.ojassloginsignup.Widgets.TitleParentViewHolder;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.login.ojassloginsignup.model.TitleChild;
import com.example.login.ojassloginsignup.model.TitleParent;

import java.util.List;

/**
 * Created by admin on 19-01-2017.
 */

public class FAQAdapter extends ExpandableRecyclerAdapter<TitleParentViewHolder,TitleChildViewHolder> {

    LayoutInflater inflater;

    public FAQAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater =LayoutInflater.from(context);
    }

    @Override
    public TitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.faq_parent_layout,viewGroup,false);
        return new TitleParentViewHolder(view);
    }

    @Override
    public TitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.faq_child_layout,viewGroup,false);
        return new TitleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {
        TitleParent title = (TitleParent)o;
        titleParentViewHolder._textView.setText(title.getTitle());
    }

    @Override
    public void onBindChildViewHolder(TitleChildViewHolder titleChildViewHolder, int i, Object o) {
        TitleChild title=(TitleChild)o;
        titleChildViewHolder.option1.setText(title.getOption1());
    }
}
