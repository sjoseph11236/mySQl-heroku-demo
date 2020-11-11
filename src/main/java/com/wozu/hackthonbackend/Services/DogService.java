package com.wozu.hackthonbackend.Services;


import com.wozu.hackthonbackend.Models.Dog;

public interface DogService {
    public Dog getDogFromDogApi();
    public void postDogFromDogApi(Dog dog);
}