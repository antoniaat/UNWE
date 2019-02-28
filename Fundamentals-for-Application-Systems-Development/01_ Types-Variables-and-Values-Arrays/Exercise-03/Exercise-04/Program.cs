using System;
using System.Linq;

namespace Exercise_04
{
    public class Program
    {
        public static void Main()
        {
            var length = int.Parse(Console.ReadLine());
            var arr = new int[length];

            for (var i = 0; i < arr.Length; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }

            ReverseAndPrintArray(arr);
        }

        public static void ReverseAndPrintArray(int[] arr)
        {
            var reversedArr = arr.Reverse();

            foreach (var num in reversedArr)
            {
                Console.WriteLine(num);
            }
        }
    }
}
