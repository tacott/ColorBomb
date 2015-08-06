package com.acoupletacos.colorbomb;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ColorBombActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ColorBombFragment();
    }

}
