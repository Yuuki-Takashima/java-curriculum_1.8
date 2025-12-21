package curriculum_A;

public class Qes1_13 {

    public static void main(String[] args) {

        /*-------------------------------------------------------------------------------
        《問1》 
        ［概要］ ローカル変数の宣言処理
        -------------------------------------------------------------------------------*/
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        String str;
        boolean bool;

        /*-------------------------------------------------------------------------------
        《問2》 
        ［概要］ ローカル変数の初期化処理
        ［詳細］ 問1の変数に初期値を代入し初期化する
        -------------------------------------------------------------------------------*/
        b = 0;
        s = 0;
        i = 0;
        l = 0L;
        f = 0.0f;
        d = 0.0;
        c = '\u0000';
        str = null;
        bool = false;

        /*-------------------------------------------------------------------------------
        《問3》 
        ［概要］ ローカル変数の代入処理
        ［詳細］ 問2の変数に指定された値を代入する
        -------------------------------------------------------------------------------*/
        b   = 10;
        s   = 100;
        i   = 1000;
        l   = 10000L;
        f   = 9.5f;
        d   = 10.5;
        c   = 'a';
        str = "ハロー";
        bool= true;

        /*-------------------------------------------------------------------------------
        《問4》 
        ［概要］ 演算結果出力処理
        ［詳細］ 問3で作成した変数を使用して出力する
        -------------------------------------------------------------------------------*/
        long sumIntOnly = (long)b + s + i + l;
        System.out.println(sumIntOnly);

        int twenty = b + b;
        System.out.println(twenty);

        String triple = c + " " + str + " " + bool;
        System.out.println(triple);

        long sum11130 = sumIntOnly + twenty;
        System.out.println(sum11130);

        long mulIntOnly = 1L * b * s * i * l;
        System.out.println(mulIntOnly);

        double div = d / s;
        System.out.println(div);

        int sub = b - s;
        System.out.println(sub);
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問5》 
        ［概要］ 文字列数値を整数に変換、加算結果の出力処理
        ［詳細］ 「ハローJAVA43」と表示する
        -------------------------------------------------------------------------------*/
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問6》 
        ［概要］ 人物情報の代入・出力処理
        ［詳細］ 指定フォーマットで自己紹介文を出力する
        -------------------------------------------------------------------------------*/
        String name = "山田太郎";
        int age2 = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age2 + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問7》 
        ［概要］ BMI算出処理
        ［詳細］ 問6の身長・体重の変数を用いてBMIを計算する（数値直書きなし）
        -------------------------------------------------------------------------------*/
        double heightMeter = height / s;
        double bmi = weight / (heightMeter * heightMeter);
        System.out.printf("BMIは%.2fです%n", bmi);
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問8》 
        ［概要］ 人物情報の再代入・出力処理
        ［詳細］ 問6の変数に再代入を行い、新しい人物情報を出力する
        -------------------------------------------------------------------------------*/
        name = "鈴木一郎";
        age2 = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age2 + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        heightMeter = height / s;
        bmi = weight / (heightMeter * heightMeter);
        System.out.printf("BMIは%.1fです%n", bmi);
        System.out.println();
        int age8 = age2;
        double height8 = height;
        double weight8 = weight;

        /*-------------------------------------------------------------------------------
        《問9》 
        ［概要］ 自己代入演算処理
        ［詳細］ 問8で使用した数値を和算で自己代入し、出力する
        -------------------------------------------------------------------------------*/
        age2 += age2;
        height += height;
        weight += weight;
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age2 + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        heightMeter = height / s;
        bmi = weight / (heightMeter * heightMeter);
        System.out.printf("BMIは%.2fです%n", bmi);
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問10》 
        ［概要］ 条件判定結果出力処理
        ［詳細］ 問8の年齢が25歳以上ならtrueを出力する（if文不使用）
        -------------------------------------------------------------------------------*/
        System.out.println(age8 >= 25);
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問11》 
        ［概要］ 数値を文字列型に変換して連結出力処理
        ［詳細］ 問8で使用した年齢・身長・体重を文字列型に変換し繋げて出力する
        -------------------------------------------------------------------------------*/
        String ageStr = String.valueOf(age8);
        String heightStr = String.valueOf(height8);
        String weightStr = String.valueOf(weight8);
        System.out.println(ageStr + heightStr + weightStr);
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問12》 
        ［概要］ 文字列を整数型に再変換出力処理
        ［詳細］ 問11で変換した年齢・身長を整数型に変換して出力する
        -------------------------------------------------------------------------------*/
        int ageIntFromStr = Integer.parseInt(ageStr);
        int heightIntFromStr = (int) Double.parseDouble(heightStr);
        System.out.println(ageIntFromStr);
        System.out.println(heightIntFromStr);
        System.out.println();

        /*-------------------------------------------------------------------------------
        《問13》 
        ［概要］ 複数条件判定処理
        ［詳細］ 年齢が25もしくは身長が160以上であればtrueを出力する（if文不使用）
        -------------------------------------------------------------------------------*/
        System.out.println(ageIntFromStr >= 25 || heightIntFromStr >= 160);
    }
}
