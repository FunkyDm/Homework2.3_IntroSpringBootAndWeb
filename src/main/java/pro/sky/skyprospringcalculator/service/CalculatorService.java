package pro.sky.skyprospringcalculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public int getSum(int num1, int num2){
        return num1 + num2;
    }

    public int getSubtraction(int num1, int num2){
        return num1 - num2;
    }

    public int getMultiply(int num1, int num2){
        return num1 * num2;
    }

    public int getDivide(int num1, int num2){
        return num1 / num2;
    }
}
