package com.dogancanokur.springgurututorial.repository;

import com.dogancanokur.springgurututorial.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
