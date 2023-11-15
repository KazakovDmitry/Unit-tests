package seminar4.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BookServiceTest {
    Book book;
    BookRepository repoMock;
    BookService bookService;

    @BeforeEach
    void setUp(){
        repoMock = mock(BookRepository.class);
        bookService = new BookService(repoMock);
        book = new Book("a1", "Tom Sawyer", "Mark Twain");
    }

    @Test
    void testFindBookById(){
        bookService.findBookById("a1");

        verify(repoMock).findById("a1");
    }

    @Test
    void testFindAllBooks(){
        bookService.findAllBooks();

        verify(repoMock).findAll();
    }
}