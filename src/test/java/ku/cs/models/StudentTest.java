package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    //Student s1;
    //void init(){s1 = new Student("61012412","aaa");}
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
       Student s1 = new Student("6xxxxxxxx", "StudentTest");
        s1.addScore(45.15);
        assertEquals(45.15, s1.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s1 = new Student("6xxxxxxxxx", "StudentTest");
        s1.addScore(85);
        assertEquals("A", s1.grade());
    }
    @Test
    @DisplayName("IsID")
    void testGetID()
    {
        Student s1 = new Student("6xxxxxxxxx", "StudentTest");
        assertTrue(s1.isId("6xxxxxxxxx"));
    }
    @Test
    @DisplayName("ChangeName")
    void testChangeName()
    {
        Student s1 = new Student("6xxxxxxxxx", "StudentTest");
        s1.changeName("Student");
        assertEquals("Student", s1.getName());
    }
}