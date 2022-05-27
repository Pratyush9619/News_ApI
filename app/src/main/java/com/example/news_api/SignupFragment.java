package com.example.news_api;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class SignupFragment extends Fragment {

   private FirebaseAuth mAuth;
   EditText name ,Email ,number , Password ;
   Button signup ;
   CheckBox check ;
   TextView signin ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_signup, container, false);

        mAuth = FirebaseAuth.getInstance();
        name =  view.findViewById(R.id.signupname);
        Email = view.findViewById(R.id.signupemail);
        number = view.findViewById(R.id.signupnumber);
        Password = view.findViewById(R.id.signuppassword);
        signup = view.findViewById(R.id.btnregister);
        check = view.findViewById(R.id.checkbox);
        signin = view. findViewById(R.id.signnow);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createfirebaseuser();
            }
        });

        return view ;
    }

    private void createfirebaseuser() {

        String userName = name.getText().toString();
        String userEmail = Email.getText().toString();
        String usernumber = String.valueOf(number.getText().toString());
        String userPassword = Password.getText().toString();


        if(TextUtils.isEmpty(userName)){
            name.setError("Name is Empty");
            return;
        }
        if (TextUtils.isEmpty(userEmail)) {

            Email.setError("Email is Empty");
            return;
        }

        if(TextUtils.isEmpty(usernumber)){
           number.setError("Number is Empty");
           return;
        }
        if (TextUtils.isEmpty(userPassword)){
            Password.setError("Password is empty");
            return;
        }
        if(!check.isChecked()){
           Toast.makeText(getActivity(),"Please check term and conditions",Toast.LENGTH_SHORT).show();
            return;
        }



            mAuth.createUserWithEmailAndPassword(userEmail, userPassword)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(getActivity(), "Password Created", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(getActivity(), "Password not created", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
    }
}