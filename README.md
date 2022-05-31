# SToast
Android custom toast with 6 different types and light/dark theme support.

![stoast](https://te.legra.ph/file/c18d3efce8d9af3a6798e.jpg)

![stability-stable](https://img.shields.io/badge/stability-stable-green.svg)  ![version-v2.0](https://img.shields.io/badge/version-v2-blue) ![Telegram-smithdev](https://img.shields.io/badge/Telegram-smithdev-blue)

# A. Default SToast
(dark theme, default type, short length and bottom gravity)
```java
  SToast toast = new SToast(this);
  toast.setText("this is default toast");
  toast.show();
```
To customize **SToast** you can use methods explained below in **B** section

# B. Customized SToast
1. Create an `SToast` object:
    ```java
    SToast toast = new SToast(this);
    ```
#
2. Use `setThemeAndType()` method to configure the theme and type of **SToast** (default values: *theme: DARK* and *type: TYPE_DEFAULT*).
    ```java
    toast.setThemeAndType(SToast.DARK, SToast.TYPE_HEART);
    ```

  - *Three theme parameters can be used to set the theme*
      `SToast.LIGHT` `SToast.DARK` `SToast.FOLLOW_SYSTEM`
  - *Seven different type parameters can be used to set the type*
      `SToast.TYPE_OK` `SToast.TYPE_ERROR` `SToast.TYPE_WARN` `SToast.TYPE_DONE` `SToast.TYPE_DEFAULT` `SToast.TYPE_HEART` `SToast.TYPE_CONFUSE`
#
3. Use `setGravityAndDuration()` method to configure the gravity and toast length (default values: *gravity: BOTTOM* and *duration: LENGTH_SHORT*).
    ```java
    toast.setGravityAndDuration(Gravity.BOTTOM, SToast.LENGTH_SHORT);
    ```

  - *Three gravity parameters can be used to set the gravity* `Gravity.TOP` `Gravity.CENTER` `Gravity.BOTTOM`
  - *Two duration parameters can be used to set the duration* `SToast.LENGTH_SHORT` `SToast.LENGTH_LONG`

4. Now use `setText()` method to set text to the **SToast**.
    ```java
    toast.setText("some text");
    ```
#
5. And `show()` method to show the **SToast**.
    ```java
    toast.show();
    ```
#
An example of customized **SToast**
```java
  SToast toast = new SToast(MainActivity.this);
  toast.setThemeAndType(SToast.LIGHT, SToast.TYPE_OK);
  toast.setGravityAndDuration(Gravity.CENTER, SToast.LENGTH_LONG);
  toast.setText("This customized ok type, light theme, center and long duration SToast");
  toast.show();
```
