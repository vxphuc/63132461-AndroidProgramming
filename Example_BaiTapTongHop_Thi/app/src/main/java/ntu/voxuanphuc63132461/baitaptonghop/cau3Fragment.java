package ntu.voxuanphuc63132461.baitaptonghop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class cau3Fragment extends Fragment {

    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;
    public cau3Fragment() {
        // Required empty public constructor
    }


    public static cau3Fragment newInstance(String param1, String param2) {
        cau3Fragment fragment = new cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list = new ArrayList<LandScape>();
        list.add(new LandScape("Cột cờ Hà Nội", "hanoi_flag_tower"));
        list.add(new LandScape("Tháp Eiffel", "eiffel_tower"));
        list.add(new LandScape("Cung điện Buckingham", "buckingham_palace"));
        list.add(new LandScape("Tượng nữ thần tự do", "nu_than_tu_do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCau3 =inflater.inflate(R.layout.fragment_cau3, container, false);
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