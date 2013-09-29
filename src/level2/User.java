package level2;

public class User {

	public static void main(String[] args) {
		
		//WindowsXPクラスをインスタンス化
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
		
		//WindowsXP終了
		os.shutdown();

	}

}
