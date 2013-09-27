package level2;

public class WindowsXP extends Windows {

	//フィールド（追加）
	protected String remoteUser;
	
	//リモートデスクトップ接続メソッド（追加）
	public void remoteDesktop(String inRemoteUser){
		remoteUser = inRemoteUser;
		System.out.println(user + "から" + remoteUser + "にリモートデスクトップ接続しました");
	}
	
	//Windows起動メソッド（オーバーライド）
	public void start(){
		System.out.println("WindowsXPを起動しました");
	}
	
	//Windows終了メソッド（オーバーライド）
	public void shutdown(){
		System.out.println("WindowsXPを終了しました");
	}
}
