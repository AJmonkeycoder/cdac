using System;
using System.Collections.Generic;

namespace WebApplication4.Models;

public partial class Student
{
    public int Id { get; set; }

    public string? Name { get; set; }

    public string? Course { get; set; }

    public string? Marks { get; set; }
}
