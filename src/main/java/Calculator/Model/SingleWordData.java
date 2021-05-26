package Calculator.Model;

import java.util.Set;

public class SingleWordData implements Comparable<SingleWordData> {

    private final Set<Character> matchingChars;
    private final int lengthOfWord;
    private final int matchingOccurrencesNumber;

    public SingleWordData(Builder builder){
        this.matchingChars = builder.matchingChars;
        this.lengthOfWord = builder.lengthOfWord;
        this.matchingOccurrencesNumber = builder.matchingOccurrencesNumber;
    }

    public Set<Character> getMatchingChars() {

        return matchingChars;
    }

    public int getLengthOfWord() {
        return lengthOfWord;
    }

    public int getMatchingOccurrencesNumber() {
        return matchingOccurrencesNumber;
    }

    public static class Builder{
        private Set<Character> matchingChars;
        private int lengthOfWord;
        private int matchingOccurrencesNumber;

        public Builder matchingChars(final Set<Character> matchingChars){
            this.matchingChars = matchingChars;
            return this;
        }
        public Builder lengthOfWords(final int lengthOfWord){
            this.lengthOfWord = lengthOfWord;
            return this;
        }
        public Builder matchingOccurrencesNumber(final int matchingOccurrencesNumber){
            this.matchingOccurrencesNumber = matchingOccurrencesNumber;
            return this;
        }

        public SingleWordData build(){
            return new SingleWordData(this);
        }
    }

    @Override
    public int compareTo(SingleWordData o) {
        return this.lengthOfWord - o.getLengthOfWord();
    }

    @Override
    public String toString() {
        return "SingleWordInput{" +
                "matchingChars=" + matchingChars +
                ", lengthOfWord=" + lengthOfWord +
                ", matchingOccurrencesNumber=" + matchingOccurrencesNumber +
                '}';
    }
}
