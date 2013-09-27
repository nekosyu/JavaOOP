package level2;

public class User {

	public static void main(String[] args) {
		
		//Windowsクラスをインスタンス化
		WindowsXP os = new WindowsXP();

		//Windows起動
		os.start();
		
		//ログイン（ユーザ名/パスワードあり）
		os.login("Taro", "kumamoto");
		
		//ウインドウを開くメッセージ
		os.open();

		//ウィンドウを閉じるメッセージ
		os.close();
		
		//リモートデスクトップ接続
		os.remoteDesktop("hanako");
		
		//Windows終了
		os.shutdown();

	}

}
