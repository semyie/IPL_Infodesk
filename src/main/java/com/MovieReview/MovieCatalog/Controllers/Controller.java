package com.MovieReview.MovieCatalog.Controllers;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping("/hi")
    public List<List<String>> hello(){
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader("/home/samarth/codes/springProj/MovieCatalog/src/main/resources/movieinfo.csv"));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        }catch (FileNotFoundException | CsvValidationException fnfe){
            System.out.println(fnfe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records;
    }
}
