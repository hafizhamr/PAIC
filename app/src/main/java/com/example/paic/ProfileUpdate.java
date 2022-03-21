package com.example.paic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileUpdate extends AppCompatActivity {

    private EditText newUsername, newPhone, newEmail;
    private Button btUpdate;
    private FirebaseDatabase firebaseDatabase;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_update);

        newUsername = (EditText)findViewById(R.id.etUsernameupdate);
        newPhone = (EditText)findViewById(R.id.etPhoneupdate);
        newEmail = (EditText)findViewById(R.id.etEmailupdate);
        btUpdate = (Button)findViewById(R.id.btUpdate);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();

        final DatabaseReference databaseReference = firebaseDatabase.getReference(firebaseAuth.getUid());

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                UserProfile userProfile = dataSnapshot.getValue(UserProfile.class);
                newUsername.setText(userProfile.getUserName());
                newPhone.setText(userProfile.getUserPhone());
                newEmail.setText(userProfile.getUserEmail());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(ProfileUpdate.this, databaseError.getCode(),
                        Toast.LENGTH_SHORT).show();

            }
        });

        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = newUsername.getText().toString();
                String phone = newPhone.getText().toString();
                String email = newEmail.getText().toString();

                UserProfile userProfile = new UserProfile(phone, email, name);
                databaseReference.setValue(userProfile);
                finish();
            }
        });
    }
}
