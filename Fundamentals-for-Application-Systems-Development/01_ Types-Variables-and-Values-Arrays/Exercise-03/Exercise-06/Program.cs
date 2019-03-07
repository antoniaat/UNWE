using System;

namespace Exercise_06
{
    public class Program
    {
        public static void Main()
        {
            int[,] arr = new int[3, 3];

            arr = FillTheArray(arr);

            for (int k = 0; k < arr.GetLength(0); k++)
            {
                for (int l = 0; l < arr.GetLength(1); l++)
                {
                    var val = arr[k, l];
                    Console.WriteLine(val);
                }
            }
        }

        public static int[,] FillTheArray(int[,] arr)
        {
            arr[0, 0] = 1;
            arr[0, 1] = 2;
            arr[0, 2] = 3;
            arr[1, 0] = 4;
            arr[1, 1] = 5;
            arr[1, 2] = 6;
            arr[2, 0] = 7;
            arr[2, 1] = 8;
            arr[2, 2] = 9;

            return arr;
        }
    }
}
