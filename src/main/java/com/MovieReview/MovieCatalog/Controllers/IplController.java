package com.MovieReview.MovieCatalog.Controllers;

import com.MovieReview.MovieCatalog.Models.Match;
import com.MovieReview.MovieCatalog.Repository.MatchRepository;
import com.MovieReview.MovieCatalog.Service.CsvReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/match")

public class IplController {


    public List<String> convertToList(String s){
        return new ArrayList<String>(Arrays.asList(s.split(",")));
    }

    @Autowired
    public MatchRepository matchRepo;

    @GetMapping("/details")
    public void details(){

        Match m;
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader("/home/samarth/codes/springProj/MovieCatalog/src/main/resources/IPL_Matches_2008_2022.csv"));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        }catch (FileNotFoundException | CsvValidationException fnfe){
            System.out.println(fnfe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i < records.size(); i++) {
            m = new Match(
                    Integer.valueOf(records.get(i).get(0)),
                    records.get(i).get(1),
                    records.get(i).get(2),
                    Integer.valueOf(records.get(i).get(3)),
                    records.get(i).get(4),
                    records.get(i).get(5),
                    records.get(i).get(6),
                    records.get(i).get(7),
                    records.get(i).get(8),
                    records.get(i).get(9),
                    records.get(i).get(10),
                    records.get(i).get(11),
                    records.get(i).get(12),
                    Integer.valueOf(records.get(i).get(13)),
                    records.get(i).get(14),
                    records.get(i).get(15),
                    records.get(i).get(16),
                    records.get(i).get(17),
                    records.get(i).get(18),
                    records.get(i).get(19)
            );
            matchRepo.save(m);
        }
    }
}
