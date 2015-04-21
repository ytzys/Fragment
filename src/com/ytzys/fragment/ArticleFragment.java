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

		// ע�ⲻҪ��return super.onCreateView(LayoutInflater inflater, ViewGroup
		// container, Bundle savedInstanceState);�����·��ؼ�ʱ�����Fragment��Ȼ�ܹ���ʾ����
		// ע��inflate�����ĵ��������������ӵĻ�Ĭ��Ϊtrue�����������
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
