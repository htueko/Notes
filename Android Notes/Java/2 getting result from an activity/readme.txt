-> getting result from activity is same as passing data between activity
-> used startActivityForResult() instead of startActivity()
-> needed requestCode (int type) 
-> received result from another activity with onActivityResult() callback

-> just used "extras" here but also can used Bundle object, also Parcelable

-> extras
// first activity
public static final int REQUEST_CODE = 1101; // any integer you desired
EditText name = (EditText) findViewById(R.id.edt_name);
EditText password = (EditText) findViewById(R.id.edt_password);
String userName = name.getText().toString();
String userPassword = password.getText().toString();
Intent intent = new Intent(this, SecondActivity.java);
intent.putExtra("name", userName);
intent.putExtra("password", userPassword);
startActivity(intent);

// second activity
// back putton pressed
@Override
public void finish(){
    Intent intent = getIntent();
    intent.putExtra("name", "value, return from second activity");
    setResult(RESULT_OK, intent);
    super.finish();
}

-> then you have to override onActivityResult() method at first activity to received data
@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            if(data.hasExtra("name")){
                String value = data.getExtras().getString("name");
                Toast.makeText(this, value, Toast.LENGTH_LONG).show();
            }
        }
    }