# SToast
Android custom toast with 6 different types and light/dark theme support.

![stoast](https://te.legra.ph/file/c18d3efce8d9af3a6798e.jpg)

![stability-stable](https://img.shields.io/badge/stability-stable-green.svg)  ![version-v2.0](https://img.shields.io/badge/version-v2-blue) ![Telegram-smithdev](https://img.shields.io/badge/Telegram-smithdev-blue)

# A. Default SToast
(dark theme, default type, short length and bottom gravity)
```java
  new SToast.Create(this)
      .setText("this is default toast")
      .show();
```
To customize **SToast** you can use methods explained below in **B** section

# B. Customized SToast
1. Use `setTheme()` And `setType()` methods to configure the theme and type of **SToast** (default values: *theme: DARK* and *type: TYPE_DEFAULT*).
    ```java
    .setTheme(SToast.DARK)
    .setType(SToast.TYPE_HEART)
    ```

  - *Three theme parameters can be used to set the theme*
      `SToast.LIGHT` `SToast.DARK` `SToast.FOLLOW_SYSTEM`
  - *Seven different type parameters can be used to set the type*
      `SToast.TYPE_OK` `SToast.TYPE_ERROR` `SToast.TYPE_WARN` `SToast.TYPE_DONE` `SToast.TYPE_DEFAULT` `SToast.TYPE_HEART` `SToast.TYPE_CONFUSE`
#
2. Use `setGravity()` And `setDuration()` methods to configure the gravity and toast length (default values: *gravity: BOTTOM* and *duration: LENGTH_SHORT*).
    ```java
    .setGravity(Gravity.BOTTOM)
    .setDuration(SToast.LENGTH_SHORT)
    ```

  - *Three gravity parameters can be used to set the gravity* `Gravity.TOP` `Gravity.CENTER` `Gravity.BOTTOM`
  - *Two duration parameters can be used to set the duration* `SToast.LENGTH_SHORT` `SToast.LENGTH_LONG`
#
3. Now use `setText()` method to set text to the **SToast**.
    ```java
    .setText("some text")
    ```
#
4. And `show()` method to show the **SToast**.
    ```java
    .show()
    ```
#
An example of customized **SToast**
```java
  new SToast.Create(MainActivity.this)
      .setTheme(SToast.LIGHT)
      .setType(SToast.TYPE_OK)
      .setGravity(Gravity.CENTER)
      .setDuration(SToast.LENGTH_LONG)
      .setText("This customized ok type, light theme, center and long duration SToast")
      .show();
```
