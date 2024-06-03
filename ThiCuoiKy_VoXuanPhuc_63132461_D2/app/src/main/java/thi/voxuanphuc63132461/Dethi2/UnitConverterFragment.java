package thi.voxuanphuc63132461.Dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class UnitConverterFragment extends Fragment {
    EditText edtMet;
    EditText edtKilomet;
    Button btnchuyen;

    public UnitConverterFragment() {
        // Required empty public constructor
    }


    public static UnitConverterFragment newInstance(String param1, String param2) {
        UnitConverterFragment fragment = new UnitConverterFragment();
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
        View viewCau1 = inflater.inflate(R.layout.fragment_unit_converter, container, false);
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