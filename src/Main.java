import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter.
public class Main {
    public static void main(String[] args) {
        //Создайте класс Book
        //для представления
        //книги и класс Library,
        //который будет
        //содержать массив
        //объектов Book.
        //Реализуйте методы в
        //классе Library для
        //добавления, поиска,
        //обновления и
        //удаления книг.

           /* Book book = new Book("Kel-kel",40,"Tologon Kasymbekov");
            Book book1 = new Book("Yimanga suusagan jigit ",32,"halit ertugrul");
            Book book5 = new Book("Cheksiz nur ",49,"fethulleh Gulen ");
            Book book2 = new Book("kanybek ",3,"K. Jantoshev");
            Book book3 = new Book("Toolor kulaganda",45,"Чынгыз Айтматов");
            Book book4 = new Book(" Kylym kaaarytar bir kun",24,"Чынгыз Айтматов");

            Book [] books = {book,book1,book2,book3,book5};

            Library library = new Library("Nur","Shans",books);
            System.out.println("Library: "+"\n"+library);
            System.out.println(library.addABookToTheLibrary(book4));
            System.out.println(library.updateBookByName(" Kel-kel", 40));
            System.out.println(Arrays.toString(library.removeBookFromLibrary(book2)));
            System.out.println("vfvd"+Arrays.toString(library.getAllBookByAuthor("Чынгыз Айтматов")));
        System.out.println("Removed books: " + Arrays.toString(library.removeBookFromLibrary(book2)));

        }
    }*/

        //Создайте класс Student для
        //представления информации о
        //студентах и класс
        //StudentManager, который
        //будет управлять массивом
        //объектов Student. Реализуйте
        //методы в StudentManager для
        //добавления, поиска по ID,
        //обновления и удаления
        //данных о студентах.
        // Создание объекта StudentManager
       /* StudentManager studentManager = new StudentManager();

        // Создание объектов студентов
        Student student1 = new Student("Asan", 36, "Java");
        Student student2 = new Student("Uson", 47, "Js");

        // Добавление студентов в StudentManager
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        // Вывод информации о студентах в StudentManager
        System.out.println("Содержимое StudentManager:");
        System.out.println(studentManager);

        // Поиск студента по ID
        Student foundStudent = studentManager.findStudentById(2);
        if (foundStudent != null) {
            System.out.println("Найденный студент: " + foundStudent);
        } else {
            System.out.println("Студент не найден.");
        }

        // Обновление имени студента по ID
        studentManager.updateStudentName(1, "Обновленное имя");
        System.out.println("StudentManager после обновления:");
        System.out.println(studentManager);

        // Удаление студента по ID
        studentManager.removeStudentById(2);
        System.out.println("StudentManager после удаления:");
        System.out.println(studentManager);
    }
}*/
        //СОЗДАЙТЕ КЛАСС STUDENT С
        //ПОЛЯМИ (NAME, AGE, GROUP), В MAIN
        //МЕТОДЕ СОЗДАЙТЕ 5 ОБЬЕКТОВ
        //КЛАССА STUDENT , ДАЙТЕ ЗНАЧЕНИЕ
        //ПОЛЯМ, ГРУППА МОЖЕТ БЫТЬ ТОЛЬКО
        //"JAVA" ИЛИ "JS" ВСЕ 5 СТУДЕНТОВ
        //ДОЛЖНЫ БЫТЬ В МАССИВЕ. ТЕПЕРЬ
        //ПОСЧИТАЙТЕ СКОЛЬКО СТУДЕНТОВ ИЗ
        //"JAVA" И "JS
       /* Student[] students = new Student[5];
        students[0] = new Student("Nurles", 20, "Java");
        students[1] = new Student("bilal", 18, "JS");
        students[2] = new Student("muktar", 17, "Java");
        students[3] = new Student("Erkin", 21, "Java");
        students[4] = new Student("Asan", 27, "JS");

        int javaCount = 0;
        int jsCount = 0;
        int totalAge = 0;

        for (Student student : students) {
            if (student.getGroup().equals("Java")) {
                javaCount++;
            } else if (student.getGroup().equals("JS")) {
                jsCount++;
            }

            totalAge += student.getAge();
        }

        double averageAge = (double) totalAge / students.length;

        System.out.println("Number of students in Java group: " + javaCount);
        System.out.println("Number of students in JS group: " + jsCount);
        System.out.println("Average age of all students: " + averageAge);
    }}*/
        // Contact деген класс тузунуз, полелери(contactName,
        //phoneNumber).
        //      2. Phone деген класс тузунуз полелери:  brand, model, price,
        //phonesUserName, contacts[])  (бренд, модель, баасы, телефондун
        //колдонучусунун аты, контакттар[]).
        //      3. Phone класстын ичинде getContactCount(); метод болсун, ал
        //метод телефондун колдонучусунун аты жана ушул телефондун
        //ичинде канча контакт бар экенин санап кайтарып берет.
        //      4. main ден Contact класстын 4 , Phone класстын объекттерин
        //2 тузуп, маанилер мн толтуруп, тиби Phone болгон массив тузуп
        //телефондорду ошол массивге салыныз.
        //     5. цикл дын жардамы мн массивдин ар бир элементине
        //кайрылып, жанагы Phone класста тузулгон getContactCount();
        //чакырып алыныз.

  /* Contact contact1 = new Contact("Jone",8365);
   Contact contact2 = new Contact("Habib",8365);
   Contact contact3 = new Contact("Conor",8365);
   Contact contact4 = new Contact("Shabdan",8365);
   Contact[] contacts1 = {contact1,contact2};
   Contact[] contacts2 = {contact4,contact3};

   Phone phone1 = new Phone("Nokia","S21",20,"Nurles",contacts1);
   Phone phone2 = new Phone("Redmi","Note9",100,"Nurbol",contacts2);
        System.out.println(phone1.getPhoneUserName());
        System.out.println(phone1.getContactCount());
        phone1.getAll();
        System.out.println("&&&&&&&&&  *************");
        System.out.println(phone2.getPhoneUserName());
        System.out.println(phone2.getContactCount());
        phone2.getAll();
    }
}*/
