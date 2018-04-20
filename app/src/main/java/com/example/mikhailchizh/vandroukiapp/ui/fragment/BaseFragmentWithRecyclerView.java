package com.example.mikhailchizh.vandroukiapp.ui.fragment;


import android.support.v7.widget.RecyclerView;

import com.example.mikhailchizh.vandroukiapp.R;

import butterknife.BindView;

public class BaseFragmentWithRecyclerView extends BaseFragment {

    @BindView(R.id.travel_recycler_view)
    RecyclerView travelRecyclerView;

}
