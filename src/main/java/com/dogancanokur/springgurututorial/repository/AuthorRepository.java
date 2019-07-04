package com.dogancanokur.springgurututorial.repository;

import com.dogancanokur.springgurututorial.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
