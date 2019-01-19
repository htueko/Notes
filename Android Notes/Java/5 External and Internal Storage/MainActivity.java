

public class MainActivity extends AppCompatActivity{

    public static final int REQUEST_CODE = 1001;

    EditText readView;
    EditText writeView;

    FileOutputStream outputStream;
    FileInputStream inputStream;
    String fileName = "temp.txt";
    File myExternalFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readView = findViewById(R.id.edt_read_text);
        writeView = findViewById(R.id.edt_write_text);
        Button externalRead = findViewById(R.id.btn_ex_read);
        Button externalWrite = findViewById(R.id.btn_ex_write);
        Button externalDelete = findViewById(R.id.btn_ex_delete);
        Button internalRead = findViewById(R.id.btn_in_read);
        Button internalWrite = findViewById(R.id.btn_in_write);
        Button internalDelete = findViewById(R.id.btn_in_delete);

        // if not able to write to external storage, disable the buttons
        if(!isExternalStorageWritable() && isExternalStorageReadable()){
            externalRead.setEnabled(false);
            externalWrite.setEnabled(false);
            externalDelete.setEnabled(false);
        }

        myExternalFile = getDocumentDir("temp.txt");

        internalWrite.setOnClickListener{ internalWrite() }
        internalRead.setOnClickListener{ internalRead() }
        internalDelete.setOnClickListener{ internalDelete() }
        externalWrite.setOnClickListener{
            askedPermissionForExternal();
            externalWrite();
        }
        externalRead.setOnClickListener{ externalRead() }
        externalDelete.setOnClickListener{ externalDelete() }

    }

    // get the public picture directory
    public File getDocumentDir(String name){
        File file = new File(Enviroment.getExternalStoragePublicDirectory(Enviroment.DIRECTORY_DOCUMENTS), name);
        return file;
    }

    // write to internal
    public void internalWrite(){
        String data = writeView.getText().toString();
        try{
            outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
            outputStream.write(data.getBytes());
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // read from internal
    public void internalRead(){
        try{
            InputStream inputStream = this.openFileInput(fileName);
            ReadData(inputStream);
        }catch(java.io.FileNotFoundException e){
            e.printStackTrace();
        }
    }

    // delete from internal
    public void inernalDelete(){
        this.deleteFile("temp.txt");
    }

    // asked permission to write for external
    public void askedPermissionForExternal(){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
        }
    }    

    // write to external
    public void externalWrite(){
        String data = writeView.getText.toString();
        try {
            outputStream = new FileOutputStream(myExternalFile);
            outputStream.write(data.getBytes());
            outputStream.close();
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    // read from external
    public void externalRead(){
        try {
            InputStream inputStream = new FileInputStream(myExternalFile);
            ReadData(inputStream);
        } catch (java.io.FileNotFoundException e) {
            //TODO: handle exception
        }
    }

    // delete from external
    public void externalDelete(){
        myExternalFile.delete();
    }

    // check if external storage is available for read and write
    public boolean isExternalStorageWritable(){
        String state = Enviroment.getExternalStorageState();
        if(Enviroment.MEDIA_MOUNTED.equals(state)){
            return true;
        }
        return false;
    }

    // check if external storage is available to read ( atleast )
    public boolean isExternalStorageReadable(){
        String state = Enviroment.getExternalStorageState();
        if(Enviroment.MEDIA_MOUNTED_READ_ONLY.equals(state)){
            return true;
        }
        return false;
    }

    // read data helper method
    public void ReadData(InputStream inputStream){
        try {
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader buffReader = new BufferedReader(reader);
            String line = new String();
            String allLines = new String();
            // read every single line 
            while((line = buffReader.readLine() != null)){
                allLines += line;
            }
            readView.setText(allLines);
            // close the file 
            inputStream.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Override
    public void onRequestPermissionRequest(int requestCode, String permissions[], int[] grantResults){
        switch(requestCode){
            case REQUEST_CODE: {
                // if request is cancelled, the result arrays are empty.
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    // permission was granted, do the following code
                    // Toast (may be)
                }else{
                    // permission wasn't granted, do the following code
                    // Toast to requests permission or asked permission method here
                }
                return;
            }
        }
    }

}