package com.stimpert.shippable.shippabledemo;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/person")
    public Person getPerson(
            @RequestParam(value="first", defaultValue="first") String first,
            @RequestParam(value="last", defaultValue="last") String last
            ) {
        return new Person(first, last);
    }

}
