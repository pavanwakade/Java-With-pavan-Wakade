package PavanCorejavaPractice;
 class RemoveCharacter
 {
    public static void main(String[] args) 
    {
        String inputString = " Hello, World!";
        char charToRemove = 'o';

        int index = inputString.indexOf(charToRemove);
        if (index != -1) {
            String resultString = inputString.substring(0, index) + inputString.substring(index + 1);
            System.out.println("Original string: " + inputString);
            System.out.println("String after removing first occurrence of '" + charToRemove + "': " + resultString);
        } else {
            System.out.println("Character '" + charToRemove + "' not found in the string.");
        }
    }
}
