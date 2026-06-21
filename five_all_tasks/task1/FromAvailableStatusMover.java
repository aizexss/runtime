package five_all_tasks.task1;

public class FromAvailableStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestStatus) {
        switch (requestStatus) {
            case BORROWED:
                book.setStatus(Status.BORROWED);
                break;
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                break;
            default:
                System.out.println("Перевод книги из статуса 'AVAILABLE' в " + requestStatus + " невозможен.");
        }
    }
}
