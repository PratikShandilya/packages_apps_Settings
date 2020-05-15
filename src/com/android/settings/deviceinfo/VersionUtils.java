
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getquantumVersion(){
        return SystemProperties.get("org.quantum.version.display","");
    }
}
