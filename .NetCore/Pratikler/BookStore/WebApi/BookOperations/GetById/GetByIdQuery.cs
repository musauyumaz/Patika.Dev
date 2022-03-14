using System.Linq;
using WebApi.Common;

namespace WebApi.BookOperations.GetById
{
    public class GetByIdQuery
    {
        private readonly BookStoreDbContext _dbContext;
        public GetByIdQuery(BookStoreDbContext dbContext)
        {
            _dbContext = dbContext;
        }

        public BookViewModel Handle(int id)
        {
            BookViewModel Model = new BookViewModel();
            var book = _dbContext.Books.Where(x => x.Id == id).SingleOrDefault();
            Model.PageCount = book.PageCount;
            Model.Title = book.Title;
            Model.Genre = ((GenreEnum)book.GenreId).ToString();
            Model.PublishDate = book.PublishDate.Date.ToString("dd/MM/yyy");

            return Model;
        }
    }
    public class BookViewModel
    {
        public string Title { get; set; }
        public int PageCount { get; set; }
        public string PublishDate { get; set; }
        public string Genre { get; set; }
    }
}