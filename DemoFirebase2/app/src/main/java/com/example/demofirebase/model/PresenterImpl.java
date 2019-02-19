package com.example.demofirebase.model;

import android.text.TextUtils;

import com.example.demofirebase.presenter.RegisPresenter;
import com.example.demofirebase.view.RegisterView;

public class PresenterImpl implements RegisPresenter {

    RegisterView mRegisterView;

    public PresenterImpl(RegisterView registerView) {
        this.mRegisterView = registerView;
    }

    @Override
    public void validData(String email, String password, String confirm) {
        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password))
        {
            mRegisterView.onValid();
        }
        else {

        }
    }
}
