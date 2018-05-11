package com.aibany.aiparser.service;

import com.aibany.aiparser.model.AppInfo;
import com.aibany.aiparser.model.IPAInfo;
import com.aibany.aiparser.model.IPAReader;
import com.aibany.aiparser.utils.BeanUtils;
import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkMeta;

import java.io.File;

public class AppParser {

    public static AppInfo parse(String filePath) throws Exception{

        if (filePath == null || filePath.length() == 0) {
            throw new RuntimeException("File path error:" + filePath);
        }
        File testFile = new File(filePath);
        if (!testFile.exists() || testFile.length() < 1024) {
            throw new RuntimeException("File size error:" + filePath);
        }

        if (filePath.endsWith(".apk")) {
            try (ApkFile apkFile = new ApkFile(new File(filePath))) {
                ApkMeta apkMeta = apkFile.getApkMeta();
                return BeanUtils.infoFromAPKMeta(apkMeta);
            }catch (Exception e) {
                throw e;
            }
        }else if (filePath.endsWith(".ipa")){
            try {
                IPAReader reader = new IPAReader(filePath);
                IPAInfo info = reader.parse();
                return BeanUtils.infoFromIPAMeta(info);
            }catch (Exception e) {
                throw e;
            }
        }else {
            throw new RuntimeException("can't find apk or ipa suffix");
        }
    }

}
