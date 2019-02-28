using System;

namespace Exercise09
{
    public class Program
    {
        public static void Main()
        {
            var number = double.Parse(Console.ReadLine());
            Console.WriteLine(number % 5 == 0);
        }
    }
}
