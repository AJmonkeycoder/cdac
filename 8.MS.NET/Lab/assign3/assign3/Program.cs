using System.Net;
using System.Xml.Linq;

namespace assign3
{
    internal class Program
    {
        public static void Main(string[] args)

        {
            Console.WriteLine("Enter total number of employee : ");
            int size = Convert.ToInt32(Console.ReadLine());

            Employee[] empArr = new Employee[size];
            /*Employee e1 = new Employee("abs", 2000, 2);
            Employee e2 = new Employee("gwd", 3600, 1);
            Employee e3 = new Employee("fsd", 3400, 3);
            empArr[0] = e1;
            empArr[1] = e2;
            empArr[2] = e3;*/
            for (int i = 0; i < size; i++)
            {

                Console.WriteLine("Enter Name,  Basic Salary, Department No :   ");
                Employee e = new Employee(Console.ReadLine(), Convert.ToDecimal(Console.ReadLine()), Convert.ToInt16(Console.ReadLine()));
                empArr[i] = e;
            }

            decimal maxSal=0;
            int no=0;
            for(int i = 0; i<3; i++)
            {
                if (empArr[i].GetNetSalary() > maxSal)
                {
                    maxSal = empArr[i].GetNetSalary();
                    no = i;
                }
            }
            Console.WriteLine("Highest salary : ");
            Display(empArr[no]);

            Console.WriteLine("Enter empNo to get details : ");
            int empNo = Convert.ToInt32(Console.ReadLine());
            if(empNo<=size && empNo>0)
            {
                Display(empArr[empNo-1]);
            }
            else
            {
                Console.WriteLine("Invalid emp no");
            }
          /*  CEO c = new CEO("Prashant", 2, 90000);
            Console.WriteLine(c.CalcNetSalary());

            GeneralManager gm = new GeneralManager("atharv", 3, 250000, "Technical Manager", "Bungalow");
            Console.WriteLine(gm.CalcNetSalary());

            Manager m = new Manager("Soni", 2, 9000, "HR");
            Console.WriteLine(m.CalcNetSalary());*/
        }

        public static void Display(Employee emp)
        {
            Console.WriteLine("Employee No : " + emp.EmpNo);
            Console.WriteLine("Employee Name : " + emp.Name);
            Console.WriteLine("Employee Net Salary : " + emp.GetNetSalary());
            Console.WriteLine("Employee Dept No : " + emp.DeptNo);
        }
    }

    public class Employee
    {
        private String name;
        private int empNo;
        private decimal basic;
        private short deptNo;

        private static int autogenerator = 1;

        public Employee(String name, decimal basic = 100, short deptNo = 1)
        {
            this.Name = name;
            empNo = autogenerator++;
            this.Basic = basic;
            this.DeptNo = deptNo;
        }
        public String Name
        {
            get { return name; }
            set
            {
                if (value == "")
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
                if (value > 0 && value < 1000000)
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
            return basic + (3 * basic) + (1 * basic) + (basic / 2) + (2 * basic);
        }
    }
}




