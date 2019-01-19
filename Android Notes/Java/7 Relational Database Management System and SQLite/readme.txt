-> android.database.sqlite package
-> all database are private
-> used content provider if you want to share your app's database
-> used SQLiteOpenHelper class, is a abstract class
-> subclass the SQLiteOpenHelper class and override onCreate(), to execute
SQLite command.

-> example
public class MyDatabase extends SQLiteOpenHelper{
    
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "MyTable";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + KEY_WORD + " TEXT, " + KEY_DEFINITION + " TEXT);";

    public MyDatabase(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_TABLE);
    }

}

-> reading and writing from a database
-> implement an instance of SQLiteOpenHelper using the constructor
-> getWritableDatabase() to write,  return SQLiteDatabase object
-> getReadableDatabase() to read, return SQLiteDatabase object
-> to execute SQLite queries use query()
-> execSQL() to execute an SQL statement directly
-> use SQLiteQueryBuilder for complex queries
-> every SQLite query return a Cursor


-> CRUD (Create, Read, Update, Delete)
-> Create Table
-> used CREATE TABLE to creat a table, followed by the table's name
Syntax:
CREATE TABLE name_of_the_table(column1 type, PRIMARY KEY(one or more columns), column2 type, ......);

public class DatabaseHelper extends SQLiteOpenHelper{

    // table name
    public static final String TABLE_NAME = "EMPLOYEES"; 
    // columns
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String AGE = "age";
    public static final String ADDRESS = "address";
    public static final String SALARY = "salary";
    // information
    public static final String DB_NAME = "Employees.db";
    // database version
    public static final int DB_VERSION = 1;

    private SQLiteDatabse database;

    public DatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    // creating table query
    private static final String CREATE_TABLE = "CREATE_TABLE " + "TABLE_NAME + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " " NAME + " TEXT NOT NULL, " + AGE + " INTEGER NOT NULL, " + ADDRESS + " CHAR(40)," + SALARY + " REAL);";

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVerion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

}


-> Query
-> SELECT statement is used to fetch data from SQLite database
Syntax:
SELECT column1 FROM TABLE_NAME; // select column1 from TABLE_NAME
SELECT * FROM TABLE_NAME; // select everything from TABLE_NAME

SELECT * FROM EMPLOYEES;
SELECT NAME, SALARY FROM EMPLOYEES;

-> use WHERE for filter
-> WHERE can used in UPDATE, DELETE statement too
Syntax:
SELECT column1, column2 FROM TABLE_NAME WHERE [condition]

-> condition = Comparison or Logical Operators (>, <, =, LIKE, NOT, etc...)

SELECT * FROM EMPLOYEES WHERE AGE >= 20 AND SALARY <= 24000;
SELECT * FROM EMPLOYEES WHERE AGE IS NOT NULL;
SELECT * FROM EMPLOYEES WHERE NAME LIKE 'Sm%';
SELECT * FROM EMPLOYEES WHERE AGE BETWEEN 25 AND 30;
SELECT * FROM EMPLOYEES WHERE AGE > (SELECT AGE FROM EMPLOYEES WHERE SALARY > 20000);

-> .databases // list names and files of database
-> .help // help 
-> .schema table_name // shows the create statements for tables
-> .show // shows the current values for various settings
-> .tables // lists names of tables
-> .quit // exits 


-> Inserting 
-> INSERT INTO
Syntax:
INSERT INTO TABLE_NAME [(column1, column2, column3, .......)]
VALUES (value1, value2, value3, .......);

// alternative way
INSERT INTO TABLE_NAME VALUES (value1, value2, value3, .......);

INSERT INTO EMPLOYEES ()