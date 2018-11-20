package com.stimpert.shippable.shippabledemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class MyRestController {

    @Autowired
    private Environment env;

    @RequestMapping("/person")
    public Person getPerson(
            @RequestParam(value="first", defaultValue="first") String first,
            @RequestParam(value="last", defaultValue="last") String last
            ) {
        return new Person(first, last + " - " + String.join(",", env.getActiveProfiles()));
    }

}
