package com.example.demo.service;

import org.springframework.stereotype.Service;
import net.lingala.zip4j.core.ZipFile;

@Service
public class UnzipService {
    public String unzip(String sourcePath) throws ZipException {
        String destPath = getFileName(sourcePath);
        System.out.println("\n\n\n*****************************Destination " + destPath);
        ZipFile zipFile = new ZipFile(sourcePath);
        // If it is encrypted then provide password
        if (zipFile.isEncrypted()) {
            zipFile.setPassword("iamin123");
        }
        zipFile.extractAll(destPath);
        return sourcePath;
    }
    private String getFileName(String filePath) {
        // Get the folder name from the zipped file by removing .zip extension
        return filePath.substring(0, filePath.lastIndexOf("."));
    }
}
