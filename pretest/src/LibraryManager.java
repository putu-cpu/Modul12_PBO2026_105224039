import model.Book;
import model.Member;
import service.BookService;
import service.LoanService;
import fine.FineCalculator;
import receipt.FineReceiptFormatter;

public class LibraryManager {
    private final BookService bookService;
    private final LoanService loanService;
    private final FineCalculator fineCalculator;
    private final FineReceiptFormatter receiptFormatter;

    public LibraryManager(BookService bookService, 
                          LoanService loanService, 
                          FineCalculator fineCalculator, 
                          FineReceiptFormatter receiptFormatter) {
        this.bookService = bookService;
        this.loanService = loanService;
        this.fineCalculator = fineCalculator;
        this.receiptFormatter = receiptFormatter;
    }

    public Book searchBook(String title) {
        return bookService.findBookByTitle(title);
    }

    public void loanBook(Member member, Book book) {
        loanService.processLoan(member, book);
    }

    public void processFine(int daysLate) {
        double fine = fineCalculator.calculateFine(daysLate);
        receiptFormatter.formatReceipt(fine);
    }
}
