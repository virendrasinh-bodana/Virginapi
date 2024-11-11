package com.example.Virginapi.Controller;

import com.example.Virginapi.Service.PlanScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/plans")
public class PlanScraperController {

    @Autowired
    private PlanScraperService planScraperService;

    @GetMapping("/scrape")
    public List<Map<String, String>> scrapePlans() throws InterruptedException {
        return planScraperService.scrapePlans();
    }
}
