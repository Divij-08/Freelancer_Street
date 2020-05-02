package com.divij.freelancerstreet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.divij.freelancerstreet.Chats.ChatActivity;

public class MatchesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView mMatchName;
    public TextView mMatchId;
    public ImageView mMatchImage;
    public MatchesViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        mMatchId= itemView.findViewById(R.id.Matchid);
        mMatchName=itemView.findViewById(R.id.MatchName);
        mMatchImage=itemView.findViewById(R.id.MatchImage);
    }

    @Override
    public void onClick(View view) {
       Intent intent = new Intent(new Intent( view.getContext(), ChatActivity.class));
        Bundle b=new Bundle();
        b.putString("matchId",mMatchId.getText().toString());
        intent.putExtras(b);
        view.getContext().startActivity(intent);

    }
}