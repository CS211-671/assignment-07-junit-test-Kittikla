package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {


    @Test
    @DisplayName("AddNewStudent")
    void testAddNewStudent()
    {
        StudentList list = new StudentList();
        list.addNewStudent("6162341234", "Doe");
        assertEquals(1, list.getStudents().size());
    }

    @Test
    @DisplayName("FindStudentbyID")
    void findStudentById()
    {
        StudentList list = new StudentList();
        list.addNewStudent("6162341234", "Doe");
        assertEquals("6162341234",list.findStudentById("6162341234").getId());
    }

    @Test
    void giveScoreToId()
    {
        StudentList list = new StudentList();
        list.addNewStudent("6162341234", "Doe");
        list.giveScoreToId("6162341234",2.3);
        assertEquals(2.3,list.findStudentById("6162341234").getScore());
    }

    @Test
    void viewGradeOfId()
    {
        StudentList list = new StudentList();
        list.addNewStudent("6162341234", "Doe");
        list.giveScoreToId("6162341234",80);
        assertEquals("A",list.viewGradeOfId("6162341234"));
    }

}