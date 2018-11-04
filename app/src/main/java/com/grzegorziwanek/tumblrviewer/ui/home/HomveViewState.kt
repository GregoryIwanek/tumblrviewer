package com.grzegorziwanek.tumblrviewer.ui.home

import com.grzegorziwanek.tumblrviewer.model.data.entity.Blog

sealed class HomveViewState {

    data class ProgressState(val any: Any) : HomveViewState()

    data class DataState(val blog: Blog) : HomveViewState()

    data class ErrorState(val any: Any) : HomveViewState()

    data class ScrollState(val deltaY: Int) : HomveViewState()
}