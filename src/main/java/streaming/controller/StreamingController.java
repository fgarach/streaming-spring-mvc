/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Serie;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.SerieService;

/**
 *
 * @author tom
 */
//@Controller
@RequestMapping(value = "/streaming")
public class StreamingController {
    
    @Autowired
    FilmService filmService;
    
    @Autowired
    SerieService serieService;
    
    @Autowired
    GenreService genreService;
    
    @RequestMapping(value = "/lister_film", method = RequestMethod.GET)
    public String listerFilm(Model model) {
        
        Iterable<Film> films = filmService.findAll();
        model.addAttribute("films", films);

        return "listerFilm";
    }
    
    @RequestMapping(value = "/lister_serie", method = RequestMethod.GET)
    public String listerSerie(Model model) {
        
        Iterable<Serie> series = serieService.findAll();
        model.addAttribute("series", series);

        return "listerSerie";
    }
    
    @RequestMapping(value = "/lister_genre", method = RequestMethod.GET)
    public String listerGenre(Model model) {
        
        Iterable<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);

        return "listerGenre";
    }
    
    @RequestMapping(value = "/ajouter_genre", method = RequestMethod.GET)
    public String ajouterGenre(Model model) {
        
        model.addAttribute("monGenre", new Genre());

        return "ajouterGenre";
    }
    
    @RequestMapping(value = "/ajouter_genre", method = RequestMethod.POST)
    public String ajouterGenrePost(@ModelAttribute(value = "monGenre")Genre genre) {
        
        genreService.save(genre);

        return "redirect:/streaming/lister_genre";
    }
    
    @RequestMapping(value = "/ajouter_film", method = RequestMethod.GET)
    public String ajouterFilm(Model model) {
        
        Iterable<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);
        model.addAttribute("monFilm", new Film());

        return "ajouterFilm";
    }
    
    @RequestMapping(value = "/ajouter_film", method = RequestMethod.POST)
    public String ajouterFilmPost(@ModelAttribute(value = "monFilm")Film film) {
        
        filmService.save(film);

        return "redirect:/streaming/lister_film";
    }
    
    @RequestMapping(value = "/ajouter_serie", method = RequestMethod.GET)
    public String ajouterSerie(Model model) {
        
        model.addAttribute("maSerie", new Serie());

        return "ajouterSerie";
    }
    
    @RequestMapping(value = "/ajouter_serie", method = RequestMethod.POST)
    public String ajouterSeriePost(@ModelAttribute(value = "maSerie")Serie serie) {
        
        serieService.save(serie);

        return "redirect:/streaming/lister_serie";
    }
    
    @RequestMapping(value = "/modifier_serie/{idDuRecord}", method = RequestMethod.GET)
    public String modifierSerie(@PathVariable(value="idDuRecord")long monId, Model model) {
        Serie serie = serieService.findOne(monId);
        model.addAttribute("maSerie", serie);

        return "modifierSerie";
    }
    
    @RequestMapping(value = "/modifier_serie/{idDuRecord}", method = RequestMethod.POST)
     public String modifierSeriePost(@ModelAttribute(value = "maSerie")Serie serie) {
        
        serieService.save(serie);

        return "redirect:/streaming/lister_serie";
    }
     
     @RequestMapping(value = "/modifier_genre/{idDuRecord}", method = RequestMethod.GET)
    public String modifierGenre(@PathVariable(value="idDuRecord")long monId, Model model) {
        Genre genre = genreService.findOne(monId);
        model.addAttribute("monGenre", genre);

        return "modifierGenre";
    }
    
    @RequestMapping(value = "/modifier_genre/{idDuRecord}", method = RequestMethod.POST)
     public String modifierGenrePost(@ModelAttribute(value = "monGenre")Genre genre) {
        
        genreService.save(genre);

        return "redirect:/streaming/lister_genre";
    }
     
     @RequestMapping(value = "/modifier_film/{idDuRecord}", method = RequestMethod.GET)
    public String modifierFilm(@PathVariable(value="idDuRecord")long monId, Model model) {
        Iterable<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);
        Film film = filmService.findOne(monId);
        model.addAttribute("monFilm", film);

        return "modifierFilm";
    }
    
    @RequestMapping(value = "/modifier_film/{idDuRecord}", method = RequestMethod.POST)
     public String modifierFilmPost(@ModelAttribute(value = "monFilm")Film film) {
        
        filmService.save(film);

        return "redirect:/streaming/lister_film";
    }
     
    @RequestMapping(value = "/supprimer_serie/{idDuRecord}", method = RequestMethod.GET)
    public String supprimerSerie(@PathVariable(value="idDuRecord")long monId) {
        
        serieService.delete(monId);

        return "redirect:/streaming/lister_serie";
    }
    
    @RequestMapping(value = "/supprimer_genre/{idDuRecord}", method = RequestMethod.GET)
    public String supprimerGenre(@PathVariable(value="idDuRecord")long monId) {
        
        genreService.delete(monId);

        return "redirect:/streaming/lister_genre";
    }
    
    @RequestMapping(value = "/supprimer_film/{idDuRecord}", method = RequestMethod.GET)
    public String supprimerFilm(@PathVariable(value="idDuRecord")long monId) {
        
        filmService.delete(monId);

        return "redirect:/streaming/lister_film";
    }
    
}
