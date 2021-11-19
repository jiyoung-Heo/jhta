package day09.db;

public class MySqlDBMS implements MyDBMS {

	public void connect(String id, String pwd) {
		System.out.println("접속계정: " + id + " 비밀번호: " + pwd);
		System.out.println("위의 정보로 MYSQL에 접속함");
	}

	public void disconnect() {
		System.out.println("MYSQL dbms와 접속해제");
	}

	public void select(String user) {
		System.out.println("MYSQL sql구문을 사용해서" + user + "회원정보 조회");
	}

	public void update(String user) {
		System.out.println("MYSQL sql구문을 사용해서" + user + "회원정보 수정");
	}

	public void delete(String user) {
		System.out.println("MYSQL sql구문을 사용해서" + user + "회원정보 삭제");
	}

	public void insert(String user) {
		System.out.println("MYSQL sql구문을 사용해서" + user + "회원정보 등록");
	}

}
