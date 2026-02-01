package com.devops.practice.controller;

import com.devops.practice.student.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "student", description = "student")
public class StudentController {
    Student student=new Student("yoni",20,'m',"tel Aviv");

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<?> student(){
        return new ResponseEntity<>("name: "+student.getName()+" age: "+student.getAge(), HttpStatus.OK);
    }
}
