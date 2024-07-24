package pro.sky.skyprospringcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringcalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String getGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String getSum(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null){
            return "Один из параметров отсутствует";
        }
        else{
            int result = calculatorService.getSum(num1,num2);
            return num1 + " + " + num2 + " = " + result;
        }
    }

    @GetMapping("/minus")
    public String getSubtraction(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null){
            return "Один из параметров отсутствует";
        }
        else{
            int result = calculatorService.getSubtraction(num1,num2);
            return num1 + " - " + num2 + " = " + result;
        }
    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null){
            return "Один из параметров отсутствует";
        }
        else{
            int result = calculatorService.getMultiply(num1,num2);
            return num1 + " * " + num2 + " = " + result;
        }
    }

    @GetMapping("/divide")
    public String getDivide(@RequestParam(value = "num1", required = false) Integer num1,
                            @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null){
            return "Один из параметров отсутствует";
        }
        else{
            if(num2 == 0){
                return "Второй параметр не может бытьь нулем при делении";
            }
            else{
                int result = calculatorService.getDivide(num1,num2);
                return num1 + " / " + num2 + " = " + result;
            }

        }
    }

}
