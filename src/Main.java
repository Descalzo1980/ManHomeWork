public class Main {
    public static void main(String[] args) {
        String out = "��� ����, ��� 34 ����, ��� ���� 166.03. ���������� �����������";
//        System.out.println(out.length());
//        System.out.println(out);
//        String[] subStr;
//        String separator = " ";
//        subStr = out.split(separator);
//        for(int i = 0; i < subStr.length; i++) {
//            System.out.println(subStr[i]);
//        }
//        System.out.println(subStr);
        String name = out.substring(4,8);
        String ageString = out.substring(14,16);
        int age = Integer.parseInt(ageString);
        String post = out.substring(50,62);
        String heightString = out.substring(32,37);
        double height = Double.parseDouble(heightString);

        Man man = new Man(name,post,age,height);
        System.out.println(man.getName() + ""+ man.getPost() + " ������� " + man.getAge() + " ���� " + man.getHeight());
    }
}
