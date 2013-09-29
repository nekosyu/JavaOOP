package level1;

public class Windows {

	//フィールド
	private String user;
	private String password;

	//Windows起動メソッド
	public void start(){
		System.out.println("Windowsを起動しました");
	}
	
	//ログインメソッド（ユーザ名/パスワードなし）
	public void login(){
		System.out.println("ユーザ名とパスワードを入力してください");
	}
	
	//ログインメソッド（ユーザ名あり/パスワードなし）
	public void login(String inUser){
		user = inUser;
		System.out.println(user + "：パスワードを入力してください");
	}
	
	//ログインメソッド（ユーザ名/パスワードあり）
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
