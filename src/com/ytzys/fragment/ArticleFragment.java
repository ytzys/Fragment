package com.ytzys.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ArticleFragment extends Fragment {

	String[] articles = { "This is the first arcticle.",
			"This is the second arcticle." };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// 注意不要用return super.onCreateView(LayoutInflater inflater, ViewGroup
		// container, Bundle savedInstanceState);否则按下返回键时，这个Fragment依然能够显示出来
		// 注意inflate方法的第三个参数，不加的话默认为true，会引起崩溃
		return inflater.inflate(R.layout.article_fragment_layout, container,
				false);
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
