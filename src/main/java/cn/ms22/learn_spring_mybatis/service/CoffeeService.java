package cn.ms22.learn_spring_mybatis.service;

import cn.ms22.learn_spring_mybatis.model.Coffee;

public interface CoffeeService {

    void save(Coffee coffee);

    Coffee getCoffeeByName(String name);
}
