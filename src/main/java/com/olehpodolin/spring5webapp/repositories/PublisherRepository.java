package com.olehpodolin.spring5webapp.repositories;

import com.olehpodolin.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
