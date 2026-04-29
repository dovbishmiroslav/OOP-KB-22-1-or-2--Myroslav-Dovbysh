import java.util.Arrays;

public class Sprint {
    private final int capacity;
    private final int maxTickets;

    private final Ticket[] tickets;
    private int size = 0;
    private int totalEstimate = 0;

    public Sprint(int capacity, int maxTickets) {
        this.capacity = capacity;
        this.maxTickets = maxTickets;
        this.tickets = new Ticket[maxTickets];
    }

    public boolean addUserStory(UserStory us) {
        return addTicket(us);
    }

    public boolean addBug(Bug bug) {
        return addTicket(bug);
    }

    private boolean addTicket(Ticket ticket) {
        if (ticket == null) return false;
        if (ticket.isCompleted()) return false;
        if (size >= maxTickets) return false;
        if (totalEstimate + ticket.getEstimate() > capacity) return false;

        tickets[size++] = ticket;
        totalEstimate += ticket.getEstimate();
        return true;
    }

    public Ticket[] getTickets() {
        return Arrays.copyOf(tickets, size);
    }

    public int getTotalEstimate() {
        return totalEstimate;
    }
}