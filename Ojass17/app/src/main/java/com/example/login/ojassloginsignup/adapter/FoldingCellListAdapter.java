package com.example.login.ojassloginsignup.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.model.Item;
import com.ramotion.foldingcell.FoldingCell;

import java.util.HashSet;
import java.util.List;

/**
 * Simple example of ListAdapter for using with Folding Cell
 * Adapter holds indexes of unfolded elements for correct work with default reusable views behavior
 */
public class FoldingCellListAdapter extends ArrayAdapter<Item> {

    private HashSet<Integer> unfoldedIndexes = new HashSet<>();
    private View.OnClickListener defaultRequestBtnClickListener;


    public FoldingCellListAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get item for selected view
        Item item = getItem(position);
        // if cell is exists - reuse it, if not - create the new one from resource
        FoldingCell cell = (FoldingCell) convertView;
        ViewHolder viewHolder;
        if (cell == null) {
            viewHolder = new ViewHolder();
            LayoutInflater vi = LayoutInflater.from(getContext());
            cell = (FoldingCell) vi.inflate(R.layout.cell, parent, false);
            // binding view parts to view holder
            //  viewHolder.price = (TextView) cell.findViewById(R.id.title_price);
            //  viewHolder.time = (TextView) cell.findViewById(R.id.title_time_label);
            //  viewHolder.date = (TextView) cell.findViewById(R.id.title_date_label);
            //  viewHolder.fromAddress = (TextView) cell.findViewById(R.id.title_from_address);
            //  viewHolder.toAddress = (TextView) cell.findViewById(R.id.title_to_address);
            //  viewHolder.requestsCount = (TextView) cell.findViewById(R.id.title_requests_count);
            //  viewHolder.pledgePrice = (TextView) cell.findViewById(R.id.title_pledge);
            //  viewHolder.contentRequestBtn = (TextView) cell.findViewById(R.id.content_request_btn);
            viewHolder.textView1 = (TextView) cell.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) cell.findViewById(R.id.textView2);
            viewHolder.textView3 = (TextView) cell.findViewById(R.id.textView3);
            viewHolder.textView4 = (TextView) cell.findViewById(R.id.textView4);
            viewHolder.textView5 = (TextView) cell.findViewById(R.id.textView5);
            viewHolder.textView6 = (TextView) cell.findViewById(R.id.textView6);
            viewHolder.textView7 = (TextView) cell.findViewById(R.id.textView7);
            viewHolder.IW1 = (ImageView) cell.findViewById(R.id.iW1);
            viewHolder.IW2 = (ImageView) cell.findViewById(R.id.iW2);
            viewHolder.IW3 = (ImageView) cell.findViewById(R.id.iW3);
            viewHolder.IW4 = (ImageView) cell.findViewById(R.id.iW4);
            viewHolder.IW5 = (ImageView) cell.findViewById(R.id.iW5);
            viewHolder.IW6 = (ImageView) cell.findViewById(R.id.iW6);
            viewHolder.IW7 = (ImageView) cell.findViewById(R.id.iW7);
            cell.setTag(viewHolder);
        } else {
            // for existing cell set valid valid state(without animation)
            if (unfoldedIndexes.contains(position)) {
                cell.unfold(true);
            } else {
                cell.fold(true);
            }
            viewHolder = (ViewHolder) cell.getTag();
        }

        // bind data from selected element to view through view holder
        // viewHolder.price.setText(item.getPrice());
        // viewHolder.time.setText(item.getTime());
        // viewHolder.date.setText(item.getDate());
        // viewHolder.fromAddress.setText(item.getFromAddress());
        // viewHolder.toAddress.setText(item.getToAddress());
        // viewHolder.requestsCount.setText(String.valueOf(item.getRequestsCount()));
        // viewHolder.pledgePrice.setText(item.getPledgePrice());
        if (item.getSub1() != null)
            viewHolder.textView1.setText(item.getSub1());
        else {
            viewHolder.textView1.setVisibility(View.GONE);
            viewHolder.IW1.setVisibility(View.GONE);
        }
        if (item.getSub2() != null)
            viewHolder.textView2.setText(item.getSub2());
        else {
            viewHolder.textView2.setVisibility(View.GONE);
            viewHolder.IW2.setVisibility(View.GONE);
        }
        if (item.getSub3() != null)
            viewHolder.textView3.setText(item.getSub3());
        else {
            viewHolder.textView3.setVisibility(View.GONE);
            viewHolder.IW3.setVisibility(View.GONE);
        }
        if (item.getSub4() != null)
            viewHolder.textView4.setText(item.getSub4());
        else{
            viewHolder.textView4.setVisibility(View.GONE);
            viewHolder.IW4.setVisibility(View.GONE);
        }
        if(item.getSub5()!=null)
            viewHolder.textView5.setText(item.getSub5());
        else {
            viewHolder.textView5.setVisibility(View.GONE);
            viewHolder.IW5.setVisibility(View.GONE);
        }
        if(item.getSub6()!=null)
            viewHolder.textView6.setText(item.getSub6());
        else {
            viewHolder.textView6.setVisibility(View.GONE);
            viewHolder.IW6.setVisibility(View.GONE);
        }
        if(item.getSub7()!=null)
            viewHolder.textView7.setText(item.getSub7());
        else {
            viewHolder.IW7.setVisibility(View.GONE);
            viewHolder.textView7.setVisibility(View.GONE);
        }
        // set custom btn handler for list item from that item
        if (item.getRequestBtnClickListener() != null) {
            viewHolder.textView1.setOnClickListener(item.getRequestBtnClickListener());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.textView1.setOnClickListener(defaultRequestBtnClickListener);
        }
        if (item.getRequestBtnClickListener2() != null) {
            viewHolder.textView2.setOnClickListener(item.getRequestBtnClickListener2());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.textView2.setOnClickListener(defaultRequestBtnClickListener);
        }
        if (item.getRequestBtnClickListener3() != null) {
            viewHolder.textView3.setOnClickListener(item.getRequestBtnClickListener3());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.textView3.setOnClickListener(defaultRequestBtnClickListener);
        }
        if (item.getRequestBtnClickListener4() != null) {
            viewHolder.textView4.setOnClickListener(item.getRequestBtnClickListener4());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.textView4.setOnClickListener(defaultRequestBtnClickListener);
        }
        if (item.getRequestBtnClickListener5() != null) {
            viewHolder.textView5.setOnClickListener(item.getRequestBtnClickListener5());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.textView5.setOnClickListener(defaultRequestBtnClickListener);
        }
        if (item.getRequestBtnClickListener6() != null) {
            viewHolder.textView6.setOnClickListener(item.getRequestBtnClickListener6());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.textView6.setOnClickListener(defaultRequestBtnClickListener);
        }
        if (item.getRequestBtnClickListener7() != null) {
            viewHolder.textView7.setOnClickListener(item.getRequestBtnClickListener7());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.textView7.setOnClickListener(defaultRequestBtnClickListener);
        }


        return cell;
    }

    // simple methods for register cell state changes
    public void registerToggle(int position) {
        if (unfoldedIndexes.contains(position))
            registerFold(position);
        else
            registerUnfold(position);
    }

    public void registerFold(int position) {
        unfoldedIndexes.remove(position);
    }

    public void registerUnfold(int position) {
        unfoldedIndexes.add(position);
    }

    public View.OnClickListener getDefaultRequestBtnClickListener() {
        return defaultRequestBtnClickListener;
    }

    public void setDefaultRequestBtnClickListener(View.OnClickListener defaultRequestBtnClickListener) {
        this.defaultRequestBtnClickListener = defaultRequestBtnClickListener;
    }

    // View lookup cache
    private static class ViewHolder {
        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;
        ImageView IW1,IW2,IW3,IW4,IW5,IW6,IW7;
        TextView contentRequestBtn;
        TextView pledgePrice;
        TextView fromAddress;
        TextView toAddress;
        TextView requestsCount;
        TextView date;
        TextView time;
    }
}
