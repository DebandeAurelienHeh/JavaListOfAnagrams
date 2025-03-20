public class Main {
    public static void main(String[] args) {

        Anagrams anagramsChecker = new Anagrams();

        String[] anagramList = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(anagramsChecker.anagramsListChecker(anagramList));
    }
}
