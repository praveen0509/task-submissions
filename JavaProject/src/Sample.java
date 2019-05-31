import java.util.*;
import java.io.*;

class Sample{	
	public static void main(String args[]) {
		
		int n=5;
		for(int i=1; i<=2*n; i++){
			if(i<=n){
				for(int space=n; space>i; space--){
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++){
					System.out.print(" *");
				}
				System.out.println();
			}
			
			else{
				for(int space=1; space<=i-n; space++){
					System.out.print(" ");
				}
				for(int j=i-n; j<=n-1; j++){
					System.out.print(" *");
				}
				System.out.println();
				
			}
			
			
		
			
		}
		
		
		
	}

}
