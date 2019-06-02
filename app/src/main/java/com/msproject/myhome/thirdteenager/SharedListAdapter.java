package com.msproject.myhome.thirdteenager;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.msproject.myhome.thirdteenager.CustomObject.SharedBucket;

import java.util.ArrayList;

public class SharedListAdapter extends RecyclerView.Adapter<SharedListAdapter.ItemViewHolder> {
    ArrayList<SharedBucket> mItems;
    public SharedListAdapter(ArrayList<SharedBucket> items){
        this.mItems = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.d("item==", mItems.get(i).toString());
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shared_item, viewGroup,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {
        Log.d("item==", mItems.get(i).toString());
        itemViewHolder.title.setText(mItems.get(i).getName());
//        itemViewHolder.myImage.setImageURI(mItems.get(i).getImgURL());
        itemViewHolder.writer.setText(mItems.get(i).getWriter());
        itemViewHolder.like.setText(mItems.get(i).getLike() + "");
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
    class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView writer;
        private ImageView myImage;
        private TextView like;
        public ItemViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            writer = itemView.findViewById(R.id.writer);
            myImage = itemView.findViewById(R.id.myImage);
            like = itemView.findViewById(R.id.like_num);
        }
    }

}
