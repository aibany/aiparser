package com.aibany.aiparser.utils;

import com.aibany.aiparser.model.AppInfo;
import com.aibany.aiparser.model.IPAInfo;
import net.dongliu.apk.parser.bean.ApkMeta;
import net.dongliu.apk.parser.bean.GlEsVersion;
import net.dongliu.apk.parser.bean.Permission;
import net.dongliu.apk.parser.bean.UseFeature;

import java.util.ArrayList;
import java.util.List;

public class BeanUtils {

    public static AppInfo infoFromAPKMeta(ApkMeta meta, byte[] iconData) {
        if (meta == null) {
            return null;
        }
        AppInfo info = new AppInfo();
        info.setVersionCode(meta.getVersionCode());
        info.setVersionName(meta.getVersionName());
        info.setIcon(meta.getIcon());
        info.setPackageName(meta.getPackageName());
        info.setLabel(meta.getLabel());
        info.setFileSize(0);
        info.setMinSdkVersion(meta.getMinSdkVersion());
        info.setIconData(iconData);
        info.setMinSdkString(minLevelString(0,info.getMinSdkVersion()));

        return info;
    }

    public static AppInfo infoFromIPAMeta(IPAInfo meta) {

        if (meta == null) {
            return null;
        }
        AppInfo info = new AppInfo();
        info.setVersionCode(Long.parseLong(meta.getBuildNumber().replace(".","")));
        info.setVersionName(meta.getBundleVersionString());
        info.setIcon(meta.getBundleIconFileName());
        info.setPackageName(meta.getBundleIdentifier());
        info.setLabel(meta.getBundleName());
        info.setFileSize(meta.getFileSize());
        info.setMinSdkVersion(meta.getMinimumOSVersion());
        info.setIconData(meta.getBundleIcon());
        info.setMinSdkString(minLevelString(1,info.getMinSdkVersion()));

        return info;
    }

    private static String minLevelString(int type , String minSdk) {

        if (minSdk == null) {
            return "";
        }
        if (type == 0){
            String target = "";
            switch (Integer.parseInt(minSdk)) {
                case 1: target = "1.0"; break;
                case 2: target = "1.1"; break;
                case 3: target = "1.5"; break;
                case 4: target = "1.6"; break;
                case 5: target = "2.0"; break;
                case 6: target = "2.0.1"; break;
                case 7: target = "2.1.x"; break;
                case 8: target = "2.2.x"; break;
                case 9: target = "2.3.0/1/2"; break;
                case 10: target = "2.3.3/4"; break;
                case 11: target = "3.0.x"; break;
                case 12: target = "3.1.x"; break;
                case 13: target = "3.2"; break;
                case 14: target = "4.0.0/1/2"; break;
                case 15: target = "4.0.3/4"; break;
                case 16: target = "4.1"; break;
                case 17: target = "4.2"; break;
                case 18: target = "4.3"; break;
                case 19: target = "4.4"; break;
                case 20: target = "4.4W"; break;
                case 21: target = "5.0"; break;
                case 22: target = "5.1"; break;
                case 23: target = "6.0"; break;
                case 24: target = "7.0"; break;
                case 25: target = "8.0"; break;
            }
            return "Android "+ target;
        }else {
            return "iOS " + minSdk;
        }
    }

}
