package tasktracker.tasktrackerv2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = Managers.getDefault();

        Task task = new Task("Сдать Step-Tracker", "Финальная проверка кода");
        manager.createTask(task);

        Task task1 = new Task("Сдать Task-Tracker", "Финальная проверка кода");
        manager.createTask(task1);


        Epic epic = new Epic("Путешествие", "Поездка в горы");
        manager.createTask(epic);
        Subtask sub1 = new Subtask("Купить билеты", "На поезд или самолет");
        manager.createTask(sub1, epic.getId());
        Subtask sub2 = new Subtask("Забронировать отель", "Желательно с видом");
        manager.createTask(sub2, epic.getId());

        Epic epic1 = new Epic("Подготовка к собеседованию", "Java");
        manager.createTask(epic1);
        Subtask sub3 = new Subtask("Купить сборник", "На Авито");
        manager.createTask(sub3, epic1.getId());


        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Вывод всех задач:\n" + manager.getAllTasks());
        System.out.println("Вывод всех эпиков:\n" + manager.getAllEpics());
        System.out.println("Вывод всех подзадач:\n" + manager.getAllSubtasks());
        System.out.println("-------------------------------------------------------------------------------");
        manager.updateTask(task, task.getId(), Status.IN_PROGRESS);
        System.out.println("Изменение статуса задачи на In Progress:\n" + manager.getAllTasks());
        manager.updateTask(sub3, sub3.getId(), Status.DONE);
        System.out.println("Изменение статуса эпика через подзадачу на DONE:\n" +  manager.getAllEpics());
        // Не изменился статус эпика хахаха
        System.out.println("-------------------------------------------------------------------------------");
        manager.deleteById(task1.getId());
        System.out.println("После удаления задачи, вывод всех задач:" + manager.getAllTasks());
        System.out.println("-------------------------------------------------------------------------------");
        manager.getById(task1.getId());
        manager.getById(epic.getId());
        manager.getById(task1.getId());
        manager.getById(epic1.getId());
        manager.getById(6);
        manager.getById(7);
        System.out.println("Отображение истории manager get History: \n" + manager.getHistory());
        System.out.println("-------------------------------------------------------------------------------");


        System.out.println("-------------------------------------------------------------------------------");

    }
}