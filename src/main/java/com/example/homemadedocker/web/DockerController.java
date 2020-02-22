package com.example.homemadedocker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DockerController {

    @GetMapping("docker")
    public Map<String, String> docker() {
        Map<String, String> resultMap = new HashMap<>(8);
        resultMap.put("name", "docker");
        return resultMap;
    }

}
