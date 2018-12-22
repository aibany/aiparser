apk ipa包解析

支持Android包信息解析、iOS包信息解析，自动根据后缀判断包类型
能拿到如下信息， 其中， iOS图标已实现解密

```
public class AppInfo {

    /**
     * ==========公共特性
     */

    /**
     * 包名
     */
    private String packageName;

    /**
     * 应用名
     */
    private String label;

    /**
     * 应用图片标名
     */
    private String icon;

    /**
     * 应用图片二进制
     */
    @JSONField(serialize = false)
    private byte[] iconData;

    /**
     * 版本名
     */
    private String versionName;

    /**
     * 版本号
     */
    private Long versionCode;

    /**
     * 最低系统要求
     */
    private String minSdkVersion;

    /**
     * 最低系统要求
     */
    private String minSdkString;

    /**
     * 文件大小字节
     */
    private long fileSize;


    /**
     * 安卓特性
     */
    private String installLocation;
    private String targetSdkVersion;
    private String maxSdkVersion;
    private GlEsVersion glEsVersion;
    private boolean anyDensity;
    private boolean smallScreens;
    private boolean normalScreens;
    private boolean largeScreens;
    private List<String> usesPermissions = new ArrayList();
    private List<UseFeature> usesFeatures = new ArrayList();
    private List<Permission> permissions = new ArrayList();

    /**
     * iOS特性
     */
    private String requiredDeviceCapabilities;
    private String platformVersion;
    private Boolean iPadSupport;
    private Boolean iPhoneSupport;
    private String provisioningProfileName;
    private String provisioningProfileCreationDate;
    private String provisioningProfileExpirationDate;
    private List<String>provisioningProfileDevices;
    private String teamIdentifier;
    private String teamName;
    private byte[] infoPlistFile;
    private byte[] mobileProvisionFile;
}
```




使用方式
```
package com.aibany.aiparser.test;

import com.aibany.aiparser.model.AppInfo;
import com.aibany.aiparser.model.IPAInfo;
import com.aibany.aiparser.model.IPAReader;
import com.aibany.aiparser.service.AppParser;
import com.aibany.aiparser.utils.PlistGenerator;
import com.alibaba.fastjson.JSON;
import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkMeta;
import net.dongliu.apk.parser.bean.UseFeature;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

public class ParserTests {

    @Test
    public void testAPK() {

        try (ApkFile apkFile = new ApkFile(new File("/Users/libo/Desktop/1.apk"))) {
            ApkMeta apkMeta = apkFile.getApkMeta();
            System.out.println(apkMeta.getLabel());
            System.out.println(apkMeta.getPackageName());
            System.out.println(apkMeta.getVersionCode());
            System.out.println(apkMeta.getVersionName());
            System.out.println(JSON.toJSONString(apkMeta));
            for (UseFeature feature : apkMeta.getUsesFeatures()) {
                System.out.println(feature.getName());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIPA() throws Exception{
        String path = "/Users/libo/Desktop/FlyFish-Release453.ipa";

        IPAReader reader = new IPAReader(path);
        IPAInfo info = reader.parse();

        System.out.println(JSON.toJSONString(info));

        System.out.println(info.getBundleName());
        System.out.println(info.getRequiredDeviceCapabilities());

    }

    @Test
    public void testPlist() throws Exception {
        String path = "/Users/libo/Desktop/FlyFish-Release453.ipa";

        AppInfo appInfo = AppParser.parse(path);

        FileOutputStream out = new FileOutputStream(new File("/Users/libo/Desktop/test.plist"));
        PlistGenerator.generatorPlist(appInfo,"http:/xxx/freedom/57894/apple/FlyFish-Release453.ipa", out);
    }

    @Test
    public void testParser() throws Exception{
        AppInfo appInfo = AppParser.parse("/Users/libo/Desktop/1.apk");
        System.out.println(JSON.toJSONString(appInfo));
    }

    @Test
    public void testExe() throws Exception{
        AppInfo appInfo = AppParser.parse("/Users/libo/Desktop/1.exe");
        System.out.println(JSON.toJSONString(appInfo));
    }
}


```


mvn clean deploy -P snapshot -Dgpg.passphrase=F92FFEBFBCD6290E