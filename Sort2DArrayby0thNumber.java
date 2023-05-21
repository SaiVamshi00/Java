import java.util.*;
public class Sort2DArrayby0thNumber
{
	public static void main(String[] args) {
		int arr[][]={{2,1,1},{3,2,1},{1,7,8},{8,2,2},{7,6,5}};
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
		for(int i=0;i<5;i++){
		    for(int j=0;j<3;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

// input
//	int arr[][]={{2,1,1},{3,2,1},{1,7,8},{8,2,2},{7,6,5}}
// output
// 1 7 8 
// 2 1 1 
// 3 2 1 
// 7 6 5 
// 8 2 2 
