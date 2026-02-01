package com.devops.practice.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name="hello",description ="this practice")
public class HelloController {

    @RequestMapping(value = "/hello World", method = RequestMethod.GET)
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
    @RequestMapping(value = "/hello java", method = RequestMethod.GET)
    public ResponseEntity<?> helloJava(){
        return new ResponseEntity<>("Hello Java!", HttpStatus.OK);
    }
    @RequestMapping(value = "/hello yoni", method = RequestMethod.GET)
    public ResponseEntity<?> helloYoni(){
        return new ResponseEntity<>("Hello yoni!", HttpStatus.OK);
    }

}