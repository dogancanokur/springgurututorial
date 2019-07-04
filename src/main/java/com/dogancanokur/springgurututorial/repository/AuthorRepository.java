package com.dogancanokur.springgurututorial.repository;

import com.dogancanokur.springgurututorial.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
