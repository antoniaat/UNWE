using System;
using System.Linq;

namespace Exercise_01
{
    public class Program
    {
        public static void Main()
        {
            var egnStr = Console.ReadLine();
            if (egnStr == null) return;

            var birthdayDate = egnStr.Take(6).ToArray();
            var year = int.Parse($"19{birthdayDate[0]}{birthdayDate[1]}");
            var month = int.Parse($"{birthdayDate[2]}{birthdayDate[3]}");
            var day = int.Parse($"{birthdayDate[4]}{birthdayDate[5]}");

            var date = new DateTime(year, month, day);

            Console.WriteLine(date);
        }
    }
}
