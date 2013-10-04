package level6;

public abstract class Windows implements Software {

	//フィールド
	protected String user;
	protected String password;

	//Windows起動メソッド（抽象メソッド）
	public abstract void start();
	
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
	
	//Windows終了メソッド（抽象メソッド）
	public abstract void shutdown();
	
}
