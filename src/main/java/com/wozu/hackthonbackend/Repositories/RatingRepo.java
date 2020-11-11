package com.wozu.hackthonbackend.Repositories;

import com.wozu.hackthonbackend.Models.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends CrudRepository<Rating, Long> {}
