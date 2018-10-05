package com.ptp.phamtanphat.mvp.Dangnhap.Presenter;

import com.ptp.phamtanphat.mvp.Dangnhap.Interface.Capnhatlayout;
import com.ptp.phamtanphat.mvp.Dangnhap.Interface.CheckDangnhap;
import com.ptp.phamtanphat.mvp.Dangnhap.Model.Xulylogic;

public class PresenterDangnhap implements CheckDangnhap {

    Xulylogic xulylogic = new Xulylogic(this);
    Capnhatlayout capnhatlayout;

    public PresenterDangnhap(Capnhatlayout capnhatlayout) {
        this.capnhatlayout = capnhatlayout;
    }

    public void recievedata(String username, String password) {
        xulylogic.checkLogic(username,password);
    }

    @Override
    public void Thanhcong(String thanhcong) {
        capnhatlayout.UpdateView(thanhcong);
    }

    @Override
    public void Thatbai(String thatbai) {
        capnhatlayout.Err(thatbai);
    }
}
