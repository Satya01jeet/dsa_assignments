package first;

public class P19 {
    public void print(int n){
        int sp=0, star=n;
        for(int i=0; i<n; i++){
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int j=0; j<sp; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            star--;
            sp+=2;
            System.out.println();
        }
        star=1; 
        sp=2*n-2;
        for(int i=0; i<n; i++){
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int j=0; j<sp; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            star++;
            sp-=2;
            System.out.println();
        }
    }
}
