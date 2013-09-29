package level2;

public class WindowsXP extends Windows {

	//フィールド（追加）
	protected String remoteUser;
	
	//リモートデスクトップ接続メソッド（追加）
	public void connectRemoteDesktop(String inRemoteUser){
		remoteUser = inRemoteUser;
		System.out.println(user + "から" + remoteUser + "にリモートデスクトップ接続しました");
	}
	
}
