package edu.dam.pm.yatamap;

import android.os.Bundle;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setToolbarTitle(getString(R.string.home_title));
    }
}