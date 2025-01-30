package com.wokejanta.backend.controller;

import com.wokejanta.backend.data.SearchResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Important for local development!
@Slf4j
public class SearchController {

    @GetMapping("/search")
    public SearchResult search(@RequestParam String q) {
        // In a real application, you would query your data source here.
        // For now, return a dummy result.
        log.info("Input received from frontend is - {}",q);
        SearchResult dummyData = new SearchResult();
        dummyData.setId(1);
        dummyData.setTitle("AI Discovers Cure for " + q); // Include the search term
        dummyData.setSummary("Dummy summary for " + q + ".  This is a test response from the backend.");
        dummyData.setFake(true);
        return dummyData;

    }
}
