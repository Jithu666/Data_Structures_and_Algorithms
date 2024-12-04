public class deleteFirstAndLastOccurence {
    public static void main(String[] args) {
        String name = "madam";
        int target = 1;
        String ans = deleteOccurence(name,target);
        System.out.println(ans);
    }
    public static String deleteOccurence(String name, int target){

        char ch = name.charAt(target);

        int firstOccurence = name.indexOf(ch);
        int lastOccurence = name.lastIndexOf(ch);

        if(lastOccurence != firstOccurence){
            name = name.substring(0, lastOccurence) + name.substring(lastOccurence + 1);
        }

        name = name.substring(0, firstOccurence) + name.substring(firstOccurence + 1);

        return name;
    }

}
