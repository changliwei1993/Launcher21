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

    private ArrayList<String> mNameList = new ArrayList<String>();
    private ArrayList<Drawable> mDrawableList = new ArrayList<Drawable>();
    private LayoutInflater mInflater;
    private Context mContext;


    public FolderGridAdapter(Context context, ArrayList<String> nameList, ArrayList<Drawable> drawableList) {
        mNameList = nameList;
        mDrawableList = drawableList;
        mContext = context;
        mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return mNameList.size();
    }

    @Override
    public Object getItem(int position) {
        return mNameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ItemViewTag viewTag;

        if (convertView == null)
        {
            convertView = mInflater.inflate(R.layout.gridview_item, null);

            viewTag = new ItemViewTag((ImageView) convertView.findViewById(R.id.grid_icon));
            convertView.setTag(viewTag);
        } else
        {
            viewTag = (ItemViewTag) convertView.getTag();
        }
        // set icon
        viewTag.mIcon.setBackgroundDrawable(mDrawableList.get(position));
        return convertView;
    }

    class ItemViewTag
    {
        protected ImageView mIcon;

        public ItemViewTag(ImageView icon)
        {
            this.mIcon = icon;
        }
    }



}
