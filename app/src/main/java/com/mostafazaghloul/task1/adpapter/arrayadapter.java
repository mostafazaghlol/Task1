package com.mostafazaghloul.task1.adpapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mostafazaghloul.task1.R;
import com.mostafazaghloul.task1.model.order;

public class arrayadapter extends ArrayAdapter<order> {
    order[] objects;
    public arrayadapter(@NonNull Context context, int resource, @NonNull order[] objects) {
        super(context, resource, objects);
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        ImageView orderimage,isnewImage;
        TextView maintitle,mainTime,mainType,mainhelpType,mainhelpTypeno;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
            orderimage = (ImageView)listItemView.findViewById(R.id.itemimage);
            isnewImage = (ImageView)listItemView.findViewById(R.id.orangecircle);
            maintitle = (TextView)listItemView.findViewById(R.id.maintitle);
            mainTime = (TextView)listItemView.findViewById(R.id.maintime);
            mainType = (TextView)listItemView.findViewById(R.id.mainType);
            mainhelpType = (TextView)listItemView.findViewById(R.id.mainhelptype);
            mainhelpTypeno = (TextView)listItemView.findViewById(R.id.mainhelptypeno);
            order or = this.objects[position];
            orderimage.setImageResource(or.getImageid());
            maintitle.setText(or.getMainMessage());
            mainTime.setText(or.getTime());
            mainType.setText(or.getPeopletype());
            mainhelpType.setText(or.getHelptype());
            mainhelpTypeno.setText(or.getHelpnumber());
            if(or.isIsnew()){
                isnewImage.setVisibility(View.VISIBLE);
            }else{
                isnewImage.setVisibility(View.INVISIBLE);
            }
        }
        return listItemView;
    }
}
