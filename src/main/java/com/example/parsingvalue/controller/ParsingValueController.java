package com.example.parsingvalue.controller;

import com.example.parsingvalue.model.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ParsingValueController {


    @PostMapping
    public ResponseEntity<?> parse(@RequestBody String request){

        Type listType = new TypeToken<List<Response>>() {}.getType();

        List<Response> response = new Gson().fromJson(request, listType);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}



