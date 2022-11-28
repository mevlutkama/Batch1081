package lambdafunctionalprogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05 {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Summer", "Turkish Day", 95, 132);
        Course courseEnglishNight = new Course("Summer", "Turkish Day", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(checkAvgScoreToBeGreaterThan91(coursesList,91));
        System.out.println(checkAnyCourseNameContainsTurkish(coursesList));
        courseHasHighestAvg(coursesList);
        System.out.println(sortAvgAscSkipFirstTwo(coursesList));
        System.out.println(sortAvgAscGetThird(coursesList));

    }

    // 1) Create a method to check if all average scores are greater than 91
    public static boolean checkAvgScoreToBeGreaterThan91(List<Course> list, double avg){
        return list.stream().allMatch(t-> t.getAverageScore()>avg);
    }

    // 2) Create a method to check if at least one of the course names contains "Turkish" word
    public static boolean checkAnyCourseNameContainsTurkish(List<Course> list){
        return list.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));
    }

    // 3) Create a method to print the course whose average score is the highest
    public static void courseHasHighestAvg(List<Course> list){
        Course result = list.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        System.out.println(result);
    }

    // 4) Sort the list elements according to the average score in ascending order and skip first 2 elements
    public static List<Course> sortAvgAscSkipFirstTwo(List<Course> list){
        return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }

    // 5) Sort the list elements according to the average score in ascending order and print just 3rd one
    public static List<Course> sortAvgAscGetThird(List<Course> list){
        return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).limit(1).collect(Collectors.toList());
    }

}
