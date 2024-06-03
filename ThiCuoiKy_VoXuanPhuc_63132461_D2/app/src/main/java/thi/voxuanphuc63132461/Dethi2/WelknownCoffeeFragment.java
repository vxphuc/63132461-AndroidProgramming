package thi.voxuanphuc63132461.Dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class WelknownCoffeeFragment extends Fragment {
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;

    public WelknownCoffeeFragment() {
        // Required empty public constructor
    }


    public static WelknownCoffeeFragment newInstance(String param1, String param2) {
        WelknownCoffeeFragment fragment = new WelknownCoffeeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<LandScape>();
        list.add(new LandScape("cà phê trung nguyên", "b7c0306ddcac412a3952b447b808b4bb"));
        list.add(new LandScape("cà phê highland", "opl"));
        list.add(new LandScape("cà phê milano", "a851_milano"));
        list.add(new LandScape("cà phê phúc long", "cuahangpl"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 =inflater.inflate(R.layout.fragment_welknown_coffee, container, false);
        //4. Tìm điều khiển Recycler
        recyclerViewLandScape=  viewCau3.findViewById(R.id.ryCau3);

        //5. Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);

        //6. Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(viewCau3.getContext(), list);
        //7, Gắn adapter vào Recycler
        recyclerViewLandScape.setAdapter(adapter);

        return viewCau3;
    }
}