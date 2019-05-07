package com.lyj.viewpagersnapheplerdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item_layout.view.*
import java.util.ArrayList


/**
 *@author lyj
 *@data 2019/5/7
 *Email 15707495510@163.com
 */
class SnapHelperAdapter(context: Context, data: ArrayList<String>) :
    RecyclerView.Adapter<SnapHelperAdapter.GalleryViewHolder>() {
    private var mInflater: LayoutInflater = LayoutInflater.from(context)
    private var mData: ArrayList<String> = data
    private var imgs = intArrayOf(
        R.drawable.jdzz,
        R.drawable.ccdzz,
        R.drawable.dfh,
        R.drawable.dlzs,
        R.drawable.sgkptt,
        R.drawable.ttxss,
        R.drawable.zmq,
        R.drawable.zzhx
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val view = mInflater.inflate(R.layout.item_layout, parent, false)
        return GalleryViewHolder(view)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val itemView =
            holder.mImageView.setImageResource(imgs[position % 8])
        holder.mTextView.text = mData[position]

    }

    override fun getItemCount(): Int {
        return mData.size
    }

    inner class GalleryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mImageView: ImageView = itemView.image
        var mTextView: TextView = itemView.tv_num

    }
}