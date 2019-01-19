-> 2 file storage, internal and external
-> internal storage = built in non volatile memory
-> external storage = remobable storage medium
-> even some android devices don't have external storage option,
internal and external partitions still exist
-> internal storage always available
-> remove all your data of your app when uninstall
-> no permission required to read and write for internal storage
-> getFilesDir() return file directory
-> getCacheDir() return the temporary cache files

File file = new File(context.getFilesDir(), filename);

-> alternatively, can call openFileOutput() to get FileOutputStream to write
to a file
-> openFileInput() to get a FileInputStream to read from a file

String fileName = "aFile";
String words = "Hi there, have a nice day";
FileOutputStream outputStream;
try{
    outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
    outputStream.write(words.getBytes());
    outputStream.close();
}catch(Exception e){
    e.printStackTrace();
}

-> to create cache files, used createTempFile()

public File getTempFile(Context context, String url){
    File file;
    try{
        String fileName = Uri.parse(url).getLastPathSegment();
        file = File.createTempFile(fileName, null, context.getCacheDir());
    }catch(IOException e){
        e.printStackTrace();
    }
    return file;
}

-> Context.openFileInput() open file for read
-> Context.openFileOutput() creates or open file for writing
-> Context.deleteFile() deletes file by name
-> Context.fileList() gets a list of all file 
-> Context.getFileDir() retrieves the application files subdirectory object
-> Context.getCacheDir() retrieves the application cache subdirectory object
-> Context.getDir() creates or retrieves application subdirectory name


-> External Storage not always available ( user might be remove sometime)
-> world_readable, you can't control your file, any app can read it
-> when install the app the system will remove your app data only if you used
getExternalFilesDir() method
-> must request the WRITE_EXTERNAL_STORAGE permission in your manifest
-> WRITE_EXTERNAL_STORAGE means you can read too 
-> READ_EXTERNAL_STORAGE permission ( declare too for future safe)
-> getExternalStorageState() if return state equal to MEDIA_MOUNTED, you can
read and write

// check is external storage writable
public boolean isWritable(){
    String state = Enviroment.getExternalStorageState();
    if(Enviroment.MEDIA_MOUNTED.equals(state)){
        return true;
    }
    return false;
}

// check is external storage readable
public boolean isReadable(){
    String state = Enviroment.getExternalStorageState();
    if(Enviroment.MEDIA_MOUNTED.equals(state) || Enviroment.MEDIA_MOUNTED_READ_ONLY.equals(state)){
        return true;
    }
    return false;
}

// get the pictures directory (public)
public File getAlbumStorageDir(String albumName){
    File file = new File(Enviroment.getExternalStoragePublicDirectory(Enviroment.DIRECTORY_PICTURES), albumName);
    if(!file.mkdir()){
        Log.e(TAG, "directory not created");
    }
    return file;
}

// get the pictures directory (private)
public File getAlubmStorageDir(Context context, String albumName){
    File file = new File(context.getExternalFilesDir(Enviroment.DIRECTORY_PICTURES), albumName);
    if(!file.mkdir()){}
    Log.e(TAG, "directory not created");
}
return file;

