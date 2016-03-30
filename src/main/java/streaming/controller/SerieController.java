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
@RequestMapping(value = "/serie")
public class SerieController {

    @Autowired
    SerieService serieService;

    @RequestMapping(value = "/lister", method = RequestMethod.GET)
    public String listerSerie(Model model) {

        Iterable<Serie> series = serieService.findAll();
        model.addAttribute("series", series);

        return "listerSerie";
    }

    @RequestMapping(value = "/ajouter", method = RequestMethod.GET)
    public String ajouterSerie(Model model) {

        model.addAttribute("maSerie", new Serie());

        return "ajouterSerie";
    }

    @RequestMapping(value = "/ajouter", method = RequestMethod.POST)
    public String ajouterSeriePost(@ModelAttribute(value = "maSerie") Serie serie) {

        serieService.save(serie);

        return "redirect:/serie/lister";
    }

    @RequestMapping(value = "/modifier/{idDuRecord}", method = RequestMethod.GET)
    public String modifierSerie(@PathVariable(value = "idDuRecord") long monId, Model model) {
        Serie serie = serieService.findOne(monId);
        model.addAttribute("maSerie", serie);

        return "modifierSerie";
    }

    @RequestMapping(value = "/modifier", method = RequestMethod.POST)
    public String modifierSeriePost(@ModelAttribute(value = "maSerie") Serie serie) {

        serieService.save(serie);

        return "redirect:/serie/lister";
    }

    @RequestMapping(value = "/supprimer/{idDuRecord}", method = RequestMethod.GET)
    public String supprimerSerie(@PathVariable(value = "idDuRecord") long monId) {

        serieService.delete(monId);

        return "redirect:/serie/lister";
    }

}
