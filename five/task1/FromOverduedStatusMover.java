package five.task1;

public class FromOverduedStatusMover {
    protected void moveToStatus(Book book, Status requestStatus) {
        switch (requestStatus) {
            case AVAILABLE:
                book.setStatus(Status.AVAILABLE);
                break;
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                 break;
            default:
                System.out.println("Перевод книги из статуса 'OVERDUED' в " + requestStatus + " невозможен.");
        }
    }
}
