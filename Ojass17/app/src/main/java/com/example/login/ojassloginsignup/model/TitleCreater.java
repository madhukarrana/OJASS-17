package com.example.login.ojassloginsignup.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 19-01-2017.
 */

public class TitleCreater {
    static TitleCreater _titleCreator;

    List<TitleParent> _titleParents;

    public TitleCreater(Context context) {
        _titleParents=new ArrayList<>();
        TitleParent title =new TitleParent(String.format("How should questions for FAQs be formatted?"));
        _titleParents.add(title);
        title =new TitleParent(String.format("How should a page of FAQs be titled?"));
        _titleParents.add(title);
        title =new TitleParent(String.format("How do I insert an arrow to return to the top of the page?"));
        _titleParents.add(title);
        title =new TitleParent(String.format("Where can I find a good example of an FAQ?"));
        _titleParents.add(title);
        for(int i=5;i<=20;i++)
        {
            title=new TitleParent(String.format("This is Question #%d",i));
            _titleParents.add(title);
        }
    }

    public static TitleCreater get(Context context)
    {
        if(_titleCreator == null)
            _titleCreator=new TitleCreater(context);
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
