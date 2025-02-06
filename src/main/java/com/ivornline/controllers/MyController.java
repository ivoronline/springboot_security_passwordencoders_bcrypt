package com.ivornline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PasswordEncoder passwordEncoder;
  
  //====================================================================
  // ENCODE PASSWORD
  //====================================================================
  @RequestMapping("/EncodePassword")
  public String encodePassword(@RequestParam String password) {

    //ENCODE PASSWORD
    String encodedPassword = passwordEncoder.encode(password);

    //RETURN ENCODED PASSWORD
    return encodedPassword;

  }

  //====================================================================
  // HELLO
  //====================================================================
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
