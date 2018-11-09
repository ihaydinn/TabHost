package com.ismailhakkiaydin.tabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.app.Activity;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = this.getTabHost();


        TabHost.TabSpec spec1 = host.newTabSpec("1");
        TabHost.TabSpec spec2 = host.newTabSpec("2");
        TabHost.TabSpec spec3 = host.newTabSpec("3");

        Resources res = this.getResources();

        spec1.setIndicator("Real Madrid");
        spec2.setIndicator("Juventus");
        spec3.setIndicator("Manchester U");


        spec1.setContent(new Intent(this, RealMadrid.class));
        spec2.setContent(new Intent(this, Juventus.class));
        spec3.setContent(new Intent(this, Manchester.class));

        host.addTab(spec1);
        host.addTab(spec2);
        host.addTab(spec3);

    }
}
