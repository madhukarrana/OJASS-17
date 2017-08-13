package com.example.login.ojassloginsignup.model;

import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Simple POJO model for example
 */
public class Item {

    private String price;
    private String pledgePrice;
    private String fromAddress;
    private String toAddress;
    private int requestsCount;
    private String date;
    private String time;
    private String sub1,sub2,sub3,sub4,sub5,sub6,sub7;

    private View.OnClickListener requestBtnClickListener1,requestBtnClickListener2,requestBtnClickListener3,requestBtnClickListener4,requestBtnClickListener5,requestBtnClickListener6,requestBtnClickListener7;

    public Item() {
    }

    public Item(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        this.sub1 = s1;
        this.sub2 = s2;
        this.sub3 = s3;
        this.sub4 = s4;
        this.sub5 = s5;
        this.sub6 = s6;
        this.sub7 = s7;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public String getSub4() {
        return sub4;
    }

    public void setSub4(String sub4) {
        this.sub4 = sub4;
    }

    public String getSub5() {
        return sub5;
    }

    public void setSub5(String sub5) {
        this.sub5 = sub5;
    }

    public String getSub6() {
        return sub6;
    }

    public void setSub6(String sub6) {
        this.sub6 = sub6;
    }

    public String getSub7() {
        return sub7;
    }

    public void setSub7(String sub7) {
        this.sub7 = sub7;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPledgePrice() {
        return pledgePrice;
    }

    public void setPledgePrice(String pledgePrice) {
        this.pledgePrice = pledgePrice;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public int getRequestsCount() {
        return requestsCount;
    }

    public void setRequestsCount(int requestsCount) {
        this.requestsCount = requestsCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener1;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener1 = requestBtnClickListener;
    }

    public View.OnClickListener getRequestBtnClickListener2() {
        return requestBtnClickListener2;
    }

    public void setRequestBtnClickListener2(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener2 = requestBtnClickListener;
    }

    public View.OnClickListener getRequestBtnClickListener3() {
        return requestBtnClickListener3;
    }

    public void setRequestBtnClickListener3(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener3 = requestBtnClickListener;
    }

    public View.OnClickListener getRequestBtnClickListener4() {
        return requestBtnClickListener4;
    }

    public void setRequestBtnClickListener4(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener4 = requestBtnClickListener;
    }

    public View.OnClickListener getRequestBtnClickListener5() {
        return requestBtnClickListener5;
    }

    public void setRequestBtnClickListener5(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener5 = requestBtnClickListener;
    }

    public View.OnClickListener getRequestBtnClickListener6() {
        return requestBtnClickListener6;
    }

    public void setRequestBtnClickListener6(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener6 = requestBtnClickListener;
    }

    public View.OnClickListener getRequestBtnClickListener7() {
        return requestBtnClickListener7;
    }

    public void setRequestBtnClickListener7(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener7 = requestBtnClickListener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (requestsCount != item.requestsCount) return false;
        if (price != null ? !price.equals(item.price) : item.price != null) return false;
        if (pledgePrice != null ? !pledgePrice.equals(item.pledgePrice) : item.pledgePrice != null)
            return false;
        if (fromAddress != null ? !fromAddress.equals(item.fromAddress) : item.fromAddress != null)
            return false;
        if (toAddress != null ? !toAddress.equals(item.toAddress) : item.toAddress != null)
            return false;
        if (date != null ? !date.equals(item.date) : item.date != null) return false;
        return !(time != null ? !time.equals(item.time) : item.time != null);

    }

    @Override
    public int hashCode() {
        int result = price != null ? price.hashCode() : 0;
        result = 31 * result + (pledgePrice != null ? pledgePrice.hashCode() : 0);
        result = 31 * result + (fromAddress != null ? fromAddress.hashCode() : 0);
        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);
        result = 31 * result + requestsCount;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Subevent1","Subevent2","Subevent3","Subevent4","Subevent5","Subevent6","Subevent7"));
        items.add(new Item("Subevent1","Subevent2","Subevent3","Subevent4","Subevent5",null,null));
        items.add(new Item("Subevent1","Subevent2","Subevent3","Subevent4","Subevent5","Subevent6","Subevent7"));
        items.add(new Item("Subevent1","Subevent2","Subevent3","Subevent4","Subevent5","Subevent6","Subevent7"));
        items.add(new Item("Subevent1","Subevent2","Subevent3","Subevent4","Subevent5","Subevent6","Subevent7"));
        return items;

    }

}
