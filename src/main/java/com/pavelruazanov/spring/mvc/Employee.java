package com.pavelruazanov.spring.mvc;



import com.pavelruazanov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Минимальная длина должна быть 2 символа")
    private String name;
//    @NotEmpty(message = "Это обязательное поле")
    @NotBlank(message = "Это обязательное поле")
    private String surname;

    @Min(value = 500, message = "Должна быть больше чем 499")
    @Max(value = 1500, message = "Должа быть меньше чем 1500")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;
    @CheckEmail
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Пожалуйста используйте шаблон ХХХ-ХХ-ХХ")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Recruter");
        departments.put("Salary", "Salary");

        carBrands = new HashMap<>();
        carBrands.put("BMV", "BMV");
        carBrands.put("Audi", "Audi");
        carBrands.put("MB", "MB");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FR");


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
