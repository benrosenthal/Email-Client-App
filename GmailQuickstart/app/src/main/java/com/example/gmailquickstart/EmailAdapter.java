package com.example.gmailquickstart;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by User_1_Benjamin_Rosenthal on 2/26/16.
 */
public class EmailAdapter extends BaseAdapter {

    private Context mContext;
    private Email[] mEmails;

    public EmailAdapter(Context context, Email[] emails) {
        mContext = context;
        mEmails = emails;
    }

    @Override
    public int getCount() {
        return mEmails.length;
    }

    @Override
    public Object getItem(int position) {
        return mEmails[position];
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
