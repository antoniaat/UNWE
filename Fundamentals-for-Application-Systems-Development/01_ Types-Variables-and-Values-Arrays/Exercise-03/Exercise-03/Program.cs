using System;

namespace Exercise_03
{
    public class Program
    {
        public static void Main()
        {
            var number = int.Parse(Console.ReadLine());

            int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            for (int i = 0; i <= table.Length; i++)
            {
                Console.WriteLine($"{number} * {table[i]} = {number * table[i] }");
            }
        }
    }
}
