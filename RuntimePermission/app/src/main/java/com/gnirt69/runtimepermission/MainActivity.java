package com.gnirt69.runtimepermission;

import android.Manifest;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by NgocTri on 7/4/2016.
 */
public class MainActivity extends AbsRuntimePermission {
    private static final int REQUEST_PERMISSION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestAppPermissions(new String[]{
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_CONTACTS,
                        Manifest.permission.INTERNET,
                        Manifest.permission.ACCESS_NETWORK_STATE,
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.READ_CALL_LOG,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.READ_PHONE_STATE,
                },

                R.string.msg, REQUEST_PERMISSION);
    }

    /*
     Manifest.permission.ACCESS_NETWORK_STATE,
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.READ_CALL_LOG,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION,


    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />+++
    <uses-permission android:name="android.permission.INTERNET" />++++
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />+++

    <permission
        android:name="com.haydi.permission.MAPS_RECEIVE"---
        android:protectionLevel="signature" />

    <uses-permission android:name="com.googlemap.permission.MAPS_RECEIVE" />
    <uses-permission android:name="com.google.android.providers.gsf.permissions.READ_GSERVICES" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />++++
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />++++

    <!--Google Map Permissions Ends-->

    <uses-permission android:name="android.permission.READ_CONTACTS" />++
    <uses-permission android:name="android.permission.WRITE_CONTACTS" />+++
    <!-- Read Contacts from phone -->
    <uses-permission android:name="android.permission.read_contacts" />
    <uses-permission android:name="android.permission.read_phone_state" />++++
    <uses-permission android:name="android.permission.READ_CALL_LOG" />+++*/


    @Override
    public void onPermissionsGranted(int requestCode) {
        //Do anything when permisson granted
        Toast.makeText(getApplicationContext(), "Permission granted", Toast.LENGTH_LONG).show();
    }
}
