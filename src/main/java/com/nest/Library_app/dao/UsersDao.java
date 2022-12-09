package com.nest.Library_app.dao;

import com.nest.Library_app.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersDao extends CrudRepository<Users,Integer> {
    @Query(value = "SELECT `id`, `address`, `adhar`, `date`, `email`, `mbno`, `name`, `password`, `pincode`, `username` FROM `users` WHERE `username` =:username AND `password` =:password",nativeQuery = true)
    List<Users> SearchUser(@Param("username") String username, @Param("password") String password);
}
