package de.othr.proconnect.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FilterController {

    @GetMapping("/filter-options")
    public List<String> getFilterOptions() {
        // Hier Logik einfügen, um Filteroptionen abzurufen und zurückzugeben
        return Arrays.asList("Option 1", "Option 2", "Option 3");
    }
}

