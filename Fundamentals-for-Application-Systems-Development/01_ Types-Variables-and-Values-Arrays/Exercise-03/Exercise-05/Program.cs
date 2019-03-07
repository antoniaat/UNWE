using System;
using System.Linq;

namespace Exercise_05
{
    public class Program
    {
        public static void Main()
        {
            var firstArrLength = int.Parse(Console.ReadLine());
            var secondArrLength = int.Parse(Console.ReadLine());

            var firstArr = new int[firstArrLength];
            var secondArr = new int[secondArrLength];

            firstArr = FillTheArray(firstArr);
            secondArr = FillTheArray(secondArr);

            var isEqual = firstArr.SequenceEqual(secondArr);
            Console.WriteLine(isEqual);
        }

        public static int[] FillTheArray(int[] arr)
        {
            for (var i = 0; i < arr.Length; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }

            return arr;
        }
    }
}
