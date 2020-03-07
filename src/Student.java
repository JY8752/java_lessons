
public class Student {
	//フィールドの宣言
	String name;
	int score;
	static final int MAX_SCORE = 100;
	//メソッドの宣言
	void printScore() {
		System.out.println(name + "さんは" + MAX_SCORE + "点満点中" + score + "点です。");
	}
}
//サンプルクラスでインスタンスを作り実行
class StudentSample {
	public static void main(String... args) {
		Student murata = new Student();
		murata.name = "村田";
		murata.score = 80;
		murata.printScore();
		
		Student okada = new Student();
		okada.name = "岡田";
		okada.score = 70;
		okada.printScore();
	}
}
