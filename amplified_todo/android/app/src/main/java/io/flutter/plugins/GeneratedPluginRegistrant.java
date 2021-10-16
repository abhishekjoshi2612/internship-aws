package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.amazonaws.amplify.amplify_api.AmplifyApiPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin amplify_api, com.amazonaws.amplify.amplify_api.AmplifyApiPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.amazonaws.amplify.amplify_auth_cognito.AuthCognito());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin amplify_auth_cognito, com.amazonaws.amplify.amplify_auth_cognito.AuthCognito", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.amazonaws.amplify.amplify_core.AmplifyCorePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin amplify_core, com.amazonaws.amplify.amplify_core.AmplifyCorePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.amazonaws.amplify.amplify_datastore.AmplifyDataStorePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin amplify_datastore, com.amazonaws.amplify.amplify_datastore.AmplifyDataStorePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.amazonaws.amplify.Amplify());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin amplify_flutter, com.amazonaws.amplify.Amplify", e);
    }
  }
}