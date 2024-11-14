package MagicArray.Magic;

public class homeArrayAppTeacher17 {
    public static void main(String[] args) {

        homeMagicArrayTeacher17 magic = new homeMagicArrayTeacher17();

        magic.addAll(10, 20, 30, 40, 50);

        System.out.println(magic.toString());

        //Нельзя выдавать get/set для полей нашего класса.
        // У нас другие методы для изменения состояния этих полей
//        int cursor = magic.getCursor();
//        cursor = 1000;
//
//        magic.setCursor(20);

//        int[] arrayCopy = magic.getArray();
//        arrayCopy[3] = 5000;
//
//        int[]arr = {1, 2, 3};
//        magic.setArray(arr);

        magic.add(60);
        magic.addAll(20, 200);

        System.out.println(magic.toString());

        System.out.println("magic.indexOf(20): " +  magic.indexOf(20));
        System.out.println("magic.lastIndexOf(20): " + magic.lastIndexOf(20));

        int[] array = magic.toArray();
        System.out.println(array.length);
        //System.out.println(Arrays.toString(array));
        // эта последняя переменная светится красным



    }



}
