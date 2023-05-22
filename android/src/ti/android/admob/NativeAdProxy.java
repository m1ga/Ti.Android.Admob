/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.android.admob;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

@Kroll.proxy(creatableInModule = AdmobModule.class)
public class NativeAdProxy extends TiViewProxy {

	private NativeAdView nativeAdView;

	public NativeAdProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity activity) {
		nativeAdView = new NativeAdView(this);
		return nativeAdView;
	}

	// Handle creation options
	@Override
	public void handleCreationDict(KrollDict options) {
		super.handleCreationDict(options);
		if (options.containsKey("adUnitId")) {
            AdmobModule.NATIVE_AD_UNIT_ID = options.getString("adUnitId");
        }
	}
}