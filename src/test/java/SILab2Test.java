import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;


public class SILab2Test {

    public List<String> generateUsers(){
        List<String> lista = new ArrayList<>();
        lista.add("user1");lista.add("user2");lista.add("user3");lista.add("user4");lista.add("Darko");
        return lista;
    }

    @Test
    public void test1() {
        List<String> userList = generateUsers();

        // Multiple Condition criteria
        // if ( user.getUsername()==null || user.getPassword()==null )

        User tester1 = new User("Darko","finki8generacija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester1,userList));
        try {
            User tester2 = new User(null, "finki8generacija", "darkoskerlevski@gmail.com");
            assertEquals(SILab2.function(tester2, userList), new RuntimeException("The user is missing some mandatory information"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
        User tester3 = new User("Darko",null,"darkoskerlevski@gmail.com");
        assertEquals(SILab2.function(tester3,userList),new RuntimeException("The user is missing some mandatory information"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // if ( !digit || !upper || !special )

        User tester4 = new User("Darko","finkiosmageneracija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester4,userList));
        User tester5 = new User("Darko","finki8generacija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester5,userList));
        User tester6 = new User("Darko","Finki8generacija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester6,userList));
        User tester7 = new User("Darko","Finki8generacij@","darkoskerlevski@gmail.com");
        assertTrue(SILab2.function(tester7,userList));


    }

    @Test
    public void test2(){
        List<String> userList = generateUsers();

        // Every path criteria

        try {
            assertEquals(SILab2.function(null, userList), new RuntimeException("The user is not instantiated"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            User tester8 = new User(null, "finki8generacija", "darkoskerlevski@gmail.com");
            assertEquals(SILab2.function(tester8, userList), new RuntimeException("The user is missing some mandatory information"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        User tester9 = new User("Darko","darkofinki","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester9,userList));
        User tester10 = new User("Darko","finki","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester10,userList));
        User tester11 = new User("Darko","finkiosmageneracija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester11,userList));
        User tester12 = new User("Darko","finki8generacija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester12,userList));
        User tester13 = new User("Darko","Finkiosmageneracija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester13,userList));
        User tester14 = new User("Darko","finkiosmageneracij@","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester14,userList));
        User tester15 = new User("Darko","Finki8generacija","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester15,userList));
        User tester16 = new User("Darko","finki8generacij@","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester16,userList));
        User tester17 = new User("Darko","Finkiosmageneracij@","darkoskerlevski@gmail.com");
        assertFalse(SILab2.function(tester17,userList));
        User tester18 = new User("Darko","Finki8generacij@","darkoskerlevski@gmail.com");
        assertTrue(SILab2.function(tester18,userList));
    }
}