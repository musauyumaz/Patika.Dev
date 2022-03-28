using System;
using Microsoft.EntityFrameworkCore;
using WebApi.Entities;

namespace WebApi
{
    public class BookStoreDbContext : DbContext
    {
        public BookStoreDbContext(DbContextOptions<BookStoreDbContext> options) : base(options)
        { }
        public DbSet<Book> Books { get; set; }
        public DbSet<Genre> Genres { get; set; } 
        public DbSet<Author> Authors { get; set; }

        
    }
}