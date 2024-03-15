package first;

public class P9 {
    public void print(int n){
        int space=n-1, star=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
            star+=2;
            space--;
        }
        space=0;
        star=2*n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
            star-=2;
            space++;
        }
    }
}
