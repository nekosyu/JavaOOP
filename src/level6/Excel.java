package level6;

public class Excel implements Software {

	//インストールメソッド（オーバーライド）
	@Override
	public void install() {
		System.out.println("Excelをインストールします");
	}

	//アンインストールメソッド（オーバーライド）
	@Override
	public void uninstall() {
		System.out.println("Excelをアンインストールします");
	}

}
