package level7;

public class Fan implements Power, USB {

	//扇風機USB接続メソッド（オーバーライド）
	@Override
	public void connect() {
		System.out.println("扇風機をUSBで接続しました");
	}

	//扇風機給電メソッド（オーバーライド）
	@Override
	public void charge() {
		System.out.println("扇風機をコンセントで給電しました");
	}

}
