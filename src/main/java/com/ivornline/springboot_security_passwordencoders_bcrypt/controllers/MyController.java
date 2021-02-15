package com.ivornline.springboot_security_passwordencoders_bcrypt.controllers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //====================================================================
  // ENCODE PASSWORD
  //====================================================================
  @ResponseBody
  @RequestMapping("/EncodePassword")
  public String encodePassword(@RequestParam String password) {

    //GET PASSWORD ENCODER
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    //ENCODE PASSWORD
    String encodedPassword = passwordEncoder.encode(password);

    //RETURN ENCODED PASSWORD
    return encodedPassword;

  }

  //====================================================================
  // HELLO
  //====================================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
