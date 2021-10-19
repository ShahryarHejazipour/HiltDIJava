package com.shahryar960103.hiltsampleproject.withManualDI.model.viewModel;

import com.shahryar960103.hiltsampleproject.withManualDI.model.model.UserRepository;

public class LoginViewModelFactory implements Factory<LoginViewModel> {
    private final UserRepository userRepository;

    public LoginViewModelFactory(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginViewModel create() {
        return null ;
    }
}
