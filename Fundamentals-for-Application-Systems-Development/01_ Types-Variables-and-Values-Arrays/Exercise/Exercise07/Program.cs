using System;

namespace Exercise07
{
    public class Program
    {
        public static void Main()
        {
            var radius = double.Parse(Console.ReadLine());

            var s = Math.PI * radius * 2;
            Console.WriteLine(s);
        }
    }
}
