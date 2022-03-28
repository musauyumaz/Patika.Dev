using System.Collections.Generic;
using System.Linq;
using AutoMapper;

namespace WebApi.Application.GenreOperation.Queries.GetGenres
{
    public class GetGenresQuery
    {
        public readonly BookStoreDbContext _context;
        public readonly IMapper _mapper;


        public GetGenresQuery(BookStoreDbContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;
        }
        public List<GenresViewModel> Handle()
        {
            var genres = _context.Genres.Where(x => x.IsActive == true).OrderBy(x => x.Id);
            List<GenresViewModel> returnObj = _mapper.Map<List<GenresViewModel>>(genres);
            return returnObj;
        }

    }
    public class GenresViewModel
    {
        public int Id { get; set; }
        public string Name { get; set; }

        
    }
}