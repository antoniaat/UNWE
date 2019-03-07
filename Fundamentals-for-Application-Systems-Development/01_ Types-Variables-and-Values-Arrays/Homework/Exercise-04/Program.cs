using System;

namespace Exercise_04
{
    class Program
    {
        static void Main()
        {
            var input = Console.ReadLine();
            var inputToCharArray = input.ToCharArray();

            var firstSymbol = inputToCharArray[0].ToString();
            var secondSymbol = inputToCharArray[1].ToString();
            var thirdSymbol = inputToCharArray[2].ToString();
            var fourthSymbol = inputToCharArray[3].ToString();

            var sum = int.Parse(firstSymbol) + int.Parse(secondSymbol) + int.Parse(thirdSymbol) + int.Parse(fourthSymbol);

            Console.WriteLine($"{fourthSymbol}{thirdSymbol}{secondSymbol}{firstSymbol}"); 
            Console.WriteLine($"{fourthSymbol}{firstSymbol}{secondSymbol}{thirdSymbol}"); 
            Console.WriteLine($"{firstSymbol}{thirdSymbol}{secondSymbol}{fourthSymbol}"); 
        }
    }
}
