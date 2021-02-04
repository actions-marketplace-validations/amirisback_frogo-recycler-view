package com.frogobox.recycler.core.viewshimmer

import com.frogobox.recycler.core.viewrclass.IFrogoViewAdapter
import com.frogobox.recycler.widget.FrogoRecyclerView

/*
 * Created by Faisal Amir on 03/06/2020
 * FrogoRecyclerView Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2020 FrogoBox Inc.      
 * All rights reserved
 *
 */

interface IFrogoSrvSingleton<T> {

    fun initSingleton(frogoRecyclerView: FrogoRecyclerView, frogoShimmerRecyclerView: FrogoRecyclerView): FrogoSrvSingleton<T>

    fun createLayoutLinearVertical(dividerItem: Boolean): FrogoSrvSingleton<T>

    fun createLayoutLinearHorizontal(dividerItem: Boolean): FrogoSrvSingleton<T>

    fun createLayoutStaggeredGrid(spanCount: Int): FrogoSrvSingleton<T>

    fun createLayoutGrid(spanCount: Int): FrogoSrvSingleton<T>

    fun addData(listData: List<T>): FrogoSrvSingleton<T>

    fun addCustomView(customViewInt: Int): FrogoSrvSingleton<T>

    fun addEmptyView(emptyViewInt: Int?): FrogoSrvSingleton<T>

    fun addCallback(frogoViewAdapterCallback: IFrogoViewAdapter<T>): FrogoSrvSingleton<T>

    fun addShimmerViewPlaceHolder(customViewInt: Int): FrogoSrvSingleton<T>

    fun addShimmerSumOfItemLoading(sumItem: Int): FrogoSrvSingleton<T>

    fun build(): FrogoSrvSingleton<T>
    
}