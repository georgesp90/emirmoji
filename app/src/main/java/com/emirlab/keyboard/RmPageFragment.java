package com.emirlab.keyboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kieshalab.keyboard.R;

/**
 * Created by mist on 19.12.16.
 */


public class RmPageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.roko_mojis_p0, null);
    }
}