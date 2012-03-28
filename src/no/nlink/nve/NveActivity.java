package no.nlink.nve;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class NveActivity extends DroidGap {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		super.loadUrl("file:///android_asset/www/index.html");
	}
}