import java.io.*;
import java.util.*;

public class NelioRatkaisu {
    public static void main(String[] args) throws Exception {
	/*
	 * Syotteen lukeminen
	 */

	Scanner sc = new Scanner(new FileInputStream("NELIO.IN"));

	int n = sc.nextInt();
	int[][] data = new int[n][n];

	for(int i = 0; i<n; i++)
	    for(int j = 0; j<n; j++)
		data[i][j] = sc.nextInt();
	
	/*
	 * Ratkaisun laskeminen
	 */

	int[][] ratk = new int[n][n];

	// Erikoisratkaisut
	ratk[0][0] = data[0][0];
	for(int i = 1; i<n; i++) {
	    ratk[i][0] = ratk[i-1][0] + data[i][0];
	    ratk[0][i] = ratk[0][i-1] + data[0][i];
	}

	// Rekursio
	for(int i = 1; i<n; ++i) {
	    for(int j = 1; j<n; ++j) {
		ratk[i][j] = Math.max(ratk[i-1][j], ratk[i][j-1])
		             + data[i][j]; 
	    }
	}

	/*
	 * Ratkaisun tulostaminen
	 */

	System.out.println("" + ratk[n-1][n-1]);
    }
}
