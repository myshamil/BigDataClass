
public class DBExecutor {

	static DataBase CreateDatabase(String dbname) {
		DataBase db = null;
		
		switch(dbname) {
		case "MySql":
			db = new MySql();
			break;
		
		case "Oracle":
			db = new Oracle();
			break;
		
		}
		return db;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DataBase db = CreateDatabase("MySql");
		 db.open();
		MySql s = new MySql();
		
		 DataBase db2 = CreateDatabase("Oracle");
		 db2.open();
	}

}
