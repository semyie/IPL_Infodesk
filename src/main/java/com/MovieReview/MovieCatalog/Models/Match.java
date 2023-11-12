package com.MovieReview.MovieCatalog.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Ipl")
public class Match {
    @Id
    Integer ID;
    String City;
    String Date;
    Integer Season;
    String MatchNumber;
    String Team1;
    String Team2;
    String Venue;
    String TossWinner;
    String TossDecision;
    String SuperOver;
    String WinningTeam;
    String WonBy;
    Integer Margin;
    String method;
    String Player_of_Match;
    String Team1Players;

    String Team2Players;
    String Umpire1;
    String Umpire2;

    public Match(Integer ID, String city, String date, Integer season, String matchNumber, String team1, String team2, String venue, String tossWinner, String tossDecision, String superOver, String winningTeam, String wonBy, Integer margin, String method, String player_of_Match, String team1Players, String team2Players, String umpire1, String umpire2) {
        this.ID = ID;
        City = city;
        Date = date;
        Season = season;
        MatchNumber = matchNumber;
        Team1 = team1;
        Team2 = team2;
        Venue = venue;
        TossWinner = tossWinner;
        TossDecision = tossDecision;
        SuperOver = superOver;
        WinningTeam = winningTeam;
        WonBy = wonBy;
        Margin = margin;
        this.method = method;
        Player_of_Match = player_of_Match;
        Team1Players = team1Players;
        Team2Players = team2Players;
        Umpire1 = umpire1;
        Umpire2 = umpire2;
    }
}
