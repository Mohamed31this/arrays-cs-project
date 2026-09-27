package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

    }

    public static int[] addCourse(int[] courses, int newCourse) {
        int[] newArray = new int[courses.length + 1];
        for (int i=0; i<courses.length; i++) {
            newArray[i] = courses[i];
        }
        newArray[newArray.length - 1] = newCourse;
        return newArray;
    }

    public static void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }}
        System.out.println("]");
    }


    public static boolean containsCourse(int[] courses, int courseNumber) {
        for (int course : courses) {
            if (course == courseNumber) {
                return true;
            }
        }
        return false;
    }



}
