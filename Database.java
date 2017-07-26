package lab4;

public class Database {

    public Database() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            System.out.println("It worked!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        } catch (IllegalAccessException ex) {
            System.out.println("Error: access problem while loading!");
            System.exit(2);
        } catch (InstantiationException ex) {
            System.out.println("Error: unable to instantiate driver!");
            System.exit(3);
        }
    }
}