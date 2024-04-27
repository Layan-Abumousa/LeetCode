class Solution {
    public int addDigits(int x) {
        int sum = 10;
	while (sum/10 > 0)
	{
		sum = 0;
		while (x!=0)
		{
			sum += x % 10;
			x /= 10;
		}
		x = sum;
	}
	return  sum;
    }
}
