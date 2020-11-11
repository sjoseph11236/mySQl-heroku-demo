package com.wozu.hackthonbackend.Repositories;

import com.wozu.hackthonbackend.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog,Long> {}