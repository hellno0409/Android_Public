package com.example.qr_code_scanner;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.zxing.Result;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static android.view.View.Z;

public class scanqr extends AppCompatActivity implements ZXingScannerView.ResultHandler {

     ZXingScannerView ScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ScannerView =new ZXingScannerView(this);
        super.onCreate(savedInstanceState);
        setContentView(ScannerView);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }

    @Override
    public void handleResult(Result result) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "you applied for the meal successfully",
                Toast.LENGTH_SHORT);
        onBackPressed();
        toast.show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        ScannerView.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }
}
