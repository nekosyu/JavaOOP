package level7;

public class MicrowaveOven implements Power {

	//電子レンジ給電メソッド（オーバーライド）
	@Override
	public void charge() {
		System.out.println("電子レンジをコンセントで給電しました");
	}

}
