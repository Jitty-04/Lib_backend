package com.nest.Library_app.dao;

import com.nest.Library_app.model.Library;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository<Library,Integer> {
    @Query(value = "SELECT `id`, `author`, `description`, `distributor`, `image`, `language`, `name`, `price`, `publisher`, `year` FROM `library` WHERE `name`LIKE %:name%",nativeQuery = true)
    List<Library> SearchBook(@Param("name") String name);
@Modifying
    @Transactional
    @Query(value = "DELETE FROM `library` WHERE `id`=:id",nativeQuery = true)
    void DeleteBook(@Param("id") Integer id);
}
