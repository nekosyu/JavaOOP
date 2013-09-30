package level4;

public class User {

	public static void main(String[] args) {
		
		//クラスのインスタンス化
		Windows[] aryWindows ={ new Windows(),
													new Windows(),
													new WindowsXP(),
													new WindowsXP(),
													new WindowsXP(),
													new WindowsXP(),
													new WindowsVista(),
													new WindowsVista(),
													new WindowsVista(),
													new WindowsServer()
		};
		
		//Windowsの起動
		for( int i = 0; i < 10 ; i++ ){
			aryWindows[i].start();
		}
	}
}
