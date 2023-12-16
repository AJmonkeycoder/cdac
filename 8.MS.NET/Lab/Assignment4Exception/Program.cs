namespace Assignment4Exception
    {
        public class Employee
        {
            static int count = 0;

            private string name;
            public String Name
            {
                get
                {
                    return name;
                }
                set
                {
                    if (value == "")
                    {
                        throw new InvalidUserNameException("invalid user name");
                    }
                    else
                    {
                        name = value;
                    }
                }

            }
            private int empNo;
            public int EmpNo
            {
                get
                {
                    return empNo;
                }
            }
            private decimal basic;
            public decimal Basic
            {
                get
                {
                    return basic;
                }
                set
                {
                    if (value >= 100000 && value <= 200000)
                    {
                        basic = value;
                    }

                    else
                    {
                        throw new InvalidSalaryException("invalid salary");
                    }
                }
            }

            private short deptNo;
            public short DeptNo
            {
                get
                {
                    return deptNo;
                }
                set
                {
                    if (value <= 0)
                    {
                        throw new InvalidDeptException("Invalid DeptNo");
                    }
                    else
                    {
                        deptNo = value;
                    }
                }
            }

            public decimal GetNetSalary()
            {
                return ((12 * basic) - 12000);
            }

            public Employee(String name, decimal basic, short deptNo)
            {
                this.basic = basic;
                this.name = name;
                this.deptNo = deptNo;
            }
            public Employee(String name, decimal basic)
            {
                this.name = name;
                this.basic = basic;
            }
            public Employee(String name)
            {
                this.name = name;
            }
            public Employee()
            {
                this.empNo = ++count;
            }

            static void Main()
            {

                Employee o1 = new Employee();
                Employee o2 = new Employee();
                Employee o3 = new Employee();

                Console.WriteLine(o1.EmpNo);
                Console.WriteLine(o2.EmpNo);
                Console.WriteLine(o3.EmpNo);

                Console.WriteLine(o3.EmpNo);
                Console.WriteLine(o2.EmpNo);
                Console.WriteLine(o1.EmpNo);

                try
                {
                    o2.Basic = 1;
                    o2.DeptNo = 0;
                    o2.Name = "";
                }
                catch (InvalidSalaryException e)
                {
                    Console.WriteLine(e.Message);
                }
                catch (InvalidUserNameException e)
                {
                    Console.WriteLine(e.Message);
                }
                catch (InvalidDeptException e)
                {
                    Console.WriteLine(e.Message);
                }


            }
        }
        public class InvalidUserNameException : ApplicationException
        {

            public InvalidUserNameException(string message) : base(message)
            { }


        }
        public class InvalidSalaryException : ApplicationException
        {
            public InvalidSalaryException(string message) : base(message)
            {
            }
        }
        public class InvalidDeptException : ApplicationException
        {
            public InvalidDeptException(string message) : base(message)
            {
            }
        }
    }



   