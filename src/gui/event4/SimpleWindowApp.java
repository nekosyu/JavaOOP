package gui.event4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleWindowApp extends JFrame{

	//フィールド（画面上の部品格納）
	private JLabel label1;
	private JButton button1;
	private JTextField text1;
	
	//コンストラクタ
	public SimpleWindowApp(){

		//画面サイズ設定
		this.setSize( 300 , 200 );
		
		//テキストフィールドインスタンス作成
		text1 = new JTextField("入力してください");
		//テキストフィールドインスタンスを上部に配置
		this.add(text1, BorderLayout.NORTH);
		
		//ラベルインスタンス作成
		label1 = new JLabel("こんにちは");
		//ラベルインスタンスを中央に配置
		this.add(label1, BorderLayout.CENTER);
		
		//ボタンインスタンス作成
		button1 = new JButton("送信");
		//ボタンインスタンスを下部に配置
		this.add(button1, BorderLayout.SOUTH);
		
		//ボタンにイベントリスナーを設定
		button1.addActionListener(
			//（ActionListenerを実装した無名クラスを作成）
			new ActionListener(){
			
				//クリックイベント処理メソッド（オーバーライド）
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//呼び出し元のテキストフィールド内の文字をラベルに表示
					label1.setText(text1.getText());
					
				}
			}
		);
		
		//画面を表示
		this.setVisible(true);
	}
	
	//メインメソッド
	public static void main(String[] args) {
		
		//インスタンス化（コンストラクタ実行）
		new SimpleWindowApp();

	}
	
}