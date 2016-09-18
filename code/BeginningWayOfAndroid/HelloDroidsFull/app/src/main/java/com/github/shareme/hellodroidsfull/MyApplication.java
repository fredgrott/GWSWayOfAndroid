package com.github.shareme.hellodroidsfull;

import android.app.Application;

/**
 * Just a basic extending the Application class.
 * You will use this technique when you need to
 * add stuff that might have to be a global singleton and
 * initialized at application start.
 * Created by fgrott on 9/18/2016.
 */

public class MyApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
  }
}
