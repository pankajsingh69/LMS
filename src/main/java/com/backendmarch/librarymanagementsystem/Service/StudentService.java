package com.backendmarch.librarymanagementsystem.Service;

import com.backendmarch.librarymanagementsystem.Entity.LibraryCard;
import com.backendmarch.librarymanagementsystem.Entity.Student;
import com.backendmarch.librarymanagementsystem.Enums.CardStatus;
import com.backendmarch.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){
        LibraryCard card = new LibraryCard();
        card.setStatus(CardStatus.ACTIVATED);
        card.setValidTill("25/12/2025");
        card.setStudent(student);
        student.setCard(card);

        studentRepository.save(student);
    }
}
