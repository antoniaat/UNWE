using System;

namespace Exercise03
{
    public class Program
    {
        public static void Main()
        {
            var x = double.Parse(Console.ReadLine());
            var y = double.Parse(Console.ReadLine());
            var z = double.Parse(Console.ReadLine());

            Console.WriteLine((x + y) * z);
            Console.WriteLine(x * y + y * z);
        }
    }
}
