package level1;

public class User {

	public static void main(String[] args) {
		
		//Windowsクラスをインスタンス化
		Windows os = new Windows();

		//Windows起動
		os.start();
		
		//ウインドウを開くメッセージ
		os.open();

		//ウィンドウを閉じるメッセージ
		os.close();
		
		//Windows終了
		os.shutdown();

	}

}
