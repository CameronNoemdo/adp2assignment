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
}
