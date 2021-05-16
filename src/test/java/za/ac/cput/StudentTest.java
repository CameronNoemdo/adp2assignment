package za.ac.cput;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest
{
    @Test
    void testCollectionAdd()
    {
        int collectionSize=Student.collectionAdd().size();
        assertEquals(3, collectionSize, "Failed to add students to the collection.");
    }

    @Test
    void testCollectionRemove()
    {
        int collectionSize=Student.collectionRemove().size();
        assertEquals(2, collectionSize, "Failed to remove student from collection.");
    }

    @Test
    void testCollectionFind()
    {
        assertTrue(Student.collectionFind(),"Failed to find student in collection.");
    }

    @Test
    void testHashmapAdd()
    {
        int mapSize=Student.hashmapAdd().size();
        assertEquals(3,mapSize,"Failed to add student(s) to the map");
    }

    @Test
    void testHashmapRemove()
    {
        int mapSize=Student.hashmapRemove().size();
        assertEquals(2,mapSize,"Failed to remove student from map.");
    }

    @Test
    void testHashmapFind()
    {
        assertTrue(Student.hashmapFind(),"Failed to find student in map.");
    }

    @Test
    void testSetAdd()
    {
        int setSize=Student.hashsetAdd().size();
        assertEquals(3, setSize,"Failed to add student(s) to set.");
    }

    @Test
    void testSetRemove()
    {
        int setSize=Student.hashsetRemove().size();
        assertEquals(2, setSize,"Failed to remove student(s) from set.");
    }

    @Test
    void testSetFind()
    {
        assertTrue(Student.hashsetFind(),"Failed to find student in the set.");
    }
}
