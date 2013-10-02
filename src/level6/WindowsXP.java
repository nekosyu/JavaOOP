package level6;

public class WindowsXP extends Windows {

	//フィールド（追加）
	protected String remoteUser;
	
	//リモートデスクトップ接続メソッド（追加）
	public void ConnectRemoteDesktop(String inRemoteUser){
		remoteUser = inRemoteUser;
		System.out.println(user + "から" + remoteUser + "にリモートデスクトップ接続しました");
	}
	
	//Windows起動メソッド（オーバーライド）
	@Override
	public void start(){
		System.out.println("WindowsXPを起動しました");
	}
	
	//Windows終了メソッド（オーバーライド）
	@Override
	public void shutdown(){
		System.out.println("WindowsXPを終了しました");
	}
}
