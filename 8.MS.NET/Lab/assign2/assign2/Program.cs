using System.Net;
using System.Xml.Linq;

namespace assign2
{
   internal class Program
    {
        public static void Main(string[] args)
        {
            CEO c = new CEO("Prashant", 2, 90000);
            Console.WriteLine(c.CalcNetSalary());

            GeneralManager gm = new GeneralManager("atharv", 3, 250000, "Technical Manager", "Bungalow");
            Console.WriteLine(gm.CalcNetSalary());

            Manager m = new Manager("Soni", 2, 9000, "HR");
            Console.WriteLine(m.CalcNetSalary());
        }
    }

    public class CEO : Employee
    {
        public CEO(String name, short deptNo, decimal basic) : base(name, deptNo)
        {
           
            this.Basic = basic;
        }

        public sealed override decimal CalcNetSalary()
        {
            return basic + (4 * basic) + (2 * basic) + (basic / 2) + (3 * basic);
        }

        public override decimal Basic
        {
            set
            {
                if (value > 70000 && value < 100000)
                {
                    basic = value;
                }
                else
                {
                    Console.WriteLine("Invalid amount");
                }
            }
            get { return basic; }
        }
    }

    public class GeneralManager : Manager
    {
        public GeneralManager(String name, short deptNo, decimal basic, String designation, String perks) : base(name, deptNo, basic, designation)
        {
            this.Perks = perks;
            this.Basic = basic;
        }

        public override decimal Basic
        {
            set
            {
                if (value > 18000 && value < 30000)
                {
                    basic = value;
                }
                else
                {
                    Console.WriteLine("Invalid amount");
                }
            }
            get { return basic; }
        }
        public override decimal CalcNetSalary()
        {
            return basic + (3 * basic) + (1 * basic) + (basic / 2) + (2 * basic);
        }
        public String Perks
        {
            get; set;
        } 
    }
    public class Manager : Employee
    {
        private String designation;

        public Manager(String name, short deptNo, decimal basic, String designation):base(name,deptNo)
        {
            this.Designation = designation;
            this.Basic = basic;
        }
        
         public override decimal CalcNetSalary()
        {
            return basic + (2 * basic) + (1 * basic) + (basic / 2) + (2 * basic);
        }

        public override decimal Basic
        {
            set
            {
                if(value>0 && value < 10000)
                {
                    basic = value;
                }
            }
            get { return basic; }
        }
        public String Designation
        {
            get { return designation; }
            set
            {
                if (value == "")
                {
                    Console.WriteLine("Invalid Name");
                }
                else
                {
                    designation = value;
                }
            }
        }
    } 

    public abstract class Employee
    {
        private int empNo;
        private string name;
        private short deptNo;
        protected decimal basic;

        public Employee(String name, short deptNo = 1)
        {

        }
        public abstract decimal Basic
        {
            get; set;   
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

        public abstract decimal CalcNetSalary();
      
    }
}




