package gui.event1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {

	//フィールド（呼び出し元格納）
	private SimpleWindowApp swa;
	
	//コンストラクタ
	public ButtonAction(SimpleWindowApp inSwa){
		
		//フィールドへ格納
		swa = inSwa;
		
	}
	
	//クリックイベント処理メソッド（オーバーライド）
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//呼び出し元のテキストフィールド内の文字をラベルに表示
		swa.label1.setText(swa.text1.getText());
		
	}
}