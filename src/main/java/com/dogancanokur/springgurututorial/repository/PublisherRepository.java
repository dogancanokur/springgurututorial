package com.dogancanokur.springgurututorial.repository;

import com.dogancanokur.springgurututorial.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
