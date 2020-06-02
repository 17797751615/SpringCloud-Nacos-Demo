package com.hs.file.controller.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

/**
 * @author Think
 * @Classname HsFileUtils
 * @Description Forrest
 * @Date 2020/6/2 14:21
 * @Created by Forrest
 * @Email comeonZYK@outlook.com
 * ┏┛ ┻━━━━━┛ ┻┓
 * ┃　　　　　　 ┃
 * ┃　　　━　　　┃
 * ┃　┳┛　  ┗┳　┃
 * ┃　　　　　　 ┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　 ┃
 * ┗━┓　　　┏━━━┛
 * ┃　　　┃   神兽保佑
 * ┃　　　┃   代码无BUG！
 * ┃　　　┗━━━━━━━━━┓
 * ┃　　　　　　　    ┣┓
 * ┃　　　　         ┏┛
 * ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * ┃ ┫ ┫   ┃ ┫ ┫
 * ┗━┻━┛   ┗━┻━┛
 */
public class HsFileUtils {
    public String saveFile(String filePath,MultipartFile file) throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append(getTenTime()).append(".").append(file.getOriginalFilename());

        String fileName = "/data/hipay/java/health/healthImages/"+ "UUidName";
        byte[] bytes = file.getBytes();
        Path laking = Paths.get(fileName);
        Files.write(laking, bytes);
        return "";
    }
    /**
     * 得到十位时间戳
     * @return
     */
    private String getTenTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        StringBuilder sb = new StringBuilder();
        sb.append(localDateTime.getYear()-2000).append(localDateTime.getMonthValue())
        .append(localDateTime.getDayOfMonth()).append(localDateTime.getHour()).append(localDateTime.getMinute());
        return sb.toString();
    }
}
