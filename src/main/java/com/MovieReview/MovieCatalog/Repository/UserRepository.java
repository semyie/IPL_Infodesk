package com.MovieReview.MovieCatalog.Repository;

import com.MovieReview.MovieCatalog.Models.Movie1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Movie1,Integer> {

}
