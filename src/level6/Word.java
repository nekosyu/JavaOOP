package level6;

public class Word implements Software {

	//インストールメソッド（オーバーライド）
	@Override
	public void install() {
		System.out.println("Wordをインストールします");
	}

	//アンインストールメソッド（オーバーライド）
	@Override
	public void uninstall() {
		System.out.println("Wordをアンインストールします");
	}

}
