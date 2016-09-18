/*
 * Copyright (C) 2007 The Android Open Source Project
 * Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// all android apps have a package-name which usuallly is in the scheme of
//    com,net, eu  than the firm or company than author or user and than the app name
package com.github.shareme.hellodroids;

// this is our imports for this class
import android.app.Activity;
import android.os.Bundle;

/**
 * There are two major View Component Containers in the Android
 * Framework, Activities and Fragments.This is a basic AActivity
 * displaying a simple text string via TextView which was declared
 * in the xml file found in res/layouts/hello_droids.xml
 *
 * in the AndroidManifest its the pairing of
 * <code>
 *   <intent-filter>
 *      <action android:name="android.intent.action.MAIN" />
 *      <category android:name="android.intent.category.LAUNCHER" />
 *
 *   </intent-filter>
 * </code>
 *
 * an action and category that tells the Android Framework that this app
 * has an activity as its main entry point.
 *
 * Note, to get the newer features of toolbar, ext you will use the
 * AppCompatActivity from the support-v4 package which does subclass
 * the Activity class.
 * Created by fgrott on 9/18/2016.
 */

public class HelloDroids extends Activity {


  /**
   * This is what initializes the Activity and it must at least
   * call the super and setContentView to display something.
   *
   * The order of the super method before other method calls is
   * required. You will this pattern in Virtual Managed systems
   * such as java platforms and the Android Platform. If for some reason
   * the system is not ready to do the initialization of this activity, super
   * class method is invoked so that some initialization occurs.
   * @param savedInstanceState the saved instance state
   */
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.hello_droids);
  }
}
