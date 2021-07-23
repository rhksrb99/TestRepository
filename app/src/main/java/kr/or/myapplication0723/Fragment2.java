package kr.or.myapplication0723;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        TextView fg2_tv_data = view.findViewById(R.id.fg2_tv_data);
        fg2_tv_data.setText("두 번째 프래그먼트 화면");


        return view;
    }
}