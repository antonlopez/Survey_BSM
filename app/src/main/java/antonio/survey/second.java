package antonio.survey;

/**
 * Created by antonio on 1/3/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class second extends Fragment {

    SeekBar happy, bible, God, interested;
    TextView happ, knowledge, believe, interest;
    EditText phoneNumber, emailAdress;



    second(){
        //  empty constructor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.second, container, false);


        happy = (SeekBar) rootView.findViewById(R.id.happy_bar);
        happ = (TextView) rootView.findViewById(R.id.happy_id);

        bible = (SeekBar) rootView.findViewById(R.id.bible_Bar);
        knowledge = (TextView) rootView.findViewById(R.id.knowledge_id);

        God = (SeekBar) rootView.findViewById(R.id.God_bar);
        believe = (TextView) rootView.findViewById(R.id.believe_id);

        interested = (SeekBar) rootView.findViewById(R.id.interested_bar);
        interest = (TextView) rootView.findViewById(R.id.interest_id);

        phoneNumber = (EditText) rootView.findViewById(R.id.phoneNumber);
        emailAdress = (EditText) rootView.findViewById(R.id.emailAddress);


        final CheckBox yes = (CheckBox)  rootView.findViewById(R.id.id_yes);
        final CheckBox no = (CheckBox)  rootView.findViewById(R.id.id_no);




        phoneNumber.setVisibility(rootView.GONE);
        emailAdress.setVisibility(rootView.GONE);

        yes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (yes.isChecked()==true) {

                    phoneNumber.setVisibility(rootView.VISIBLE);
                    emailAdress.setVisibility(rootView.VISIBLE);
                    DataManager.info = true;


                   no.setEnabled(false);

                }

                if (yes.isChecked()==false) {

                    phoneNumber.setVisibility(rootView.GONE);
                    emailAdress.setVisibility(rootView.GONE);
                    no.setEnabled(true);

                }



            }
        });


        no.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (no.isChecked()==true){

                    DataManager.info = false;
                    yes.setEnabled(false);

                }

                if (no.isChecked()==false){


                    yes.setEnabled(true);

                }


            }
        });





        phoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                DataManager.phoneNumber = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




        emailAdress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                DataManager.emailAddress = s.toString();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });





        happy.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                happ.setText(i+"");
                DataManager.happiness = i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        bible.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                knowledge.setText(i+"");

                DataManager.BibleKnowledge = i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        God.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                believe.setText(i+"");
                DataManager.believeinGod =i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        interested.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                interest.setText(i+"");
                DataManager.interested = i;



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });






        return rootView;
    }





















    @Override
    public void onActivityCreated(Bundle SavedInstanceState){
        super.onActivityCreated(SavedInstanceState);






    }












}
