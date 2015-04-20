package com.ytzys.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements
		TitleFragment.OnTitleClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TitleFragment fragment = new TitleFragment();
		getSupportFragmentManager().beginTransaction()
				.add(R.id.fragment_container, fragment).commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onTitleClick(int position) {

		ArticleFragment articleFragment = new ArticleFragment();
		Bundle bundle = new Bundle();
		bundle.putInt("position", position);
		articleFragment.setArguments(bundle);
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.replace(R.id.fragment_container, articleFragment);
		transaction.addToBackStack(null);
		transaction.commit();
	}

}
