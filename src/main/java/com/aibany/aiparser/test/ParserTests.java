package com.aibany.aiparser.test;

import com.aibany.aiparser.model.AppInfo;
import com.aibany.aiparser.model.IPAInfo;
import com.aibany.aiparser.model.IPAReader;
import com.aibany.aiparser.service.AppParser;
import com.alibaba.fastjson.JSON;
import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkMeta;
import net.dongliu.apk.parser.bean.UseFeature;
import org.junit.Test;

import java.io.File;

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
    public void testParser() throws Exception{
        AppInfo appInfo = AppParser.parse("/Users/libo/Desktop/1.apk");
        System.out.println(JSON.toJSONString(appInfo));
    }
}
