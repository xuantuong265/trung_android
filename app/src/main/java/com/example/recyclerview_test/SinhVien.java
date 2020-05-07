package com.example.recyclerview_test;

public class SinhVien {
    private String Name;
    private String DiaChi;
    private int NamSinh;

    public SinhVien(String name, String diaChi, int namSinh) {
        Name = name;
        DiaChi = diaChi;
        NamSinh = namSinh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }
}
