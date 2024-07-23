import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String message = ""; // 肥満度を表示するメッセージ

        System.out.println("BMIを計算して肥満度を表示します。");

        System.out.println("1人目の身長を『m』で入力してください(150cmなら1.5と入力してください)");
        double height = sc.nextDouble();
        System.out.println("体重を『Kg』で入力してください(42.5kgなら42.5と入力してください)");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            message = "やせ型";
        } else if(bmi >= 18.5 && bmi < 25) {
            message = "標準体系";
        } else if( bmi >= 25 && bmi < 30){
            message = "肥満1度";
        } else if(bmi >= 30 && bmi < 35 ){
            message = "肥満2度";
        } else if (bmi >= 35 && bmi < 40 ){
            message = "肥満3度";
        } else if (bmi >= 40 ) {
            message = "肥満4度";
        }

        System.out.println("------------------------------------");
        System.out.println("あなたのBMIは" + bmi + "です。");
        System.out.println("診断結果:" + message);
        System.out.println("------------------------------------");

        System.out.println("身長を『m』で入力してください(150cmなら1.5と入力してください)");
        double height2 = sc.nextDouble();
        System.out.println("体重を『Kg』で入力してください(42.5kgなら42.5と入力してください)");
        double weight2 = sc.nextDouble();

        double bmi2 = weight2 / (height2 * height);

        if (bmi2 < 18.5) {
            message = "やせ型";
        } else if(bmi2 >= 18.5 && bmi2 < 25) {
            message = "標準体系";
        } else if( bmi2 >= 25 && bmi2 < 30){
            message = "肥満1度";
        } else if(bmi2 >= 30 && bmi2 < 35 ){
            message = "肥満2度";
        } else if (bmi2 >= 35 && bmi2 < 40 ){
            message = "肥満3度";
        } else if (bmi2 >= 40 ) {
            message = "肥満4度";
        }

        System.out.println("------------------------------------");
        System.out.println("あなたのBMIは" + bmi2 + "です。");
        System.out.println("診断結果:" + message);
        System.out.println("------------------------------------");
    }
}

