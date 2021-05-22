// Java code for Dynamic Programming based
// solution for 0-1 Knapsack problem

class GFG1 {
	
	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}

	// Prints the items which are put
	// in a knapsack of capacity W
	static void printknapSack(int W, int wt[],
							int val[], int n)
	{
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = Math.max(val[i - 1] +
							K[i - 1][w - wt[i - 1]], K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		// stores the result of Knapsack
		int res = K[n][W];
		System.out.println(res);

		w = W;
		for (i = n; i > 0 && res > 0; i--) {

			// either the result comes from the top
			// (K[i-1][w]) or from (val[i-1] + K[i-1]
			// [w-wt[i-1]]) as in Knapsack table. If
			// it comes from the latter one/ it means
			// the item is included.
			if (res == K[i - 1][w])
				continue;
			else {

				// This item is included.
				System.out.print(wt[i - 1] + " ");

				// Since this weight is included its
				// value is deducted
				res = res - val[i - 1];
				w = w - wt[i - 1];
			}
		}
	}

	// Driver code
	public static void main(String arg[])
	{
		int val[] = {10,20,30,40};
		int wt[] = { 1,2,3,4};
		int W = 10;
		int n = val.length;

		printknapSack(W, wt, val, n);
	}
}

// This code is contributed by Anant Agarwal.
