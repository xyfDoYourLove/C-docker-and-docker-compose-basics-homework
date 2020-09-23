package com.thoughtworks.capability.gtb.alice;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/v1/alice")
public class AliceController {

  private final RestTemplate restTemplate;
  public AliceController(RestTemplateBuilder builder){
    this.restTemplate = builder.build();
  }

  @GetMapping(path = "/hello")
  public String sayHello(){
    return restTemplate.getForObject("http://localhost:8090/v1/bob/hello", String.class);
  }

}
