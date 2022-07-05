package com.epam.spring.homework2.beans;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dev.properties")
public class BeanD extends AbstractBean {
  public BeanD() {}

  public BeanD(String name, Integer value) {
    super(name, value);
  }

  private void initBean() {
    System.out.println("BeanD init");
  }

  private void destroyBean() {
    System.out.println("BeanD destroy");
  }
}