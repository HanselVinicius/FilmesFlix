package com.br.natanfc.filmesflix.framework.api.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.natanfc.filmesflix.framework.api.MovieRestApiTask
import com.br.natanfc.filmesflix.data.MovieRepository
import com.br.natanfc.filmesflix.domain.Movie
import com.br.natanfc.filmesflix.implementations.MovieDataSourceImplementation
import com.br.natanfc.filmesflix.usecase.MovieListUseCase

class MovieListViewModel:ViewModel() {

    companion object{
        const val TAG = "MovieRepository"

    }


    private val movieRestApiTask = MovieRestApiTask()
    private  val movieDataSource = MovieDataSourceImplementation(movieRestApiTask)
    private val movieRepository = MovieRepository(movieDataSource)
    private val movieListUseCase = MovieListUseCase(movieRepository)




    private var _movieList = MutableLiveData<List<Movie>>()
    val movieList : LiveData<List<Movie>>
    get() = _movieList

    fun init(){
        getAllMovies()
    }
    private fun getAllMovies(){
        Thread{
            try {
                _movieList.postValue(movieListUseCase.invoke())
            }catch (exception: Exception){
                Log.d(TAG, exception.message.toString())
            }
        }.start()


    }
}