package at.fhtw.bic.uptimefh.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.awt.*;

@RestController
public class ColorController {
  @GetMapping("/api/complementary")
  public Color setColor (@RequestParam String color){
    Color c = new Color (255,255,255);
    switch (color.toLowerCase()){
      case "red":
        c =Color.GREEN;
        break;

      case "blue":
       c=Color.ORANGE;
        break;

    }
    return c;

  }
}
