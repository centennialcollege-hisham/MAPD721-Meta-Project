package com.example.data.repoistory

import com.example.data.prefs.Prefs
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class DataRepository {

    @Inject
    lateinit var prefs: Prefs

}

