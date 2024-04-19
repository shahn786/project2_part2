package com.example.project2.utilities;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CommonMethods {

    public static String hashPassword(String password) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(password.getBytes()), Base64.DEFAULT);
        } catch (NoSuchAlgorithmException e) {}
        return null;
    }
}
