package com.example.calculator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CalculatorController {

    
    @GetMapping("/add")
    public Calculator add(
            @RequestParam(value = "num1", defaultValue = "0.0") String num1,
            @RequestParam(value = "num2", defaultValue = "0.0") String num2) {
        double numValue1 = Double.parseDouble(num1);
        double numValue2 = Double.parseDouble(num2);

        return new Calculator(numValue1 + numValue2);
    }

    
    @GetMapping("/sub")
    public Calculator sub(
            @RequestParam(value = "num1", defaultValue = "0.0") String num1,
            @RequestParam(value = "num2", defaultValue = "0.0") String num2) {
        double numValue1 = Double.parseDouble(num1);
        double numValue2 = Double.parseDouble(num2);

        return new Calculator(numValue1 - numValue2);
    }
}