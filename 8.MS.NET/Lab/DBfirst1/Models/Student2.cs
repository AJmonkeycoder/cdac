using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace DBfirst1.Models;

public partial class Student2
{
    
    public int Id { get; set; }
    [Required]
    public string? Name { get; set; }
    [Required]
    public int? Age { get; set; }
    [Required]
    public string Course { get; set; } = null!;
}
