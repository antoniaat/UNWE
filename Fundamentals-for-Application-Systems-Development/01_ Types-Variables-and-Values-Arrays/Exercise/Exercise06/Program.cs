using System;

namespace Exercise06
{
    public class Program
    {
        public static void Main()
        {
            var firstSymbol = char.Parse(Console.ReadLine());
            var secondSymbol = char.Parse(Console.ReadLine());
            var thirdSymbol = char.Parse(Console.ReadLine());

            Console.WriteLine(thirdSymbol + secondSymbol + firstSymbol);
        }
    }
}
