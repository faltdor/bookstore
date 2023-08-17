package com.faltdor.spring6webapp.repositories;

import com.faltdor.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
