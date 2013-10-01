package level5;

public abstract class Windows {

	//フィールド
	protected String user;
	protected String password;

	//Windows起動メソッド
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
	
	//Windows終了メソッド
	public abstract void shutdown();
	
}
