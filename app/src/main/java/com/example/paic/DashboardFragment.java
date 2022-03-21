package com.example.paic;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageButton tips13 = (ImageButton) v.findViewById(R.id.tips13);
        tips13.setOnClickListener(this);

        ImageButton tips46 = (ImageButton) v.findViewById(R.id.tips46);
        tips46.setOnClickListener(this);

        ImageButton tips79 = (ImageButton) v.findViewById(R.id.tips79);
        tips79.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tips13:
                updateDetail13();
                break;
            case R.id.tips46:
                updateDetail46();
                break;
            case R.id.tips79:
                updateDetail79();
                break;
        }
    }

    public void updateDetail13() {
        Intent intent = new Intent(getActivity(), Tips13Activity.class);
        startActivity(intent);
    }

    public void updateDetail46() {
        Intent intent = new Intent(getActivity(), Tips46Activity.class);
        startActivity(intent);
    }

    public void updateDetail79() {
        Intent intent = new Intent(getActivity(), Tips46Activity.class);
        startActivity(intent);
    }
}