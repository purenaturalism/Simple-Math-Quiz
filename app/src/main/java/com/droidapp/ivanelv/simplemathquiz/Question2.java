package com.droidapp.ivanelv.simplemathquiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;

/**
 * Created by ivanelv on 09/06/2017.
 */

public class Question2 extends Fragment
{
    RadioButton answer;

    public Question2()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.question2, container, false);
        answer = (RadioButton) rootView.findViewById(R.id.answer3);
        answer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                    MainActivity.answer[1] = true;
                else
                    MainActivity.answer[1] = false;
            }
        });
        return rootView;
    }
}
