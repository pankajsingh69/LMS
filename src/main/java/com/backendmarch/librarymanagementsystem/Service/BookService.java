package com.backendmarch.librarymanagementsystem.Service;

import com.backendmarch.librarymanagementsystem.Entity.Author;
import com.backendmarch.librarymanagementsystem.Entity.Book;
import com.backendmarch.librarymanagementsystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;
    public void addBook(Book book) throws Exception{

        Author author;
        try{
             author = authorRepository.findById(book.getAuthor().getAuthorId()).get();
        }
        catch (Exception e){
            throw new Exception("Author Not Present");
        }

        List<Book> booksWritten = author.getBooks();
        booksWritten.add(book);

        authorRepository.save(author);

    }
}
