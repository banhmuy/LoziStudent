package com.example.tg.lozi.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tg.lozi.activity.R;

/**
 * Created by TG on 03-12-17.
 */

public class NotificationFragment extends Fragment {
	View view;
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		view=inflater.inflate(R.layout.fragment_notification,container,false);

		return view;
	}
}
