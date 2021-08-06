package com.example.project;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;

public class SCANNER extends AppCompatActivity {

    String permission_camera[] = {"android.permission.CAMERA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED)
        {
         ActivityCompat.requestPermissions(this, permission_camera, 20);
        }
        else
        {

        }
        Intent camera_intent =new  Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera_intent, 21);

    }

}