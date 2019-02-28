using System;

namespace Exercise08
{
    public class Program
    {
        public static void Main()
        {
            var radius = double.Parse(Console.ReadLine());

            var a = 4 * Math.PI * Math.Pow(radius, 2);
            var v = 3.0 / 4 * Math.PI * Math.Pow(radius, 3);

            Console.WriteLine(a);
            Console.WriteLine(v);
        }
    }
}
