package com.google.ar.core.examples.java.arimurecorder;

/**
 * Created by yanhang on 9/6/17.
 */

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

public class StoragePermissionHelper {
    private static final String WRITE_STORAGE_PERMISSION = Manifest.permission.WRITE_EXTERNAL_STORAGE;
    private static final int WRITE_PERMISSION_CODE = 1;

    /**
     * Check to see we have the necessary permissions for this app.
     */
    public static boolean hasWriteExternalStoragePermission(Activity activity) {
        return ContextCompat.checkSelfPermission(activity, WRITE_STORAGE_PERMISSION) ==
                PackageManager.PERMISSION_GRANTED;
    }

    /**
     * Check to see we have the necessary permissions for this app, and ask for them if we don't.
     */
    public static void requestWriteExternalStoragePermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{WRITE_STORAGE_PERMISSION},
                WRITE_PERMISSION_CODE);
    }
}
