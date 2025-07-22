public class string {
    public static void main(String[]args){
        String s ="hello world";
        System.out.println("Length:"+s.length());
        System.out.println("First char: " + s.charAt(0));
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Substring: " + s.substring(0, 5));
        System.out.println("Contains 'World'? " + s.contains("World"));
    }
    
}
