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
@Controller
@RequestMapping(value = "/film")
public class FilmController {
    
    @Autowired
    FilmService filmService;
    
    @Autowired
    GenreService genreService;
    
    @RequestMapping(value = "/lister", method = RequestMethod.GET)
    public String listerFilm(Model model) {
        
        Iterable<Film> films = filmService.findAll();
        model.addAttribute("films", films);

        return "listerFilm";
    }
    
    @RequestMapping(value = "/ajouter", method = RequestMethod.GET)
    public String ajouterFilm(Model model) {
        Iterable<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);
        model.addAttribute("monFilm", new Film());

        return "ajouterFilm";
    }
    
    @RequestMapping(value = "/ajouter", method = RequestMethod.POST)
    public String ajouterFilmPost(@ModelAttribute(value = "monFilm")Film film) {
        filmService.save(film);

        return "redirect:/film/lister";
    }
     
    @RequestMapping(value = "/modifier/{idDuRecord}", method = RequestMethod.GET)
    public String modifierFilm(@PathVariable(value="idDuRecord")long monId, Model model) {
        System.out.println("aquiii****************");
        Iterable<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);
        Film film = filmService.findOne(monId);
        model.addAttribute("monFilm", film);

        return "modifierFilm";
    }
    
    @RequestMapping(value = "/modifier", method = RequestMethod.POST)
     public String modifierFilmPost(@ModelAttribute(value = "monFilm")Film film) {
        
        filmService.save(film);

        return "redirect:/film/lister";
    }
     
    @RequestMapping(value = "/supprimer/{idDuRecord}", method = RequestMethod.GET)
    public String supprimerFilm(@PathVariable(value="idDuRecord")long monId) {
        
        filmService.delete(monId);

        return "redirect:/film/lister";
    }
    
}
