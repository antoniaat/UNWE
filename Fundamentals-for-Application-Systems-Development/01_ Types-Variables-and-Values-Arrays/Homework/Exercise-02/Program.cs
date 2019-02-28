using System;
using System.Text.RegularExpressions;

namespace Exercise02
{
    class Program
    {
        static void Main()
        {
            string input = Console.ReadLine();

            if (input == "a" || input == "e" || input == "i" || input == "o" || input == "u")
            {
                Console.WriteLine("vowel");
            }
            else if (Regex.IsMatch(input, @"^\d+$"))
            {
                Console.WriteLine("digit");
            }
            else
            {
                Console.WriteLine("something else");
            }
        }
    }
}
