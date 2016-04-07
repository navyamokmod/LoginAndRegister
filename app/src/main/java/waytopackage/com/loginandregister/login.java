package waytopackage.com.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener {

   Button blogin;
    EditText etUsername, etPassword;
    TextView tvRegisterLink;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername  = (EditText) findViewById(R.id.etUsername);
        etPassword  = (EditText) findViewById(R.id.etPassword);
        blogin = (Button) findViewById(R.id.blogin);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);


        blogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {


        switch(v.getId()) {
            case R.id.blogin:

                break;
            case R.id.tvRegisterLink:
                startActivity(new Intent(this,Register.class));
                break;

        }

    }
}
