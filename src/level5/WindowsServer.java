package level5;

public class WindowsServer extends Windows {
	
	//ガジェット表示メソッド
	public void startWebServer(){
		System.out.println("Webサーバを起動しました");
	}
	
	//Windows起動メソッド（オーバーライド）
	@Override
	public void start(){
		System.out.println("WindowsServerを起動しました");
	}
	
	//Windows終了メソッド（オーバーライド）
	@Override
	public void shutdown(){
		System.out.println("WindowsServerを終了しました");
	}
	
}
