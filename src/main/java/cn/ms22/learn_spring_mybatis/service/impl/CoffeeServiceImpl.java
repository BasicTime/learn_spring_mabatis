package cn.ms22.learn_spring_mybatis.service.impl;

import cn.ms22.learn_spring_mybatis.mapper.CoffeeMapper;
import cn.ms22.learn_spring_mybatis.model.Coffee;
import cn.ms22.learn_spring_mybatis.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoffeeServiceImpl implements CoffeeService {
    @Autowired
    private CoffeeMapper mapper;

    @Override
    public void save(Coffee coffee) {
        mapper.save(coffee);
    }

    @Override
    public Coffee getCoffeeByName(String name) {
        return mapper.getCoffeeByName(name);
    }
}
