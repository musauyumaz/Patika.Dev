using System;
using FluentValidation;

namespace WebApi.Application.BookOperations.Commands.UpdateBook
{
    public class UpdateBookCommandValidator : AbstractValidator<UpdateBookCommand>
    {
        public UpdateBookCommandValidator()
        {
            RuleFor(command => command.BookId).GreaterThan(0).NotEmpty().NotNull();
            RuleFor(command => command.Model.GenreId).GreaterThan(0).NotEmpty().NotNull();
            RuleFor(command => command.Model.PageCount).GreaterThan(0).NotEmpty().NotNull();
            RuleFor(command => command.Model.PublishDate.Date).NotEmpty().NotNull().LessThan(DateTime.Now.Date);
            RuleFor(command => command.Model.Title).MinimumLength(4).NotEmpty().NotNull();

        }
    }
}