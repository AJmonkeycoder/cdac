﻿using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using WebApplication4.Models;

namespace WebApplication4.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class StudentAPIController : ControllerBase
    {
        private readonly DacContext context;

        public StudentAPIController(DacContext context)
        {
            this.context = context;
        }


        [HttpGet]
        public async Task<ActionResult<List<Student>>> GetStudent()
        {
            var data = await context.Students.ToListAsync();
            return Ok(data);
        }
        [HttpGet("{id}")]
        public async Task<ActionResult<Student>> GetStudentById(int id)
        {
            var data = await context.Students.FindAsync(id); 
            if(data == null) return NotFound();
            return Ok(data);
        }

        [HttpPost]
        public async Task<ActionResult<Student>> AddStudent(Student std)
        {
            await context.Students.AddAsync(std);
            await context.SaveChangesAsync();
            return Ok(std);
        }
        [HttpPut("{id}")]
        public async Task<ActionResult<Student>> UpdateStudent(int id, Student std)
        {
            if(id != std.Id)
            {
                return BadRequest();
            }
            context.Entry(std).State = EntityState.Modified;
            await context.SaveChangesAsync();
            return Ok(std);
        }

        [HttpDelete("{id}")]

        public async Task<ActionResult<Student>> DeleteStudent(int id)
        {
            var std = await context.Students.FindAsync(id);

            if(std == null)
            {
                return NotFound();
            }
            context.Students.Remove(std);
            await context.SaveChangesAsync();
            return Ok();
        }
    }
}
