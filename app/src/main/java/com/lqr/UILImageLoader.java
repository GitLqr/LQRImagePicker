package com.lqr;

import android.app.Activity;
import android.net.Uri;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.assist.ImageSize;

/**
 * @创建者 CSDN_LQR
 * @描述 仿微信图片选择控件需要用到的图片加载类
 */
public class UILImageLoader implements com.lqr.imagepicker.loader.ImageLoader {


    @Override
    public void displayImage(Activity activity, String path, ImageView imageView, int width, int height) {
        ImageSize size = new ImageSize(width, height);
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(Uri.parse("file://" + path).toString(), imageView, size);
    }

    @Override
    public void clearMemoryCache() {
    }
}
