package com.ytzys.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TitleFragment extends ListFragment {

	OnTitleClickListener callback;

	interface OnTitleClickListener {
		void onTitleClick(int postion);
	}

	String[] titles = { "title 1", "title 2" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, titles));
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		callback = (OnTitleClickListener) activity;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		callback.onTitleClick(position);
	}

}
