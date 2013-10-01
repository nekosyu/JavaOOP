package level5;

public class WindowsVista extends WindowsXP {

	//ガジェット表示メソッド
	public void showGadget(){
		System.out.println("ガジェットを表示しました");
	}
	//Windows起動メソッド（オーバーライド）
	@Override
	public void start(){
		System.out.println("WindowsVistaを起動しました");
	}
	
	//Windows終了メソッド（オーバーライド）
	@Override
	public void shutdown(){
		System.out.println("WindowsVistaを終了しました");
	}
}
