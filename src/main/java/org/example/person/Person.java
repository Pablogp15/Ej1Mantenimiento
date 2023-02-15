package org.example.person;

import java.util.List;

public class Person {
    private final String name;
    private final int age;
    private final String gender; //Male, Female

    public Person(String name, int age, String gender) {
        this.name = name;
        if(age >= 0){
            this.age = age;
        }else{
            throw new RuntimeException("The number is negative");
        }
        if(gender == "Male" || gender == "Female"){
            this.gender = gender;
        }else{
            throw new RuntimeException("Incorrect gender");
        }

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    public static double[] averageAgePerGender(List<Person> persons){
        int edadHombres = 0;
        int edadMujeres = 0;
        int numeroHombres = 0;
        int numeroMujeres = 0;
        double averageAgeMujer = 0;
        double averageAgeHombre = 0;

        for (Person actual : persons) {
            if(actual.gender.equals("Male")){
                numeroHombres++;
                edadHombres += actual.age;
            } else{
                numeroMujeres++;
                edadMujeres += actual.age;
            }
        }
        if(numeroHombres == 0){
             averageAgeHombre = 0;
        }else {
             averageAgeHombre = (double) edadHombres / numeroHombres;
        }

        if(numeroMujeres == 0){
             averageAgeMujer = 0;
        }else{
             averageAgeMujer =  (double) edadMujeres / numeroMujeres;
        }

        double[] averageAge = {averageAgeHombre, averageAgeMujer};

        return averageAge;
    }
}
