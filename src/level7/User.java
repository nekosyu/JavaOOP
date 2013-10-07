package level7;

public class User {

	public static void main(String[] args) {
		
		//家電グループ
		USB[] HomeElectronics = {new Mouse(), new Fan()};
		
		//パソコン周辺機器グループ
		Power[] PCAccessory = {new MicrowaveOven(), new Fan()};
		
		for(int i = 0; i < 2; i++){
			//家電コンセント接続
			HomeElectronics[i].connect();
			
			//周辺機器USB接続
			PCAccessory[i].charge();
			
		}

	}

}
