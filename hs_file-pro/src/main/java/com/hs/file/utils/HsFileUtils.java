package com.hs.file.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
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
@Component
public class HsFileUtils {

    @Value("${file.dir}")
    private String fileDir;


    public String saveFile(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        StringBuilder fileName = new StringBuilder();
        fileName.append(getTenTime()).append(getUUID()).append(originalFilename.substring(originalFilename.lastIndexOf(".")));
        String filePath = fileDir+ fileName.toString();
        byte[] bytes = file.getBytes();
        Path laking = Paths.get(filePath);
        Files.write(laking, bytes);
        return fileName.toString();
    }

    /**
     * 时间 例如 20621530
     * @return
     */
    private String getTenTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        StringBuilder sb = new StringBuilder();
        sb.append(localDateTime.getYear()-2000).append(localDateTime.getMonthValue())
        .append(localDateTime.getDayOfMonth()).append(localDateTime.getHour()).append(localDateTime.getMinute());
        return sb.toString();
    }

    /**
     * 得到一个唯一的id
     * @return UUID
     */
    private String getUUID(){
        return UUID.randomUUID().toString().toLowerCase().replaceAll("-","_");
    }
}
