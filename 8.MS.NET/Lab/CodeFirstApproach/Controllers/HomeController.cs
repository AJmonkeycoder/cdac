﻿using CodeFirstApproach.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Diagnostics;

namespace CodeFirstApproach.Controllers
{
    public class HomeController : Controller
    {
        private readonly StudentDBContext studentDB;

        //private readonly ILogger<HomeController> _logger;

        //public HomeController(ILogger<HomeController> logger)
        //{
        //    _logger = logger;
        //}

        public HomeController(StudentDBContext studentDB)
        {
            this.studentDB = studentDB;
        }

        public async Task<IActionResult> Index()
        {
            var stdData = await studentDB.Students.ToListAsync();
            return View(stdData);
        }
        public IActionResult Create()
        {
            return View();
        }
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create(Student std)
        {
            if (ModelState.IsValid)
            {
                await studentDB.Students.AddAsync(std);
                await studentDB.SaveChangesAsync();
                TempData["insert_success"] = "Inserted...";
                return RedirectToAction("Index", "Home");
            }
            return View(std);
        }

        public async Task<IActionResult> Details(int? id)
        {
            if(id ==null || studentDB.Students == null)
            {
                return NotFound();
            }
            var stdData = await studentDB.Students.FirstOrDefaultAsync(x => x.Id == id);
            if (stdData == null)
            {
                return NotFound();
            }
            
            return View(stdData);
        }

        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null || studentDB.Students == null)
            {
                return NotFound();
            }
            var stdData = await studentDB.Students.FindAsync(id);
            if (stdData == null)
            {
                return NotFound();
            }
            return View(stdData);
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int? id, Student std)
        {
            if (id != std.Id)
            {
                return NotFound();
            }
            if (ModelState.IsValid)
            {
                studentDB.Students.Update(std);
                await studentDB.SaveChangesAsync();
                TempData["update_success"] = "Updated...";
                return RedirectToAction("Index", "Home");
            }
            return View();
        }

        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null || studentDB.Students == null)
            {
                return NotFound();
            }
            var stdData = await studentDB.Students.FirstOrDefaultAsync(x => x.Id == id);
            if (stdData == null)
            {
                return NotFound();
            }

            return View(stdData);
        }

        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirm(int? id)
        {
            var stddata = await studentDB.Students.FindAsync(id);
            if(stddata != null) { 
                studentDB.Students.Remove(stddata);
            }
            await studentDB.SaveChangesAsync();
            TempData["delete_success"] = "Deleted...";
            return RedirectToAction("index", "Home");   
        }
        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
