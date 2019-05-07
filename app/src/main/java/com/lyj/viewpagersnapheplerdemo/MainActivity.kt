package com.lyj.viewpagersnapheplerdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var mRecyclerView: RecyclerView
    lateinit var mData: ArrayList<String>
    lateinit var mLayoutManager: LinearLayoutManager
    lateinit var mGallerySnapHelper: ViewPagerSnapHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView = recycler_view
        mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mRecyclerView.layoutManager = mLayoutManager
        initData()
        mRecyclerView.adapter = SnapHelperAdapter(this, mData)
        mGallerySnapHelper = ViewPagerSnapHelper()
        mGallerySnapHelper.attachToRecyclerView(mRecyclerView)
    }

    private fun initData() {
        mData = ArrayList()
        for (i in 0..59) {
            mData.add("i=$i")
        }
    }
}
