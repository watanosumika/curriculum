/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = {3, 1, 2, 7, 5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){ //data配列の要素数分回す
            System.out.print(data[i] + " ");//配列dataの値を出力
        }
        System.out.println();//改行
        
        for (int i = 0; i < data.length; i++) {//変数iに0を代入し初期化、変数iを配列dataの要素数分(data.length)＋１(i++)しながら回す
            for (int j = data.length -1; j > i; j--) {//変数jに配列dataの要素数分-1を代入し初期化、変数jを配列dataの要素数分(data.length)から−1しながら回す
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[i] > data[j]){  //もしdata配列の変数iの値がdata配列jより大きい場合
                  int box = data[i];  //int型boxにdata配列iの数値を代入
                  data[i] = data[j]  //iの場所にjの数値を代入
                  data[j] = box;  //jの場所にboxの数値を代入
                }
            }
        }
        for(int i = 0; i < data.length; i++){//data配列の要素数分回す
            System.out.print(data[i] + " "); //data配列の値を出力
        }
    }
}