package com.example.bones;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.bones.databinding.FragmentBaseBinding;
import com.example.bones.databinding.FragmentHomeBinding;
public class base extends Fragment {

    private FragmentBaseBinding binding;
    NavController navController;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        Glide.with(this)
                .asGif( )
                .load(R.drawable.dokutah)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(binding.forum);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBaseBinding.inflate(inflater, container , false);
        return binding.getRoot();
    }
}