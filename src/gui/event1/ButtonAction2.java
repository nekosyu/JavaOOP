package gui.event1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction2 implements ActionListener {

	//フィールド（呼び出し元格納）
	private SimpleWindowApp swa;
	
	//コンストラクタ
	public ButtonAction2(SimpleWindowApp inSwa){
		
		//フィールドへ格納
		swa = inSwa;
		
	}
	
	//クリックイベント処理メソッド（オーバーライド）
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//呼び出し元のテキストフィールド内の文字をボタンに表示
		swa.button1.setText(swa.text1.getText());
		
	}
}