package model;
import java.time.LocalDate;
public class Loan {

  private  long id;
  private Book boo;
  private User user;
  private LocalDate loanDate;
  private LocalDate dueDate;
  private LocalDate returnDate;
  private boolean returned;


    public Loan() {
    }
    public Loan(long id, Book boo, User user, LocalDate loanDate, LocalDate dueDate, LocalDate returnDate, boolean returned) {
        this.id = id;
        this.boo = boo;
        this.user = user;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBoo() {
        return boo;
    }

    public void setBoo(Book boo) {
        this.boo = boo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }


    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", boo=" + boo +
                ", user=" + user +
                ", loanDate=" + loanDate +
                ", dueDate=" + dueDate +
                ", returnDate=" + returnDate +
                ", returned=" + returned +
                '}';
    }
}
