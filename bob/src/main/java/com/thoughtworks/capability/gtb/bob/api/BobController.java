package com.thoughtworks.capability.gtb.bob.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/bob")
public class BobController {

  @GetMapping(path = "/hello")
  public String sayHello() {
    return "Hello from Bob!";
  }

}
