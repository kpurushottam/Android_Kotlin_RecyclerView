package com.krp.android.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by purushottam on 8/6/17.
 */
class RAdapter(context: Context) : RecyclerView.Adapter<RViewHolder>() {

    private val MAX_ITEM_COUNT: Int = 12;
    private var mContext: Context? = null


    init {
        mContext = context
    }


    override fun onBindViewHolder(holder: RViewHolder?, position: Int) {
        /*val tView = holder?.itemView as TextView
        tView.text = "Hello";*/
    }

    override fun getItemCount(): Int {
        return MAX_ITEM_COUNT;
    }

    override fun onCreateViewHolder(container: ViewGroup?, itemType: Int): RViewHolder {
        return RViewHolder(LayoutInflater.from(mContext)
                .inflate(R.layout.content_item_recycler, container, false))
    }

}