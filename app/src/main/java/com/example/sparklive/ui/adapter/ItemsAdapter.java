package com.example.sparklive.ui.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sparklive.R;
import com.example.sparklive.data.db.DatabaseInit;
import com.example.sparklive.data.db.entities.DataEntity;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    Activity activity;
    List<DataEntity> experts;
    DatabaseInit db;

    public ItemsAdapter(Activity activity, List<DataEntity> experts) {
        this.activity = activity;
        this.experts = experts;
        db = DatabaseInit.getInstance(activity);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_view, parent, false);
        return new ItemsAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder h, final int p) {

        try{

            Log.i("TAG", "onBindViewHolder: " + experts.get(p).getId());
            Glide
                    .with(activity)
                    .load(experts.get(p).getTHUMBNAIL())
                    .centerCrop()
//                    .placeholder(R.drawable.loading_spinner)
                    .into(h.thumbnail);
            Glide
                    .with(activity)
                    .load(experts.get(p).getEXP_IMAGE())
                    .centerCrop()
//                    .placeholder(R.drawable.loading_spinner)
                    .into(h.ivAuthor);

            h.ivLikeThumb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int likes = Integer.parseInt(experts.get(p).getLIKES());
                    Log.i("TAG", "onClick: likes " + likes);
                    if (experts.get(p).isIS_LIKED()){
                        final int finalLikes1 = --likes;
                        experts.get(p).setIS_LIKED(false);
                        experts.get(p).setLIKES(String.valueOf(finalLikes1));

                        new Thread(){
                            @Override
                            public void run() {
                                super.run();
                                db.dataDao().updateLike(experts.get(p).getId(), false);
                                db.dataDao().updateLikeCount(experts.get(p).getId(), String.valueOf(finalLikes1));
                            }
                        }.start();

                        h.ivLikeThumb.setImageDrawable(activity.getDrawable(R.drawable.thumb_up_alt));
                        h.likes.setText(experts.get(p).getLIKES());
//                        notifyDataSetChanged();
                    } else {
                        final int finalLikes = ++likes;
                        experts.get(p).setIS_LIKED(true);
                        experts.get(p).setLIKES(String.valueOf(finalLikes));
                        Log.i("TAG", "onClick: final like" + finalLikes);
                        new Thread(){
                            @Override
                            public void run() {
                                super.run();
                                db.dataDao().updateLike(experts.get(p).getId(), true);
                                db.dataDao().updateLikeCount(experts.get(p).getId(), String.valueOf(finalLikes));
                            }
                        }.start();

                        h.ivLikeThumb.setImageDrawable(activity.getDrawable(R.drawable.thumb_up_blue));
                        h.likes.setText(experts.get(p).getLIKES());
//                        notifyDataSetChanged();
                    }
                }
            });

            if (experts.get(p).isIS_LIKED()){
                h.ivLikeThumb.setImageDrawable(activity.getDrawable(R.drawable.thumb_up_blue));
            }

            h.title.setText(experts.get(p).getTITLE());
            h.uploadedAt.setText(experts.get(p).getTIME_UPLOADED());
            h.expBio.setText(experts.get(p).getEXP_SHORT_DESCRIPTION());
            h.expName.setText(experts.get(p).getEXP_NAME());
            h.clicks.setText(experts.get(p).getCLICKS() + " Views");
            h.likes.setText(experts.get(p).getLIKES());
            h.thumbDesc.setText(experts.get(p).getTHUMB_DESCRIPTION());

            h.thumbnail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (h.llAuthor.getVisibility() == View.VISIBLE){
                        h.llAuthor.setVisibility(View.GONE);
                        h.llDescription.setVisibility(View.GONE);
                    } else {
                        h.llAuthor.setVisibility(View.VISIBLE);
                        h.llDescription.setVisibility(View.VISIBLE);
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return experts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title, expName, expBio, clicks, likes, thumbDesc, uploadedAt;
        LinearLayout llAuthor, llDescription;
        ImageView thumbnail, ivAuthor, ivLikeThumb;
        View v;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            v = itemView;

            expName = itemView.findViewById(R.id.tv_author);
            expBio = itemView.findViewById(R.id.tv_author_bio);
            clicks = itemView.findViewById(R.id.tv_views);
            likes = itemView.findViewById(R.id.tv_likes);
            thumbDesc = itemView.findViewById(R.id.tv_thumbnail_desc);
            uploadedAt = itemView.findViewById(R.id.tv_published_at);
            title = itemView.findViewById(R.id.tv_title);

            llAuthor = itemView.findViewById(R.id.ll_author);
            llDescription = itemView.findViewById(R.id.ll_description);

            thumbnail = itemView.findViewById(R.id.iv_thumbnail);
            ivAuthor = itemView.findViewById(R.id.iv_author);
            ivLikeThumb = itemView.findViewById(R.id.iv_like_thumb);
        }
    }


}
