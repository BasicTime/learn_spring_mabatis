package cn.ms22.learn_spring_mybatis.controller;

import cn.ms22.learn_spring_mybatis.model.Coffee;
import cn.ms22.learn_spring_mybatis.service.CoffeeService;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @RequestMapping("/save/{name}")
    public void saveCoffee(@PathVariable String name){
        coffeeService.save(Coffee.builder().name(name).price(Money.of(CurrencyUnit.of("CNY"),20.0)).build());
    }

    @RequestMapping("/search/{name}")
    public Coffee getCoffeeByName(@PathVariable String name){
        return coffeeService.getCoffeeByName(name);
    }
}
