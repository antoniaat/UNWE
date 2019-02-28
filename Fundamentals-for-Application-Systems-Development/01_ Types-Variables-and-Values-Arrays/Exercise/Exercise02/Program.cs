using System;

namespace Exercise02
{
    public class Program
    {
        public static void Main()
        {
            var firstNum = double.Parse(Console.ReadLine());
            var secondNum = double.Parse(Console.ReadLine());
            var thirdNum = double.Parse(Console.ReadLine());
            var fourthNum = double.Parse(Console.ReadLine());

            var average = (firstNum + secondNum + thirdNum + fourthNum) / 4;

            Console.WriteLine(average);
        }
    }
}
