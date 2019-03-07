using System;

namespace Exercise01
{
    class Program
    {
        static void Main()
        {
            double a = double.Parse(Console.ReadLine());
            double b = double.Parse(Console.ReadLine());
            double c = double.Parse(Console.ReadLine());

            double p = a + b + c;
            double s = (a * b) / 2;

            Console.WriteLine(p);
            Console.WriteLine(s);
        }
    }
}
