package com.example.xd.universitybazaarsystem;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.Arrays;
import java.util.List;

public class ActuarialScienceClub extends Activity {

    Context context = ActuarialScienceClub.this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_actuarial_science_club);
        Button send = (Button) this.findViewById(R.id.iblogin);

        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i("SendMailActivity", "Send Button Clicked.");
                String fromEmail = "utaorganizationmangement@gmail.com";
                String fromPassword = "19921210";
                String toEmails = "duxxx200@gmail.com";
                List<String> toEmailList = Arrays.asList(toEmails);
                Log.i("SendMailActivity", "To List: " + toEmailList);
                String emailSubject = "Received a Request!";
                String emailBody = "A student request join the Actuarial Science Club.";
                new SendMailTask(ActuarialScienceClub.this).execute(fromEmail,
                        fromPassword, toEmailList, emailSubject, emailBody);
                BCLUB();
            }
        });
    }

    private void BCLUB()
    {
        new AlertDialog.Builder(context)
                .setTitle("Success!")
                .setMessage("You have successfully Send the Request for join the Actuarial Science Club !")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        System.exit(0);
                    }
                })
                .setIcon(android.R.drawable.arrow_up_float)
                .setCancelable(false)
                .show();
    }
}
