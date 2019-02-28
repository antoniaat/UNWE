using System;

namespace Exercise_03
{
    class Program
    {
        static void Main()
        {
            int number = int.Parse(Console.ReadLine());
            string binary = Convert.ToString(number, 2);
            Console.WriteLine(binary);
        }
    }
}
