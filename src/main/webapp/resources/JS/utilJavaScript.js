/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function init() {
    $('#menu').load('menu');
    $('#contenu').load('contenu');
    $('#pied').load('pied');
    
}

function listerFilm() {
//    $('#menu').load('menu');
    $('#contenu').load('film/lister');
//    $('#pied').load('pied');
}

function modifierFilm(id) {
    $('#contenu').load('film/modifier/' + id);
}

function modifierFilmPost() {
    $.post(path + "film/modifier", $('form').serialize(), function success(data) {
        $('#contenu').html(data);
    });
}

function supprimerFilm(id) {
    $('#contenu').load('film/supprimer/' + id);
}

function ajouterFilm() {
    $('#contenu').load('film/ajouter');
}

function ajouterFilmPost() {
    $.post(path + "film/ajouter", $('form').serialize(), function success(data) {
        $('#contenu').html(data);
    });
}

function listerGenre() {
//    $('#menu').load('menu');
    $('#contenu').load('genre/lister');
//    $('#pied').load('pied');
}

function modifierGenre(id) {
    $('#contenu').load('genre/modifier/' + id);
}

function modifierGenrePost() {
    $.post(path + "genre/modifier", $('form').serialize(), function success(data) {
        $('#contenu').html(data);
    });
}

function supprimerGenre(id) {
    $('#contenu').load('genre/supprimer/' + id);
}

function ajouterGenre() {
    $('#contenu').load('genre/ajouter');
}

function ajouterGenrePost() {
    $.post(path + "genre/ajouter", $('form').serialize(), function success(data) {
        $('#contenu').html(data);
    });
}

function listerSerie() {
//    $('#menu').load('menu');
    $('#contenu').load('serie/lister');
//    $('#pied').load('pied');
}

function modifierSerie(id) {
    $('#contenu').load('serie/modifier/' + id);
}

function modifierSeriePost() {
    $.post(path + "serie/modifier", $('form').serialize(), function success(data) {
        $('#contenu').html(data);
    });
}

function supprimerSerie(id) {
    $('#contenu').load('serie/supprimer/' + id);
}

function ajouterSerie() {
    $('#contenu').load('serie/ajouter');
}

function ajouterSeriePost() {
    $.post(path + "serie/ajouter", $('form').serialize(), function success(data) {
        $('#contenu').html(data);
    });
}



//function login() {
//    afficheSablier();
//    $('#menu').load('login', {login: $('[name=login]').val(), mdp: $('[name=mdp]').val()});
//    $('#contenu').load('_Jeux.jsp');
//    cacheSablier();
//}
function afficheSablier() {

    $('.sablier').show();

}

function cacheSablier() {

    $('.sablier').hide();

}
//
//function inscription() {
//    afficheSablier();
//    $('#contenu').load('inscription', {login: $('[name=logininsc]').val(), mdp: $('[name=mdpinsc]').val()});
//    cacheSablier();
//}
//
//function formulaireInscription() {
//    afficheSablier();
//    $('#contenu').load('_Inscription.jsp');
//    cacheSablier();
//}
//
//function deconnexion() {
//    afficheSablier();
//    $('#menu').load('deconnexion');
//    $('#contenu').load('_Accueil.jsp');
//    cacheSablier();
//}
//
//function nouvellePartie() {
//    afficheSablier();
//    $('#contenu').load('nouvelle_partie');
//    cacheSablier();
//}
//
//function partieEnCours() {
//    afficheSablier();
//    $('#contenu').load('parties');
//    cacheSablier();
//}

