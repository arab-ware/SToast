# SToast
Android custom toast with 6 different types and light/dark theme support.

![stability-stable](https://img.shields.io/badge/stability-stable-green.svg)  ![version-v2.0](https://img.shields.io/badge/version-v2-blue)

# How to use
1. Create an `SToast` object:
    ```
    SToast toast = new SToast(this);
    ```
2. Use `setThemeAndType()` method to configure the theme and type of **SToast**.
    ```
    toast.setThemeAndType(SToast.DARK, SToast.TYPE_HEART);
    ```
    - *Three theme parameters can be used to set the theme*
      `SToast.LIGHT`: to set light theme for the toast,
      `SToast.DARK`: to set dark theme
      and `SToast.FOLLOW_SYSTEM`: to set theme depending on device night mode if is on or off.
    - *Six different type parameters can be used to set the type*
      `SToast.TYPE_OK` `SToast.TYPE_ERROR` `SToast.TYPE_WARN` `SToast.TYPE_DONE` `SToast.TYPE_DEFAULT` `SToast.TYPE_HEART` `SToast.TYPE_CONFUSE`
    
