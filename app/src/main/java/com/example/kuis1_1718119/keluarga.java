package com.example.kuis1_1718119;

import android.graphics.drawable.Drawable;

public class keluarga {
    private String nama, status;
    private Drawable gambar;

    public keluarga(String nama, String status, Drawable gambar) {
        this.nama = nama;
        this.status = status;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }
    public String getStatus() {
        return status;
    }
    public Drawable getGambar() {
        return gambar;
    }
}
