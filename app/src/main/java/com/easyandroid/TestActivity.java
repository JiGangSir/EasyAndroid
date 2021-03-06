package com.easyandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;


/**
 * package: com.easyandroid.TestActivity
 * author: gyc
 * description:
 * time: create at 2017/1/8 21:06
 */

public class TestActivity extends BaseActivity {

    EditText edittext1;
    PopupKeyboardUtil smallKeyboardUtil;
    private View viewContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

        edittext1 = findViewById(R.id.edittext1);

        smallKeyboardUtil = new PopupKeyboardUtil(self());
        smallKeyboardUtil.attachTo(edittext1, false);
    }

    public void onClickView(View view) {
        if (view.getId() == R.id.btn1)
            smallKeyboardUtil.showSoftKeyboard();
        if (view.getId() == R.id.btn2)
            smallKeyboardUtil.hideSoftKeyboard();

    }

    private Activity self() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}