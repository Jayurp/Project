package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class ENOTES extends AppCompatActivity
{

    Spinner dept_spinner, sem_spinner, subject_spinner;
    Button get_notes_button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enotes);

        //Variable Initializations
        dept_spinner = findViewById(R.id.dept_spinner);
        sem_spinner = findViewById(R.id.sem_spinner);
        subject_spinner = findViewById(R.id.subject_spinner);
        get_notes_button = findViewById(R.id.get_notes_button);

        //Setting dept_spinner adapter
        ArrayAdapter<CharSequence> ad_dept = ArrayAdapter.createFromResource(this, R.array.department_names, android.R.layout.simple_spinner_item);
        ad_dept.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dept_spinner.setAdapter(ad_dept);

        //setting sem_spinner adapter
        ArrayAdapter<CharSequence> ad_sem = ArrayAdapter.createFromResource(this, R.array.sem_names, android.R.layout.simple_spinner_item);
        ad_sem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sem_spinner.setAdapter(ad_sem);

        //setting subject_spinner adapter
        ArrayAdapter<CharSequence> ad_first_sub = ArrayAdapter.createFromResource(this, R.array.first_sem_sub, android.R.layout.simple_spinner_item);
        ad_first_sub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> ad_second_sub = ArrayAdapter.createFromResource(this, R.array.second_sem_sub, android.R.layout.simple_spinner_item);
        ad_second_sub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> ad_third_sub = ArrayAdapter.createFromResource(this, R.array.third_sem_sub, android.R.layout.simple_spinner_item);
        ad_second_sub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> ad_fourth_sub= ArrayAdapter.createFromResource(this, R.array.fourth_sem_sub, android.R.layout.simple_spinner_item);
        ad_fourth_sub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> ad_fifth_sub = ArrayAdapter.createFromResource(this, R.array.fifth_sem_sub, android.R.layout.simple_spinner_item);
        ad_fifth_sub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> ad_sixth_sub = ArrayAdapter.createFromResource(this, R.array.sixth_sem_sub, android.R.layout.simple_spinner_item);
        ad_sixth_sub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sem_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 1)
                    subject_spinner.setAdapter(ad_first_sub);
                else if(position == 2)
                    subject_spinner.setAdapter(ad_second_sub);
                else if(position == 3)
                    subject_spinner.setAdapter(ad_third_sub);
                else if(position == 4)
                    subject_spinner.setAdapter(ad_fourth_sub);
                else if(position == 5)
                    subject_spinner.setAdapter(ad_fifth_sub);
                else if(position == 6)
                    subject_spinner.setAdapter(ad_sixth_sub);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        get_notes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}