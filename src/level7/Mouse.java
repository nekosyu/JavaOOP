package level7;

public class Mouse implements USB {

	//マウス接続メソッド（オーバーライド）
	@Override
	public void connect() {
		System.out.println("マウスをUSBで接続しました");
	}

}
