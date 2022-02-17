public class Student {
    private int sid;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Object){
            Student stu = (Student)obj;
            if (this.getSid()== stu.getSid() && this.getName().equals(stu.getName())){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Student stu1 = new Student(1,"张三",25);
        Student stu2 = new Student(1,"张三",35);
        System.out.println(stu1.equals(stu2));
    }
}
