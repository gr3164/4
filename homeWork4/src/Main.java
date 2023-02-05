import Model.Student;
import Model.Teacher;
import Model.User;
import Service.UserService;
import Service.impls.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.add(new Student("Роман", 4.92f, 4, new Teacher("Антонина Петровна")));
        userService.add(new Student("Кирил", 3.52f, 1, new Teacher("Анастасия Сергеевна")));
        userService.add(new Student("Алена", 4.2f, 1, new Teacher("Инна Владимировна")));
        userService.add(new Teacher("Антонина Павловна"));
        userService.add(new Teacher("Анастасия Сергеевна"));
        userService.add(new Teacher("Инна Владимировна"));
    }
}
