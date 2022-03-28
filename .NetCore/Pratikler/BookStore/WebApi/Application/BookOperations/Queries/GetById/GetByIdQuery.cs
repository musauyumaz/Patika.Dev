using System;
using System.Linq;
using Microsoft.EntityFrameworkCore;
using WebApi.Common;

namespace WebApi.Application.BookOperations.Queries.GetById
{
    public class GetByIdQuery
    {
        private readonly BookStoreDbContext _dbContext;
        private readonly AutoMapper.IMapper _mapper;
        public int BookId { get; set; }
        public GetByIdQuery(BookStoreDbContext dbContext, AutoMapper.IMapper mapper)
        {
            _dbContext = dbContext;
            _mapper = mapper;
        }

        public BookViewModel Handle()
        {
            
            var book = _dbContext.Books.Include(x=>x.Genre).Include(x=>x.Author).Where(x => x.Id == BookId).SingleOrDefault();
            if(book is null)
                throw new InvalidOperationException("Kitap Bulunamadı");
            BookViewModel vm = _mapper.Map<BookViewModel>(book);
            // Model.PageCount = book.PageCount;
            // Model.Title = book.Title;
            // Model.Genre = ((GenreEnum)book.GenreId).ToString();
            // Model.PublishDate = book.PublishDate.Date.ToString("dd/MM/yyy");

            return vm; 
        }
    }
    public class BookViewModel
    {
        public string Title { get; set; }
        public int PageCount { get; set; }
        public string PublishDate { get; set; }
        public string Genre { get; set; }
        public string Author { get; set; }
    }
}