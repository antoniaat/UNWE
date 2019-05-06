using System;

namespace Exercise_01
{
    public class Program
    {
        public static void Main()
        {
            int height = int.Parse(Console.ReadLine());
            for (int i = 1; i <= height; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

        }
    }
}
