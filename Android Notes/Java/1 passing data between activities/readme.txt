-> there 4 ways to achieved that
-> but don't used static class (not a good practice)
-> used Intent
-> 1 using "extras"
-> 2 using "Bundle object"
-> 3 using "Parcelable" passing an object by serializing

-> method 1
-> putExtra() and getExtra()
-> not for objects

// first activity
EditText name = (EditText) findViewById(R.id.edt_name);
EditText password = (EditText) findViewById(R.id.edt_password);
Intent intent = new Intent(FirstAcivity.this, SecondActivity.class);
intent.putExtra("name", name.getText().toString());
intent.putExtra("password", password.getText().toString());
startActivity(intent);

// second activity
Intent intent = getIntent();
String name = intent.getStringExtra("name");
String password = intent.getStringExtra("password");
// do whatever you want with these two string;
// not only for String, but also works for other types.

-> method 2
-> Bundle

// first activity
EditText name = (EditText) findViewById(R.id.edt_name);
EditText password = (EditText) findViewById(R.id.edt_password);
Intent intent = new Intent(FirstAcivity.this, SecondActivity.class);
Bundle bundle = new Bundle();
bundle.putExtra("name", name.getText().toString());
bundle.putExtra("password", password.getText().toString());
intent.putExtra("person_db", bundle);
startActivity(intent);

// second activity
Intent intent = getIntent();
Bundle bundle = intent.getBundleExtra("person_db");
String name = bundle.getString("name");
String password = bundle.getString("password");
// do whatever you want with these two string;
// not only for String, but also works for other types.

-> method 3
-> Parcelable interface (efficient and fast)

-> implement parcelable interface
-> implement writeToParcel() and describeContent() method
-> needed static final field Percelable.Creator

// our person class
public class Person implements Parcelable{
    
    private String name;
    private String password;

    public Person(){
        // empty constructor
        // when you overload constructor you no longer have the default constructor
        // so we build this constructor.
    }

    public Person(Parcel parcel){
        // deserialiing 
        // have to be in order as serialized
        name = parcel.readString();
        password = parcel.readString();
    }

    @Override
    public int describeContent(){
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        // serializing 
        dest.writeString(name); 
        dest.writeString(passwrod);
    }

    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>(){
        
        @Override
        public Person createFromParcel(Parcel parcel){
            return new Person(parcel);
        }

        @Override
        public Person[] newArray(int size){
            return new Person[size];
        }

    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

}

// first activity
public class MainActivity extends AppCompatActivity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        EditText name = (EditText) findViewById(R.id.edt_name);
        EditText password = (EditText) findViewById(R.id.edt_password);
        Intent intent = new Intent(this, SecondActivity.class);
        Person person = new Person();
        person.setName(name.getText().toString());
        person.setPassword(password.getText().toString());
        intent.putExtra("person", person);
        startActivity(intent);
        
    }

}

// second activity
public class SecondActivity extends AppCompatActivity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtra();
        Person person = (Person) bundle.getPercelable("person");
        String name = person.getName();
        String password = person.getPassword();
        // do whatever you want with these two string;
        // not only for String, but also works for other types.
    }

}
