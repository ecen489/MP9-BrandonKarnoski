package com.google.firebase.codelab.mlkit;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class FindTextAdapter extends RecyclerView.Adapter<FindTextAdapter.TextViewHolder> {
    private final List<String> mWordList;
    private LayoutInflater mInflater;

    public FindTextAdapter(Context context, List<String> wordList){
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.findtext_item, parent, false);
        return new TextViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.textItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    class TextViewHolder extends RecyclerView.ViewHolder {
        public final TextView textItemView;
        final FindTextAdapter mAdapter;


        public TextViewHolder(@NonNull View itemView, FindTextAdapter adapter) {
            super(itemView);
            textItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;

        }
    }




}