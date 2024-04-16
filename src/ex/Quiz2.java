package ex;

import java.util.Scanner;


public class Quiz2 {

	public static void main(String[] args) {

		System.out.println("드라이브 선택.");
		System.out.println("1 : Mysql ");
		System.out.println("2 : oracle ");
		System.out.println("3 :postgres ");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); 
		DBDriver dbDriver = null;

		if (num == 1) {
			dbDriver = new MySqlBDriver();

		} else if (num == 2) {
			dbDriver = new OracleDBDriver();
			
		} else if (num == 3) {
			dbDriver = new PostgresDBDriver();
			
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}

		if (dbDriver != null) {
			dbDriver.dbConnect(); 
		}

	}

}


interface DBDriver {

	public void dbConnect();

}

class MySqlBDriver implements DBDriver {

	@Override
	public void dbConnect() { 
		System.out.println("Mysql DB에 연결합니다.");
	}

}

class OracleDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("oracle DB에 연결합니다.");
	}

}

class PostgresDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("Postgres DB에 연결합니다.");
	}

}
