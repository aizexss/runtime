package five_all_tasks.task1;

public class FromBorrowedStatusMover {
    protected void moveToStatus(Book book, Status requestStatus) {
        switch (requestStatus) {
            case AVAILABLE:
                book.setStatus(Status.AVAILABLE);
                break;
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                break;
            case OVERDUED:
                book.setStatus(Status.OVERDUED);
                break;
            default:
                System.out.println("Не получилось изменить статус");
        }
    }
}
