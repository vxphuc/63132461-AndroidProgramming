package ntu.voxuanphuc63132461.baitaptonghop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;


public class cau4Fragment extends Fragment {

    public cau4Fragment() {
        // Required empty public constructor
    }


    public static cau4Fragment newInstance(String param1, String param2) {
        cau4Fragment fragment = new cau4Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SQLiteDatabase db = getActivity().openOrCreateDatabase("qlsach.db", Context.MODE_PRIVATE, null);
        String sqlSelect = "Select * from Books;";
        return inflater.inflate(R.layout.fragment_cau4, container, false);
    }

}