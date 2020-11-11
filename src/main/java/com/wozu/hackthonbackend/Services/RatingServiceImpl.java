package com.wozu.hackthonbackend.Services;

import com.wozu.hackthonbackend.Models.Rating;
import com.wozu.hackthonbackend.Repositories.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepo ratingRepo;

    @Override
    public void postRating(Rating rating) {
        ratingRepo.save(rating);
    }
}
