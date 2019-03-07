using System;

namespace Exercise_07
{
    public class Program
    {
        public  static void Main()
        {
            var arrLength = int.Parse(Console.ReadLine());

            int[,] arr = new int[arrLength, arrLength];
            var sum = 0;

            arr = FillTheArray(arr);

            for (int k = 0; k < arr.GetLength(0); k++)
            {
                for (int l = 0; l < arr.GetLength(1); l++)
                {
                    if (k == l)
                    {
                        sum += arr[k, l];
                    }
                }
            }

            Console.WriteLine(sum);
        }

        public static int[,] FillTheArray(int[,] arr)
        {
            for (int k = 0; k < arr.GetLength(0); k++)
            {
                for (int l = 0; l < arr.GetLength(1); l++)
                {
                    arr[k, l] = int.Parse(Console.ReadLine());
                }
            }

            return arr;
        }
    }
}
