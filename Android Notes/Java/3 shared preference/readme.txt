-> used for save small data persistently
-> key - value pair
-> example - saving user name and password 
-> save high score and restore when user play the game again
-> can have multiples sets of application preferences
-> preferences can be stored at the activity or application level
-> application level preferences are available across all activities
-> activity preferences ( private preferences ) only within the specific Activity class and are not shared with other activities (MODE_PRIVATE)

-> 1 Retrieve an instance of a SharedPreferences object
-> 2 Create a SharedPreferences.Editor to modify preference content
-> 3 Make changes to the preference using the Editor
-> 4 commit()

// getSharedPreferences() - multiple shared preferences identified by name
SharedPreferences preference = this.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
// getPreferences() - if you need to use only one shared preference file for the actvity
SharedPreferences preference = this.getPreferences(Context.MODE_PRIVATE);

-> naming perferences files
-> should used uniquely identifiable to your app, likes "org.mars.mars.PREFERENCE_FILE_KEY"

-> preferences are stored as XML files
-> /data/data/<package name>/shared_prefs/<preference_name>.xml
<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<map>
    <string name="test_pref">Testing Preference</string>
    <string name="user_name">Mighty Mike</string>
    <string name="user_password">admin12345</string>
    <int name="high_score">1001</int>
</map>

-> putBoolean(), putFloat(), putInt(), putLong(), putString(), etc
-> remove() to remove a preference
-> clear() to remove all preferences
-> lastly, use commit() to save preferences

-> example usage of store user name and user password
import android.content.SharedPreferences;

EditText userName = findViewById(R.id.edt_user_name);
EditText userPassword = findViewById(R.id.edt_user_password);
String name = userName.getText().toString();
String password = userPassword.getText().toString();
SharedPreferences settings = getSharedPreferences("UserPreferences", Context.MODE_PRIVATE);
SharedPreferences.Ediot editor = settings.edit();
editor.putString("user_name", name);
editor.putString("user_password", password);
editor.commit();

-> don't need Editor object to read preferences
-> retrieve the SharedPreferences object and used appropriate method
-> when retrieved value, you needed default value as param(incase if the value is empty)
-> getBoolean(), getFloat(), getInt(), getLong(), getString(), etc

-> example
import android.content.SharedPreferences;

SharedPreferences prefs = getSharedPreferences("UserPreferences", Context.MODE_PRIVATE);
// also work, coz we only need one
// SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
String password = prefs.getString()


-> contains() to check the preferences by name
-> getAll() to iterate all preferences
-> registerOnSharedPreferenceChangeListener()
-> unregisterOnSharedPreferenceChangeListener()
-> avoid MODE_WORLD_READABLE, MODE_WORLD_WRITEABLE
(any app that knows your file identifier can access your data)