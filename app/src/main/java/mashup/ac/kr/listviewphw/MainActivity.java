package mashup.ac.kr.listviewphw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] name = {"양소현", "유슬기", "김정민", "김동희"};
    String[] phone = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555"};

    ListView listView;
    ListViewAdapter adaptor;

    EditText etName;
    EditText etPhone;

    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        etName = (EditText) findViewById(R.id.editText_name);
        etPhone = (EditText) findViewById(R.id.editText_phone);
        btnAdd = (Button) findViewById(R.id.button);

        adaptor = new ListViewAdapter(this);

        adaptor.addItem(new ListItem(name[0], phone[0]));
        adaptor.addItem(new ListItem(name[1], phone[1]));
        adaptor.addItem(new ListItem(name[2], phone[2]));
        adaptor.addItem(new ListItem(name[3], phone[3]));

        listView.setAdapter(adaptor);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String phone = etPhone.getText().toString();

                ListItem listItem = new ListItem(name, phone);

                adaptor.addItem(listItem);
            }
        });
    }
}

