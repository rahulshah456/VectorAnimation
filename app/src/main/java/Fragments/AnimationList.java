package Fragments;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.droid2developers.vectoranimation.R;

public class AnimationList extends Fragment {

    AnimationDrawable rocketAnimation;
    ImageView imageView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment,container,false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        imageView = (ImageView) view.findViewById(R.id.imageViewId);
        imageView.setBackgroundResource(R.drawable.list);
        rocketAnimation = (AnimationDrawable) imageView.getBackground();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rocketAnimation.start();
            }
        });
    }
}
