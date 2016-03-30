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
@RequestMapping(value = "/genre")
public class GenreController {
    
    @Autowired
    GenreService genreService;
    
     
    @RequestMapping(value = "/lister", method = RequestMethod.GET)
    public String listerGenre(Model model) {
        
        Iterable<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);

        return "listerGenre";
    }
    
    @RequestMapping(value = "/ajouter", method = RequestMethod.GET)
    public String ajouterGenre(Model model) {
        
        model.addAttribute("monGenre", new Genre());

        return "ajouterGenre";
    }
    
    @RequestMapping(value = "/ajouter", method = RequestMethod.POST)
    public String ajouterGenrePost(@ModelAttribute(value = "monGenre")Genre genre) {
        
        genreService.save(genre);

        return "redirect:/genre/lister";
    }
    
    @RequestMapping(value = "/modifier/{idDuRecord}", method = RequestMethod.GET)
    public String modifierGenre(@PathVariable(value="idDuRecord")long monId, Model model) {
        Genre genre = genreService.findOne(monId);
        model.addAttribute("monGenre", genre);

        return "modifierGenre";
    }
    
    @RequestMapping(value = "/modifier", method = RequestMethod.POST)
     public String modifierGenrePost(@ModelAttribute(value = "monGenre")Genre genre) {
        
        genreService.save(genre);

        return "redirect:/genre/lister";
    }
     
     
    @RequestMapping(value = "/supprimer/{idDuRecord}", method = RequestMethod.GET)
    public String supprimerGenre(@PathVariable(value="idDuRecord")long monId) {
        
        genreService.delete(monId);

        return "redirect:/genre/lister";
    }
    
}
