package level1;

public class Windows {

	//フィールド
	protected String user;

	//Windows起動メソッド
	public void start(){
		System.out.println("Windowsを起動しました");
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
		System.out.println("Windowsを起動しました");
	}
}
