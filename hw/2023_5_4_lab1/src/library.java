class Book {
    private String title;
    private String publisher;
    private String author;
    private double price;

    public Book(String title, String publisher, String author, double price) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class Student {
    private String studentId;
    private String className;
    private String name;
    private String gender;

    public Student(String studentId, String className, String name, String gender) {
        this.studentId = studentId;
        this.className = className;
        this.name = name;
        this.gender = gender;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBookInfo(Book book) {
        return book.getTitle() + " by " + book.getAuthor() + ", published by " + book.getPublisher() + ", priced at "
                + book.getPrice() + ".";
    }
}

class Teacher {
    private String courseName;
    private String className;
    private String name;
    private String gender;

    public Teacher(String courseName, String className, String name, String gender) {
        this.courseName = courseName;
        this.className = className;
        this.name = name;
        this.gender = gender;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBookInfo(Book book) {
        return book.getTitle() + " by " + book.getAuthor() + ", published by " + book.getPublisher() + ", priced at "
                + book.getPrice() + ".";
    }

    public String getStudentInfo(Student student) {
        return student.getName() + " (" + student.getGender() + "), student ID " + student.getStudentId() + ", class "
                + student.getClassName() + ".";
    }
}
