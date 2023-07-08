package cl.awakelab.ejercicioindividual1modulo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelab.ejercicioindividual1modulo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        showFirstFragment();
    }

    private void showFirstFragment() {
        FirstFragment firstFragment = FirstFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, firstFragment, "Fragment").commit();
    }
}