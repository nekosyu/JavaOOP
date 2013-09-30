package level4;

public class Windows {

	//フィールド
	protected String user;
	protected String password;

	//Windows起動メソッド
	public void start(){
		System.out.println("Windowsを起動しました");
	}
	
	//ログインメソッド
	public void login(String inUser, String inPassword){
		user = inUser;
		password = inPassword;
		System.out.println(user + "がログインしました");
	}
	
	//ウィンドウ表示メソッド
	public void open(){
		System.out.println(user + "がウィンドウを表示しました");
	}

	//ウィンドウを閉じるメソッド
	public void close(){
		System.out.println(user + "がウィンドウを閉じました");
	}
	
	//Windows終了メソッド
	public void shutdown(){
		System.out.println("Windowsを終了しました");
	}
}
