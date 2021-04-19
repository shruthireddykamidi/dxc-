package jp;

public class Matrix {

	public static void main(String[] args) {
					
						
						int x[][]={{8,9,7},{6,6,5},{4,5,3}};  
						
						int y[][]={{3,5,9},{18,5,8},{2,1,5}}; 
						
						int z[][]=new int[3][3];  
						
						for(int i=0,j=2;i<3;i++,j--)
							for(int k=0,l=2;k<3;k++,l--)
								z[i][k]=x[i][k]*y[j][l];
							
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
								System.out.print(z[i][j]+" ");
							System.out.println();
						}
					}
				
				  
		}
		// TODO Auto-generated method stub

	
