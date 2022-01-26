package org.Chuprova.Homework5;

public class Employee {

    String fio;
    String position;
    String email;
    String number;
    float salary;
    int age;

    public Employee(String _fio, String _position, String _email, String _number, float _salary, int _age)
    {
        fio = _fio;
        position = _position;
        email = _email;
        number = _number;
        salary = _salary;
        age = _age;
    }

    public void main(String[] args)
    {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan", "Boss", "ivivan@mailbox.com", "89231231257", 30000, 30);
        employee[1] = new Employee("Petrov Petr", "Engineer", "petr@mailbox.com", "89768948595", 50000, 55);
        employee[2] = new Employee("Galich Ludmila", "Buhgalter", "LudGal@mailbox.com", "89574847543", 60000, 36);
        employee[3] = new Employee("Pupkin Vladislav", "Cleaner", "Vladislav@mailbox.com", "89578395748", 30000, 59);
        employee[4] = new Employee("Belov Arkadiy", "Builder", "ArkadiyB@mailbox.com", "89574896752", 80000, 37);
        PrintInformation40(employee);
    }

    public void PrintInformation40(Employee[] employee)
    {
        for(int i = 0; i < 5; i++)
        {
            if(employee[i].age > 40)
            {
                System.out.println("ФИО: " + employee[i].fio);
                System.out.println("Должность: " + employee[i].position);
                System.out.println("Email: " + employee[i].email);
                System.out.println("Телефон: " + employee[i].number);
                System.out.println("Зарплата: " + employee[i].salary);
                System.out.println("Возраст: " + employee[i].age);
            }
        }
    }

}
