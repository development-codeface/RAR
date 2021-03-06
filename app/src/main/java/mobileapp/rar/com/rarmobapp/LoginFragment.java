package mobileapp.rar.com.rarmobapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;

/**
 * Created by irshadillias on 27/4/18.
 */

public class LoginFragment extends BaseFragment{

    public static String FRAGMENT_TAG = "LoginFragment";

    @BindView(R.id.btn_login)
    AppCompatButton btn_login;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login,container,false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getUIReference(view);
        bindEvent();
    }

    public void getUIReference(View view){
        btn_login  = view.findViewById(R.id.btn_login);
    }

    private void bindEvent(){

        btn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                replaceFragment(R.id.container, HomeFragment.newInstance(), getActivity().getSupportFragmentManager(), false);
            }

        });
    }

    public static Fragment newInstance(){
        return new LoginFragment();
    }
}
