package com.bhupen.dailynews.shared.base

/**
 * Created by Bhupen on 17/03/2018.
 */

import android.content.Context

/**
 * Base view any view must implement.
 */
interface BaseView {
    /**
     * Returns the Context in which the application is running.
     * @return the Context in which the application is running
     */
    fun getContext(): Context
}