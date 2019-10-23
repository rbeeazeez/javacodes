public class RobiatAccount {

    public static void main (String[] args){

        WallArea wall = new WallArea (5,4);
        System.out.println ("area = " + wall.getArea ());
        wall.setHeight (-1.5);
        System.out.println ("width = " + wall.getWidth ());
        System.out.println ("height = " + wall.getHeight ());
        System.out.println ("area = " + wall.getArea ());


        Banking myAccount = new Banking ("216574", 0.00, "Azeez Robiat",
                "rbeeazeez@gmail", "081298931100");
        myAccount.withdrawal (200.00);
        myAccount.deposit (100);
        myAccount.withdrawal (50.00);
        myAccount.withdrawal (20.00);


        VipCustomer customer1 = new VipCustomer ();
        System.out.println (customer1.getName ());
        VipCustomer customer2 = new VipCustomer ("Robiat", 5000.00);
        System.out.println (customer2.getName ());
        VipCustomer customer3 = new VipCustomer ("Robiat", 3000, "rbee@gmail");
        System.out.println (customer3.getName ());
    }
}
