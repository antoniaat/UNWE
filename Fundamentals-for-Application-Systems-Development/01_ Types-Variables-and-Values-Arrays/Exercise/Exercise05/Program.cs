using System;

namespace Exercise05
{
    public class Program
    {
        public static void Main()
        {
            var celsium = double.Parse(Console.ReadLine());

            var calvin = celsium + 273;
            var far = (celsium * 18) / 10 + 32;

            Console.WriteLine(calvin);
            Console.WriteLine(far);
        }
    }
}
