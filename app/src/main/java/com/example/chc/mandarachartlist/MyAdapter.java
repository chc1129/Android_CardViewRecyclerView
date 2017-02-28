package com.example.chc.mandarachartlist;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;

/**
 * Created by chc on 2017/02/26.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] mDataset;
    private String[] mTitleset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView pCardView;
        public TextView tTextView;
        public TextView dTextView;

        public ViewHolder(View v) {
            super(v);
            pCardView = (CardView)v.findViewById(R.id.my_cardview);
            tTextView = (TextView)v.findViewById(R.id.card_title);
            dTextView = (TextView)v.findViewById(R.id.card_date);
        }
    }

    public MyAdapter(String[] myTitleSet, String[] myDataset) {
        mDataset = myDataset;
        mTitleset = myTitleSet;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tTextView.setText(mTitleset[position]);
        holder.dTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
