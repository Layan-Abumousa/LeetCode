class Solution {
public:
    bool isThree(int x) {
         int c = 0;
	for (int i = 1; i <= x; i++)
	{
		if (x%i==0)
		{
			c++;
		}if (c>3)
		{
			return false;
		}
	}
	if (c==3)
	{
		return true;
	}
	return false;
    }
};
