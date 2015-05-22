# tween-animation
-----------------
This module gives you the ability to animate your items when entering or exiting activity.
Also its contains several utility to control shared preferences and other things in the class Utility.java.

#Module Tween
-------------
###Class TweenAnimation
Contains the functions wanted to animate views left or right, on enter activity or on exit.

*Enter activity<br/>
```fromLeft (view, duration, offset)```<br/>
```fromRight (view, duration, offset)```<br/>
```fromBottom (view, duration, offset)```<br/>
```fromTop (view, duration, offset)```<br/>
<br/>
<br/>
*Exit activity<br/>
```toLeft (view, duration, offset)```<br/>
```toRight (view, duration, offset)```<br/>
```toBottom (view, duration, offset)```<br/>
```toTop (view, duration, offset)```<br/>

> How to use:<br/>
```@Override
       public void enterActivity() {
           super.enterActivity();

           TweenAnimation.fromLeft(findViewById(R.id.test1), 1000, 300);
           TweenAnimation.fromRight(findViewById(R.id.test2), 1000, 300);
           TweenAnimation.fromTop(findViewById(R.id.test3), 1000, 300);
           TweenAnimation.fromBottom(findViewById(R.id.test4), 1000, 300);
           TweenAnimation.fromLeft(findViewById(R.id.test5), 1000, 300);
           TweenAnimation.fromRight(findViewById(R.id.test6), 1000, 300);

       }```

<br/>
###Class BaseClass
This is the activity parent you should extend it contains the enter and exit operations.

```void leftActivity()``` this is the method you should ovveride to make your views leave the activity in an animated way<br/>
```void enterActivity()``` this is the method you should ovveride to make your views enter the activity in an animated way<br/>

To use just extend BaseClass and implement left and enter.

###Shared prefs
This class facilitate the load and save of data in local storage or shared preferences.

```getInstance() return the shared instance of the class```<br/>
```static void saveString(String key, String val)```<br/>
```static void saveInt(String key, String val)```<br/>
```static void saveBoolean(String key, String val)```<br/>
```static void saveFloat(String key, String val)```<br/>
 -or- you can just use
 ```static void save(String key, Object val)``` for an object which can be string, int, float .... etc <br/>

 ```static String loadString(String key)``` to load string from shared <br/>
 ```static int loadInt(String key)``` to load int from shared <br/>
 ```static Boolean loadBoolean(String key)``` to load boolean from shared <br/>
 ```static float loadFloat(String key)``` to load float from shared <br/>

--Example of use :<br/>
    ```SharedPrefs.getInstance().save("key", value);```<br/>

###Utility
This class contains several methods that help you in your java development.

Public variables to set the context, the activity and the app name:<br/>
```public static Context context;
   public static Activity activity;
   public static String appName;```

   --or-- use just a constructor --> ``` Utility(String appName, Context applicationContext, Activity activity) ```

    -- Operations:

    ```static void log(String msg)``` --> to print a msg in the debug.<br/>
    ```static void sysout(String msg)``` --> to print a msg in the debug.<br/>
    ```static String toJSon(Object o)``` --> convert an object to json string (like stringify in javascript).<br/>
    ```static String getMimeType(String url)``` --> get the mime type of a file.<br/>
    ```static String getExtension(String url)``` --> get the extension of a file<br/>
    ```static String getFileName(String url)``` --> get the file name from a file path<br/>
    ```static String NumberFormater(Double t)``` --> get a string of a float number in the format "###,###,###.##"<br/>
    ```static void hideTiTleBar(Activity A)``` --> hide the title bar of an activity<br/>
    ```static void showtoast(Context activity, String msg)``` --> show a toast message.<br/>
    ```static JsonObject getScreenWH(Context context)``` --> get an object of the screen width and height.<br/>
    ```static double round(double value, int places)``` --> get the rounded value of decimal number.<br/>
    ```static String getToday(String format)``` --> get today date (string) with the specified format.<br/>

##Contribute and fork
you can contribute in this repos, and fork it so if you want send a pull request.


