namespace EmpAssign
{
    internal class Program
    {
        static void Main()
        {
            Employee o1 = new Employee("Amol", 123456, 10);
            Employee o2 = new Employee("Shreya", 12345);
            Employee o3 = new Employee("Amol");
           // Employee o4 = new Employee();

            Console.WriteLine(o1.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o3.EmpNo);

            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o1.EmpNo);

        }
    }

    public class Employee
    {
        private String name;
        private int empNo;
        private decimal basic;
        private short deptNo;

        private static int autogenerator=1;

        public Employee(String name, decimal basic = 100, short deptNo = 1)
        {
            this.Name = name;
            empNo = autogenerator++;
            this.Basic = basic;
            this.DeptNo = deptNo;
        }
        public String Name {
            get { return name; }
            set
            {
                if(value == "")
                {
                    Console.WriteLine("Invalid Name");
                }
                else
                {
                    name = value;
                }
            }

        }

        public decimal Basic
        {
            get { return basic; }
            set
            {
                if (value>0 && value<1000000 )
                {
                    basic = value;
                }
                else
                {
                   
                    Console.WriteLine("Invalid basic amount");
                }
            }

        }
        public short DeptNo
        {
            get { return deptNo; }
            set
            {
                if (value <= 0) { Console.WriteLine("Invalid Department number"); }
                else
                    deptNo = value;
            }
        }

        public int EmpNo { get { return empNo; } }

        public decimal GetNetSalary()
        {
            return basic + (3 * basic) + (1 * basic) + ( basic/2) + (2 * basic);
        }
    }
}
