import java.util.Scanner;

public class BmiCalc {
/* BMI(体格指数)を計算するプログラム
 * BMI = 体重 / (身長 * 身長)
 * 体重 kg,身長 cm
 */

	public static void main(String[] args) {
		double weight,height,bmi;
		//体重
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は?(kg) : ");
		weight = stdIn.nextDouble();
		//身長
		System.out.println("身長は?(cm) : ");
		height = stdIn.nextDouble();
		//mに単位変換
		height /= 100;
		//bmi計算
		bmi = weight / (height * height);
		
		System.out.println("あなたのBMIは、" + bmi + "です。");
		//条件分岐で肥満度を表示
		if (bmi < 18.5) {
			System.out.println("やせ型です");
		} else if (bmi < 25){
			System.out.println("標準です");
		} else {
			System.out.println("肥満です");
		}
	}
}
