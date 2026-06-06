package five.task1;

public class FromArchivedStatusMover extends BookMover {
    protected void movetoStatus(Book book, Status requestStatus) {
        switch (requestStatus) {
            case AVAILABLE:
                book.setStatus(Status.AVAILABLE);
                break;
            default:
                System.out.println("Перевод книги из статуса 'ARCHIVED' в " + requestStatus + " невозможен.");
        }
    }
}
