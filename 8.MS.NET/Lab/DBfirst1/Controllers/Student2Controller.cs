using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using DBfirst1.Models;

namespace DBfirst1.Controllers
{
    public class Student2Controller : Controller
    {
        private readonly DacContext _context;

        public Student2Controller(DacContext context)
        {
            _context = context;
        }

        // GET: Student2
        public async Task<IActionResult> Index()
        {
              return _context.Student2s != null ? 
                          View(await _context.Student2s.ToListAsync()) :
                          Problem("Entity set 'DacContext.Student2s'  is null.");
        }

        // GET: Student2/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null || _context.Student2s == null)
            {
                return NotFound();
            }

            var student2 = await _context.Student2s
                .FirstOrDefaultAsync(m => m.Id == id);
            if (student2 == null)
            {
                return NotFound();
            }

            return View(student2);
        }

        // GET: Student2/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Student2/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,Name,Age,Course")] Student2 student2)
        {
            if (ModelState.IsValid)
            {
                _context.Add(student2);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(student2);
        }

        // GET: Student2/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null || _context.Student2s == null)
            {
                return NotFound();
            }

            var student2 = await _context.Student2s.FindAsync(id);
            if (student2 == null)
            {
                return NotFound();
            }
            return View(student2);
        }

        // POST: Student2/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("Id,Name,Age,Course")] Student2 student2)
        {
            if (id != student2.Id)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(student2);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!Student2Exists(student2.Id))
                    {
                        return NotFound();
                    }
                    else
                    {
                        throw;
                    }
                }
                return RedirectToAction(nameof(Index));
            }
            return View(student2);
        }

        // GET: Student2/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null || _context.Student2s == null)
            {
                return NotFound();
            }

            var student2 = await _context.Student2s
                .FirstOrDefaultAsync(m => m.Id == id);
            if (student2 == null)
            {
                return NotFound();
            }

            return View(student2);
        }

        // POST: Student2/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            if (_context.Student2s == null)
            {
                return Problem("Entity set 'DacContext.Student2s'  is null.");
            }
            var student2 = await _context.Student2s.FindAsync(id);
            if (student2 != null)
            {
                _context.Student2s.Remove(student2);
            }
            
            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool Student2Exists(int id)
        {
          return (_context.Student2s?.Any(e => e.Id == id)).GetValueOrDefault();
        }
    }
}
