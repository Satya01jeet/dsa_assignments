package first;

public class P22 {
    public void print(int n){
        int size = 2*n-1;
        int[][] arr = new int[size][size];
        int front = 0, back = size-1;
        while(n!=1){
            for(int i=front; i<size; i++){
                for(int j=front; j<size; j++){
                    if(i==front || i==back || j==front || j==back) arr[i][j]=n;
                }
            }
            front++;
            back--;
            n--;
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
