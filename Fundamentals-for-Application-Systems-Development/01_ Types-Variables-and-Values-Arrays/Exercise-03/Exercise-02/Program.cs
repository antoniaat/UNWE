using System;
using System.Linq;

namespace Exercise_02
{
    public class Program
    {
        public static void Main()
        {
            var arr = new int[10];

            for (var i = 0; i < arr.Length; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }

            foreach (var num in arr)
            {
                Console.WriteLine(num);
            }
        }
    }
}
