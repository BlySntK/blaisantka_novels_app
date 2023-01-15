package com.blaisantkanovels.app.menu.submenu_multiverse.narrative.cartas_freedel.stories_freedel;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.blaisantkanovels.app.R;
import com.blaisantkanovels.app.menu.submenu_multiverse.cartasfreedel.adaptersandview.VPagerAdapterFreedelCapDos;
import com.blaisantkanovels.app.menu.submenu_multiverse.cartasfreedel.adaptersandview.VPagerAdapterFreedelCapUno;
import com.blaisantkanovels.app.menu.submenu_multiverse.cartasfreedel.adaptersandview.VerticalCartasFreedelViewPager;

public class Capitulo_Dos_CartasFreedel extends AppCompatActivity {

    private VerticalCartasFreedelViewPager vPagerFreedel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_dos_freedel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Cartas de Freedel");

        vPagerFreedel = findViewById(R.id.viewCartaDos);
        VPagerAdapterFreedelCapDos vAdapterFreedel = new VPagerAdapterFreedelCapDos(this);
        vPagerFreedel.setAdapter(vAdapterFreedel);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
