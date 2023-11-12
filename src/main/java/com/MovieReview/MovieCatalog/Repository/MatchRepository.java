package com.MovieReview.MovieCatalog.Repository;

import com.MovieReview.MovieCatalog.Models.Match;
import com.MovieReview.MovieCatalog.Service.CsvReader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends CrudRepository<Match,Integer> {

}
