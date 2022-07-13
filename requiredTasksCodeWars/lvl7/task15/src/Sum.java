//https://www.codewars.com/kata/55f2b110f61eb01779000053

public class Sum
{
    public int GetSum(int a, int b)
    {
        if((a >= 0 && b >= 0) || (a <= 0 && b <= 0)) return ((a + b) * (Math.abs(a - b) + 1)) / 2;
        return (a * (Math.abs(a) + 1) / 2) + ((b * (Math.abs(b) + 1)) / 2);
    }
}