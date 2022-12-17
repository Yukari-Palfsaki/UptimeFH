package at.fhtw.bic.uptimefh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.awt.*;

@RestController
public class ColorController {
  @GetMapping("/api/complementary")
  public void colorChange (@RequestParam String color){
    Container container = new Container();
    if(color.toLowerCase().equals("red")){
      container.setBackground(Color.RED);
    }


  }
}
