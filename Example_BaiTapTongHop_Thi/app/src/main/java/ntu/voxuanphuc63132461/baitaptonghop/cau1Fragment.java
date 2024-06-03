package ntu.voxuanphuc63132461.baitaptonghop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cau1Fragment extends Fragment {
    EditText edtMet;
    EditText edtKilomet;
    Button btnchuyen;
    public cau1Fragment() {
        // Required empty public constructor
    }


    public static cau1Fragment newInstance(String param1, String param2) {
        cau1Fragment fragment = new cau1Fragment();
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
        // Inflate the layout for this fragment
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        edtMet = viewCau1.findViewById(R.id.edtsom);
        edtKilomet = viewCau1.findViewById(R.id.edtsokm);
        btnchuyen = viewCau1.findViewById(R.id.btndoi);
        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataMet = edtMet.getText().toString();
                String dataKm = edtKilomet.getText().toString();

                if (!dataMet.isEmpty()){
                    Toast.makeText(viewCau1.getContext(), "m -> km", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(viewCau1.getContext(), "km -> m", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return viewCau1;
    }
}