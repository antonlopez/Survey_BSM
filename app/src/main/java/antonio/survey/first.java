package antonio.survey;

/**
 * Created by antonio on 1/3/17.
 */

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class first extends Fragment {

     EditText nameInput, ageInput, majorInput;





    public first(){

    }








    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first, container, false);






        return rootView;
    }




@Override
public void onActivityCreated(Bundle SavedInstanceState){
super.onActivityCreated(SavedInstanceState);


    nameInput = (EditText) getActivity().findViewById(R.id.input_name);
    ageInput = (EditText) getActivity().findViewById(R.id.input_age);
    majorInput = (EditText) getActivity().findViewById(R.id.input_major) ;




    nameInput.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            DataManager.name = s.toString();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    });



    ageInput.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            DataManager.age = s.toString();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    });

    majorInput.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            DataManager.major = s.toString();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    });




}















}
