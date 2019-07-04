package com.dogancanokur.springgurututorial.repository;

import com.dogancanokur.springgurututorial.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
