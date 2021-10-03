package cn.ms22.learn_spring_mybatis.mapper;

import cn.ms22.learn_spring_mybatis.model.Coffee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CoffeeMapper {
    @Insert("insert into t_coffee(name,price,create_time,update_time) values (#{name}, #{price},now(),now())")
    @Options(useGeneratedKeys = true)
    void save(Coffee coffee);

    @Select("select id,name,create_time,update_time,price from t_coffee where name = #{name}")
        // @Result(column = "price", jdbcType = JdbcType.BIGINT, typeHandler = cn.ms22.learn_spring_mybatis.handler.MoneyTypeHandler.class)
    Coffee getCoffeeByName(String name);
}
