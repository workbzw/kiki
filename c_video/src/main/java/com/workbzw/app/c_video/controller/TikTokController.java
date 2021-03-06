package com.workbzw.app.c_video.controller;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.workbzw.app.c_video.BuildConfig;
import com.workbzw.app.c_video.video.videolist.debug.DebugInfoView;

import xyz.doikki.videoplayer.controller.BaseVideoController;

/**
 * 抖音
 * Created by Doikki on 2018/1/6.
 */

public class TikTokController extends BaseVideoController {

    public TikTokController(@NonNull Context context) {
        super(context);
    }

    public TikTokController(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TikTokController(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        //显示调试信息
        if (BuildConfig.DEBUG) {
            addControlComponent(new DebugInfoView(getContext()));
        }
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    public boolean showNetWarning() {
        //不显示移动网络播放警告
        return false;
    }
}
