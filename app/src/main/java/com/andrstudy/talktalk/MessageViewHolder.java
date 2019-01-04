package com.andrstudy.talktalk;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageViewHolder extends RecyclerView.ViewHolder {

    TextView nameTextView;
    TextView messageTextView;
    ImageView messageImageView;
    CircleImageView photoImageView;

    public MessageViewHolder(View itemView) {
        super(itemView);

        nameTextView = itemView.findViewById(R.id.nameTextView);
        messageImageView =  itemView.findViewById(R.id.messageImageView);
        messageTextView = itemView.findViewById(R.id.messageTextView);
        photoImageView = itemView.findViewById(R.id.photoImageView);

    }
}