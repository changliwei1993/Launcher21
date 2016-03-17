package com.android.launcher2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.launcher.R;

import java.util.ArrayList;

/**
 * Created by changliwei1993gmail on 16-3-17.
 */
public class FolderGridAdapter extends BaseAdapter {

    private ArrayList<FolderIcon> fiList=new ArrayList<>();
    private LayoutInflater mInflater;
    private Context mContext;


    public FolderGridAdapter(Context context,ArrayList<FolderIcon> fiList) {
        this.fiList=fiList;
        mContext = context;
        mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return fiList.size();
    }

    @Override
    public Object getItem(int position) {
        return fiList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=fiList.get(position);

        return convertView;
    }



}
