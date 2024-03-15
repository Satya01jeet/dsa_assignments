package first;

public class P12 {
    public void print(int n){
        int space = 2*n-2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            space-=2;
            System.out.println();
        }
    }
}
