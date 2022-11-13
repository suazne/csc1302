/*Suzanne Schouest 
Lab 2
CSC1302 Online Section 
27 Jan 2022 */
public class TheDotProduct2D {

	public static void main(String[] args) {
		int[][] my2D_1= {{21,32,23,34},{13,14,15,16}};
		System.out.println("Original Vector: ");
		PrintVect2D(my2D_1);

		int rows= my2D_1.length;
		int cols= my2D_1[0].length;
		int[][] my2D_2 = new int[cols][rows];
		my2D_2=Transpose2D(my2D_1);
			
		System.out.println("\nTransposed Vector: ");
		PrintVect2D(my2D_2);
		System.out.println("\nDot Product of two Vectors: ");
		DotProd(my2D_1,my2D_2);
		
		//#3 part of Lab (output 2)
		
		System.out.println("\nOutput2: \n");
		int[][] my2D_3 = {{1,3},{4,6},{15,16}};
		System.out.println("Original Vector: ");
		PrintVect2D(my2D_3);

		rows= my2D_3.length;
		cols= my2D_3[0].length;
		int[][] my2D_4 = new int[cols][rows];
		my2D_4=Transpose2D(my2D_3);
			
		System.out.println("\nTransposed Vector: ");
		PrintVect2D(my2D_4);
		System.out.println("\nDot Product of two Vectors: ");
		DotProd(my2D_3,my2D_4);
	}
	public static int[][] Transpose2D(int[][] x_arr) {
		int cols=x_arr[0].length;
		int rows=x_arr.length;
		int trans_arr[][] = new int[cols][rows];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				trans_arr[j][i]=x_arr[i][j];
			}
		}
		return (trans_arr);
	}
		
	// your code here for new method DotProd()
	public static void DotProd(int[][] x, int[][] y){
		int rowsx = x.length;//rows of matrix x
		int colsx = x[0].length;//columns of matrix x
		int rowsy = y.length;//rows of matrix y
		int colsy = y[0].length;//columns of matrix y
		int z[][]= new int[rowsx][colsy];//new dot product matrix with relative dimensions
		for(int i = 0; i < rowsx; i++) {//cycles through # of rows of x
			for(int j = 0; j < colsy; j++) {//cycles through # of columns of y
				for(int k = 0; k < rowsy; k++) {//cycles through # of rows of y
					z[i][j] += (x[i][k] * y[k][j]);//matrix multiplication cumulative thru each loop
				}
			}
		}
		PrintVect2D(z);//printing vector using PringtVect2D method
	}	
	
	public static void PrintVect2D(int[][] vect) {
		System.out.print("{ ");
		for(int i=0; i<vect.length; i++) {
			if(i>0)
				System.out.print("  ");
			for(int j=0; j<vect[0].length; j++) {
				if(j<vect[0].length-1)
					System.out.print(vect[i][j]+", ");
				else
					System.out.print(vect[i][j]);
			}
			if(i<vect.length-1)
				System.out.println("");
			else
				System.out.println(" }");
		}
	}
}