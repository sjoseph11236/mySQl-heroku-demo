package com.wozu.hackthonbackend.Repositories;

import com.wozu.hackthonbackend.Models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepo extends CrudRepository<Movie, Long> {}
