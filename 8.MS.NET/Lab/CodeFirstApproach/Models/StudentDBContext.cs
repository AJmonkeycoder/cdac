using Microsoft.EntityFrameworkCore;

namespace CodeFirstApproach.Models
{
    public class StudentDBContext : DbContext //connect model classes to database
    {
        public StudentDBContext(DbContextOptions options) : base(options) //
        {
                
        }

        public  DbSet<Student> Students { get; set; } 
        //integral part of Entity framework
        //interact with the underlying db
        //manages the db connection, is used to retrieve and save data in db
        //instance of DbContext represents a session with the db which can be used to query and save instance of your entities to a db
        //DbContext is a combination of the unit of work and Repository patterns
        //DbContext can be used to define the db context class after creating a model class
        //DbSet<T> T-types of an object needs to be stored in db
    }
}
