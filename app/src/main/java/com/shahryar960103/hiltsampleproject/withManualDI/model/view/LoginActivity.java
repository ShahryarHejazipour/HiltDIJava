package com.shahryar960103.hiltsampleproject.withManualDI.model.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.shahryar960103.hiltsampleproject.R;
import com.shahryar960103.hiltsampleproject.withManualDI.model.AppContainer;
import com.shahryar960103.hiltsampleproject.withManualDI.model.MyApplication;
import com.shahryar960103.hiltsampleproject.withoutManualDI.model.UserLocalDataSource;
import com.shahryar960103.hiltsampleproject.withoutManualDI.model.UserRemoteDataSource;
import com.shahryar960103.hiltsampleproject.withoutManualDI.model.UserRepository;
import com.shahryar960103.hiltsampleproject.withoutManualDI.viewModel.LoginViewModel;

import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AppContainer appContainer= ((MyApplication) getApplication()).appContainer;
        loginViewModel=new LoginViewModel(appContainer.userRepository);




    }
}