package gui.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleWindowFlowApp extends JFrame{

	//フィールド（画面上の部品格納）
	private JLabel label1;
	private JButton button1;
	private JTextField text1;
	
	//コンストラクタ
	public SimpleWindowFlowApp(){

		//画面サイズ設定
		this.setSize( 300 , 200 );
		
		//レイアウトマネージャをFlowLayoutへ変更
		this.setLayout(new FlowLayout());
		
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
		
		//画面を表示
		this.setVisible(true);
	}
	
	//メインメソッド
	public static void main(String[] args) {
		
		//インスタンス化（コンストラクタ実行）
		new SimpleWindowFlowApp();

	}
}