package mobileapp.rar.com.rarmobapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;



/**
 * Created by irshadillias on 5/5/18.
 */

public class HomeFragment extends BaseFragment {

    public static String FRAGMENT_TAG = "HomeFragment";
    private RecyclerView recyclerView;
    private ConstraintLayout profile_layout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        getUIReference(view);
        bindEvent();
    }

    public void getUIReference(View view){
        profile_layout  = view.findViewById(R.id.profileMenu);
    }

    private void bindEvent(){

        profile_layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                replaceFragment(R.id.container, ProfileFragment.newInstance(), getActivity().getSupportFragmentManager(), true);
            }

        });
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    public static Fragment newInstance(){
        return new HomeFragment();
    }
}
