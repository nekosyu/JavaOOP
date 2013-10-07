package level6;

public class User {

	public static void main(String[] args) {
		
		//ラックにソフトウェア格納
		Software[] rack = {new WindowsXP(), new Word(), new Excel()};
		
		for(int i = 0; i < rack.length; i++ ){
			//ソフトウェアのインストール
			rack[i].install();
		}

	}
}
