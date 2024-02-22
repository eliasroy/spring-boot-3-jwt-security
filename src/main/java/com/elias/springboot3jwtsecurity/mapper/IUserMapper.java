package com.elias.springboot3jwtsecurity.mapper;

import com.elias.springboot3jwtsecurity.user.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;
@Mapper
public interface IUserMapper {
    @Select("SELECT * FROM USER WHERE email=#{email}")
    Optional<User> findByEmail(String email);

    @Insert("INSERT INTO USER (LASTNAME, EMAIL, PASSWORD) VALUES (#{LASTNAME}, #{EMAIL}, #{PASSWORD})")
    void save(User user);

    @Delete("DELETE FROM USER WHERE ID=#{ID}")
    void deleteById(Integer ID);

    @Select("SELECT * FROM USER")
    List<User> findAll();
}
