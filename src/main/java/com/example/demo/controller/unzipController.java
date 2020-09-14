package com.example.demo.controller;

import com.example.demo.service.UnzipService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.lingala.zip4j.exception.ZipException;

@RestController
public class unzipController {
    
    private UnzipService unzipService;
    
    @Autowired
    unzipController(UnzipService unzipService) {
        this.unzipService = unzipService;
    }

    @PostMapping("/unzipFile")
    public String unzipFile(@RequestPart(value = "filepath") String filepath) {
        try {
        return this.unzipService.unzip(filepath);
        }
        catch (ZipException e){
            e.printStackTrace();
        }
    }
}
