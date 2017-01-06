package com.lqr.imagepicker.loader;

import android.app.Activity;
import android.widget.ImageView;

import java.io.Serializable;

public interface ImageLoader extends Serializable {

    void displayImage(Activity activity, String path, ImageView imageView, int width, int height);

    void clearMemoryCache();
}
