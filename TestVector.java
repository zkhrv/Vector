public class TestVector
{
    public static void main (String[] args)
    {

        MyVector<Data> data = new MyVector();

        Data n1 = new Data( 2, "Red");
        Data n2 = new Data( 3, "Blue");
        Data n3 = new Data( 7, "Black");
        Data n4 = new Data( 8, "White");
        Data n5 = new Data( 11, "Yellow");

        data.AddToEnd(n1);
        data.AddToEnd(n2);
        data.AddToEnd(n3);
        data.AddToEnd(n4);
        data.AddToEnd(n5);
        data.print();
        data.numb();

        System.out.println(" ");
        System.out.println("Удаляем последний элемент");
        data.DelLast();
        data.print();
        data.numb();

        System.out.println(" ");
        System.out.println("Удаляем по индексу 2");
        data.DeleteByIndex(2);
        data.print();
        data.numb();

        System.out.println(" ");
        System.out.println("Добавляем по индексу 1");
        data.AddByIndex(1, n5 );
        data.print();
        data.numb();

        System.out.println("");
        System.out.println("Изменение размера массива");
        data.numb();
        data.GrowthArray();
        data.numb();

        System.out.println("");
        System.out.println("Копирование");
        data.print();
        MyVector mas_copy = new MyVector(data.array, data.size);
        mas_copy.print();
        mas_copy.numb();

        System.out.println("");
        System.out.println("Очистка массива");
        data.clear();
        data.numb();
    }
}
