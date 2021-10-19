package com.shahryar960103.hiltsampleproject.withoutManualDI.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shahryar960103.hiltsampleproject.R;
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

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://example.com")
                .build();

        UserRemoteDataSource remoteDataSource = new UserRemoteDataSource(retrofit);
        UserLocalDataSource localDataSource = new UserLocalDataSource();
        UserRepository userRepository = new UserRepository(localDataSource, remoteDataSource);
        //loginViewModel = new LoginViewModel(userRepository);
    }
}