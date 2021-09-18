package tasksDayNo03.task02;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Adam Mickiewicz", "PL");
        Author author2 = new Author("Julian Tuwim","PL");
        Author author3 = new Author("King","US");

        Poem [] poemTable = new Poem [3];
        poemTable[0] = new Poem(author1,25);
        poemTable[1] = new Poem(author2,125);
        poemTable[2] = new Poem(author3,75);

        System.out.println(getSurnameWithMaxStrophyNumbers(poemTable));

    }

    private static String getSurnameWithMaxStrophyNumbers(Poem[] poemTable) {
        int maxStrophyNumber = 0;
        String author = null;
        for (Poem poem:poemTable)
        {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(maxStrophyNumber<poem.getStropheNumbers()) {
                maxStrophyNumber = poem.getStropheNumbers();
                author = poem.getCreator().getSurname();
            }
        }
        return author;
    }


}
