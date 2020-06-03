package com.example.controller;

import com.example.model.Name;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author prokade
 */
@RestController
@Api
public class ConcatenateController {

    @RequestMapping(value = "/concatenate", method = RequestMethod.POST)
    public ResponseEntity<String> concatenate(@Valid @RequestBody Name name) {
        return new ResponseEntity<>(name.getFirstName() + " " + name.getLastName(), HttpStatus.OK);
    }

}
