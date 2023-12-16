namespace Arrays
{

    using System;

    class Program
    {
        static void Main()
        {
            Console.Write("Enter the number of batches: ");
            int numBatches = int.Parse(Console.ReadLine());

            int[][] marks = new int[numBatches][];

            for (int i = 0; i < numBatches; i++)
            {
                Console.Write($"Enter the number of students in batch {i + 1}: ");
                int numStudents = int.Parse(Console.ReadLine());

                marks[i] = new int[numStudents];

                for (int j = 0; j < numStudents; j++)
                {
                    Console.Write($"Enter the mark for student {j + 1} in batch {i + 1}: ");
                    marks[i][j] = int.Parse(Console.ReadLine());
                }
            }

            Console.WriteLine("Marks:");
            for (int i = 0; i < numBatches; i++)
            {
                for (int j = 0; j < marks[i].Length; j++)
                {
                    Console.WriteLine($"Batch {i + 1}, Student {j + 1}: {marks[i][j]}");
                }

            }

            int dummyHoldScreen = int.Parse(Console.ReadLine());
        }
    }
}