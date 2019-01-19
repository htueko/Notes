-> save and restore state of the activity is very important
-> savedInstanceState is a Bundle object that restore the previous state of the activity and
worked as key - value pair
-> View states are automatically collected and restored back ( you don't need to do that)
eg scroll bar postion, text value from the edit text
-> android os used android:id attributes to restore state of the widgets,
so by default you should provide id to every widget
-> you can disable auto saved property of widget at Manifest with android:saveEnabled=false (you don't want to do this)
-> save at onSaveInstanceState and restore at onRestoredInstanceState
-> you can also restore at onCreate but onCreate called only once at activity lifecycle. so use onRestoreInstanceState

-> saving state 
public static final String SCORE = "PlayerScore";
public static final String LEVEL = "PlayerLevel";

@Override
public void onSaveInstanceState(Bundle savedInstanceState){
    // save the user's current game state
    savedInstanceState.putInt(SCORE, mCurrentScore);
    savedInstanceState.putInt(LEVEL, mCurrentLevel);
    // always call super class, so it can save the view hierarchy state
    super.onSaveInstanceState(savedInstanceState);
}

-> restoring state
@Override
public void onRestoreInstanceState(Bundle savedInstanceState){
    // always call super class, so it can restore the view hierarchy state
    super.onRestoreInstanceState(savedInstanceState);
    // restore the user current game state
    mCurrentScore = savedInstanceState.getInt(SCORE);
    mCurrentLevel = savedInstanceState.getInt(LEVEL);
}