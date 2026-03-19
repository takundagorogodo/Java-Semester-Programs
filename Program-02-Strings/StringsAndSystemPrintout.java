class StringsAndSystemPrintout {
      public static void main(String[] args){
        char letterh = 'H';
        String sentence;
        String country = "republic of Zimbabwe";
        String uppercase = country.toUpperCase();
        int index = country.indexOf("i");
        sentence = "This is a sentence you should read ";

        System.out.println(letterh+" "+ index + " "+ sentence +" "+ uppercase);
        System.out.println("henry said \"he was angry\"");
      }
}