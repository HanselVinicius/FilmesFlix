package com.br.natanfc.filmesflix.data

import com.br.natanfc.filmesflix.domain.Movie

interface MovieDataSource {

    fun getAllMoviesFromAp(): List<Movie>

}