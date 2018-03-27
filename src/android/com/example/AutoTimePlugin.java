/**
 */
package com.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import android.provider.Settings;

public class AutoTimePlugin extends CordovaPlugin {
  private static final String TAG = "AutoTimePlugin";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Initializing AutoTimePlugin");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("autotime")) {
      final PluginResult resultAutoTime = new PluginResult(PluginResult.Status.OK, Settings.Global.getInt(cordova.getActivity().getContentResolver(), Settings.Global.AUTO_TIME, 0) == 1);
      callbackContext.sendPluginResult(resultAutoTime);
    } else if (action.equals("autotimezone")) {
      final PluginResult resultAutoTimeZone = new PluginResult(PluginResult.Status.OK, Settings.Global.getInt(cordova.getActivity().getContentResolver(), Settings.Global.AUTO_TIME_ZONE, 0) == 1);
      callbackContext.sendPluginResult(resultAutoTimeZone);
    }
    return true;
  }

}
