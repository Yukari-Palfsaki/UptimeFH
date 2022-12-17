package at.fhtw.bic.uptimefh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.awt.*;

@RestController
public class ColorController {
  @GetMapping("/api/complementary")
  public Color setColor (@RequestParam String color){
    Color c = new Color (0,0,0);
    switch (color.toLowerCase()){
      case "red":
        c = Color.RED;
        break;

      case "blue":
        c = Color.BLUE;
        break;
    }
   return c;

  }
}
