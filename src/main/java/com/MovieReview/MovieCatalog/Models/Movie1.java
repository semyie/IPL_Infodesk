package com.MovieReview.MovieCatalog.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie1 {

    String name;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;
    Integer rating;
}
