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

public class Focus extends Activity {

    Context context = Focus.this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_focus);
        Button send = (Button) this.findViewById(R.id.iblogin);

        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i("SendMailActivity", "Send Button Clicked.");
                String fromEmail = "utaorganizationmangement@gmail.com";
                String fromPassword = "1992package com.example.xd.universitybazaarsystem;\n" +
                        "\n" +
                        "import android.app.Activity;\n" +
                        "import android.app.AlertDialog;\n" +
                        "import android.content.Context;\n" +
                        "import android.content.DialogInterface;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.util.Log;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import java.util.Arrays;\n" +
                        "import java.util.List;\n" +
                        "\n" +
                        "public class Focus extends Activity {\n" +
                        "\n" +
                        "    Context context = Focus.this;\n" +
                        "    @Override\n" +
                        "    public void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.group_focus);\n" +
                        "        Button send = (Button) this.findViewById(R.id.iblogin);\n" +
                        "\n" +
                        "        send.setOnClickListener(new View.OnClickListener() {\n" +
                        "\n" +
                        "            public void onClick(View v) {\n" +
                        "                Log.i(\"SendMailActivity\", \"Send Button Clicked.\");\n" +
                        "                String fromEmail = \"utaorganizationmangement@gmail.com\";\n" +
                        "                String fromPassword = \"19921210\";\n" +
                        "                String toEmails = \"duxxx200@gmail.com\";\n" +
                        "                List<String> toEmailList = Arrays.asList(toEmails);\n" +
                        "                Log.i(\"SendMailActivity\", \"To List: \" + toEmailList);\n" +
                        "                String emailSubject = \"Received a Request!\";\n" +
                        "                String emailBody = \"A student request join the Focus Club.\";\n" +
                        "                new SendMailTask(Focus.this).execute(fromEmail,\n" +
                        "                        fromPassword, toEmailList, emailSubject, emailBody);\n" +
                        "                BCLUB();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "    private void BCLUB()\n" +
                        "    {\n" +
                        "        new AlertDialog.Builder(context)\n" +
                        "                .setTitle(\"Success!\")\n" +
                        "                .setMessage(\"You have successfully Send the Request for join the Focus Club !\")\n" +
                        "                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()\n" +
                        "                {\n" +
                        "                    public void onClick(DialogInterface dialog, int which)\n" +
                        "                    {\n" +
                        "                        System.exit(0);\n" +
                        "                    }\n" +
                        "                })\n" +
                        "                .setIcon(android.R.drawable.arrow_up_float)\n" +
                        "                .setCancelable(false)\n" +
                        "                .show();\n" +
                        "    }\n" +
                        "}\n1210";
                String toEmails = "duxxx200@gmail.com";
                List<String> toEmailList = Arrays.asList(toEmails);
                Log.i("SendMailActivity", "To List: " + toEmailList);
                String emailSubject = "Received a Request!";
                String emailBody = "A student request join the Focus Club.";
                new SendMailTask(Focus.this).execute(fromEmail,
                        fromPassword, toEmailList, emailSubject, emailBody);
                BCLUB();
            }
        });
    }

    private void BCLUB()
    {
        new AlertDialog.Builder(context)
                .setTitle("Success!")
                .setMessage("You have successfully Send the Request for join the Focus Club !")
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
