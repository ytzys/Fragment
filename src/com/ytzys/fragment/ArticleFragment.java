package com.ytzys.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ArticleFragment extends Fragment {

	String[] articles = { "This is the first arcticle.",
			"This is the second arcticle." };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		inflater.inflate(R.layout.article_fragment_layout, container);
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();

		int position = getArguments().getInt("position");
		setArticleText(position);
	}

	private void setArticleText(int position) {
		TextView text = (TextView) getActivity().findViewById(R.id.text);
		text.setText(articles[position]);
	}

}
