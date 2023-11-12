package com.MovieReview.MovieCatalog.Controllers;

import com.MovieReview.MovieCatalog.Models.Movie1;
import com.MovieReview.MovieCatalog.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class dbController {
    @Autowired
    public UserRepository userRepo;

    @PostMapping("/create")
    public Movie1 createmov(@RequestParam String name, @RequestParam Integer rating){
        Movie1 mov = new Movie1();
        mov.setName(name);
        mov.setRating(rating);
        userRepo.save(mov);
        return mov;
    }

}
