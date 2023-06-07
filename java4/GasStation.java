package java4;
import java.util.Scanner;

public class GasStation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        // N個のキューを準備
        Queue[] que = new Queue[N];
        // コンストラクタの生成　サイズMの int 型配列 lane[M] ができる
        for(int i = 0; i < N; i++) que[i] = new Queue(M);

        for(int i = 0; i < M; i++){
                int l_or_c = sc.nextInt(); 
                int x = sc.nextInt();
                
                // l_or_c == 0 なら lane x の先頭車をpopする。　配列の添字とxが１ずれるので -1する
                if(l_or_c == 0){
                        System.out.println(que[x - 1].pop());
                }

                // l_or_c == 1 なら car x を条件通りの lane に挿入する
                else{
                        int id = 0;
                        // size が最も小さい queue を選ぶ。sizeが同じなら lane 番号が小さい方を選ぶ
                        for(int j = 0; j < N; j++){
                                if(que[j].size() < que[id].size()) id = j;
                        }
                        que[id].push(x);
                }
        }
    }
}
