public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0 ; i < sentences.length; i++){
            String sentence = sentences[i];
            boolean found = false;


            for(int j= 0; j< keywords.length; j++){
                String bullshitword = keywords[j];

                for(int b = 0; b <= sentence.length() - bullshitword.length(); b++){
                    boolean match = true;

                
                    for (int l = 0; l < bullshitword.length(); l++) {
                    char c1 = sentence.charAt(b + l);
                    char c2 = bullshitword.charAt(l);

                    if (c1 >= 65 && c1 <= 90){
                        c1 = (char)(c1 + 32);
                    }
                    if (c2 >= 65 && c2 <= 90){
                        c2 = (char)(c2 + 32);
                    }

                    if (c1 != c2) {
                        match = false;
                        break;
                    }
                }     
                    if (match) {
                    found = true;
                    break;
                }
            }

                if (found) {
                System.out.println(sentence);
                break;
                }
        }
    }
}
}
