public class Lab3Test {
    public static void main(String[] args) {

        UserStory us1 = new UserStory(1, "Реєстрація", 5, null);
        UserStory us2 = new UserStory(2, "Логін", 3, new UserStory[]{us1});

        us1.complete();
        us2.complete();

        Bug bug = Bug.createBug(1, "Фікс пароля", 2, us2);

        Sprint sprint = new Sprint(10, 5);

        sprint.addUserStory(us1);
        sprint.addUserStory(us2);
        sprint.addBug(bug);

        for (Ticket t : sprint.getTickets()) {
            System.out.println(t);
        }

        System.out.println("Total estimate: " + sprint.getTotalEstimate());
    }
}