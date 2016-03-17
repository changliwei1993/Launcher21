package com.android.launcher2;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.android.launcher.R;

/**
 * Created by changliwei1993gmail on 16-3-17.
 */
public class FolderScreenLayout extends RelativeLayout {
    public FolderScreenLayout(Context context) {
        super(context);
    }

    public FolderScreenLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public FolderScreenLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void initView() {
        for (int i = 0; i < 15; i++) {
            addView(creatAFolderIcon());
        }

    }


    private FolderIcon creatAFolderIcon() {
        FolderIcon icon = (FolderIcon) LayoutInflater.from(getContext()).inflate(R.layout.folder_icon, this, false);
        return icon;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int p=0;
        for (int i = 0; i < getChildCount(); i++) {
            View childView = getChildAt(i);
            childView.layout(29+i%4*98,29+i/4*98,98+i%4*98,98+i/4*98);
        }
    }
}
