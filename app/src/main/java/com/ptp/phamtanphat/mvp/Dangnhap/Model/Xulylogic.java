package com.ptp.phamtanphat.mvp.Dangnhap.Model;

import com.ptp.phamtanphat.mvp.Dangnhap.Interface.CheckDangnhap;

public class Xulylogic {

    CheckDangnhap checkDangnhap;

    public Xulylogic(CheckDangnhap checkDangnhap) {
        this.checkDangnhap = checkDangnhap;
    }

    public void checkLogic(String username, String password) {
        if (username.contains("a")) {
            checkDangnhap.Thanhcong("Co ky tu a");
        } else {
            checkDangnhap.Thatbai("Khong co ky tu a");
        }
    }
}
abstract class Xuly{
    String dung;
    public abstract void Xulydung();
    public abstract void Xulysai();

    public void setDung(String dung){
        this.dung = dung;
        Xulydung();
    }
}