package level1;

public class User {

	public static void main(String[] args) {
		
		//Windowsクラスをインスタンス化
		Windows os = new Windows();

		//Windows起動
		os.start();
		
		//ログイン（ユーザ名/パスワードなし）
		os.login();
		
		//ログイン（ユーザ名あり/パスワードなし）
		os.login("Taro");
		
		//ログイン（ユーザ名/パスワードあり）
		os.login("Taro", "kumamoto");
		
		//ウインドウを開くメッセージ
		os.open();

		//ウィンドウを閉じるメッセージ
		os.close();
		
		//Windows終了
		os.shutdown();

	}

}
