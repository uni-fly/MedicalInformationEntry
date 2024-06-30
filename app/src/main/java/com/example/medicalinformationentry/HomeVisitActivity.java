package com.example.medicalinformationentry;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.medicalinformationentry.databinding.ActivityHomeVisitBinding;

public class HomeVisitActivity extends AppCompatActivity {
    ActivityHomeVisitBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeVisitBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new PatientInfoFragment());

        binding.homeVisitNav.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.patient_info:
                    replaceFragment(new PatientInfoFragment());
                    break;
                case R.id.recovery_info:
                    replaceFragment(new RecoveryInfoFragment());
                    break;

            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.home_visit_frame, fragment);
        fragmentTransaction.commit();
    }
}
