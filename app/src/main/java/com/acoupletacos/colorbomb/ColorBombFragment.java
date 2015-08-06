package com.acoupletacos.colorbomb;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by troyacott on 8/5/15.
 */
public class ColorBombFragment extends Fragment {

    public static ColorBombFragment newInstance() {
        return new ColorBombFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color_bomb, container, false);

        return view;
    }
}
