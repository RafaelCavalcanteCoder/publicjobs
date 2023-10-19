package br.com.publicjobs.blogs.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postar")
public class JobsController {

    @PostMapping
    public void cadastrar(){

    }
    
}
