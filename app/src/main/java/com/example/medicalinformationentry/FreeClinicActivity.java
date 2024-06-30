package com.example.medicalinformationentry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.medicalinformationentry.databinding.ActivityFreeClinicBinding;

public class FreeClinicActivity extends AppCompatActivity {
    ActivityFreeClinicBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFreeClinicBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new BasicInfoFragment());

        binding.freeClinicNav.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.basic_info:
                    replaceFragment(new BasicInfoFragment());
                    break;
                case R.id.physical_info:
                    replaceFragment(new PhysicalInfoFragment());
                    break;
                case R.id.info_searching:
                    replaceFragment(new InfoSearchingFragment());
                    break;
            }
            return true;
        });

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.free_clinic_frame, fragment);
        fragmentTransaction.commit();
    }

}
