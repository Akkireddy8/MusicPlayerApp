import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private EditText username, email, password, retypePassword;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.username_signup);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password_signup);
        retypePassword = findViewById(R.id.retype_password);
        signUpButton = findViewById(R.id.signup_button);

        signUpButton.setOnClickListener(v -> {
            // Logic for sign-up
        });

        findViewById(R.id.login_prompt).setOnClickListener(v -> {
            // Go to Login Activity
            startActivity(new Intent(SignupActivity.this, LoginActivity.class));
        });
    }
}
