public class StringEg {
    public static void main(String[] args) {
        String name = "Vishal";
        name = name + " Boine";

        System.out.println(name);
        name = name.concat(" Hello");
        System.out.println(name);

        StringBuffer sb = new StringBuffer("Vishal");
        sb.append(" Boine");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.insert(0 , "Java ");
        System.out.println(sb);
    }
}
