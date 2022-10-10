package ad211.vetokhin;

public class Student {
    String fullName;
    int year;
    int group;
    double average, A, B, C, scholarship;

    public Student(String f, int y, int g, double avrg, double a, double b, double c, double s) {
        fullName = f;
        year = y;
        group = g;
        average = avrg;
        A = a;
        B = b;
        C = c;
        scholarship = s;
    }

    public int NextYear() {
        return year+1;
     }

    public double ChangeAverage() {
        return ((C + B + A) / 3);
    }

    public double Scholarship() {
        return 3000;
    }
}
