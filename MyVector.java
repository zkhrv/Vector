import java.util.Arrays;

public class MyVector<T>
{
    int size;
    int maxsize = 10;
    T[] array = (T[]) new Object[maxsize];

    public MyVector(){}

    //размер массива
    public MyVector(int maxsize)
    {
            this.maxsize = maxsize * 2 + 10;
                this.array = Arrays.copyOf(this.array, this.maxsize);
    }
    //конструктор копирования
    public MyVector(T array[], int size)
    {
        this.maxsize = array.length;
            this.size= size;
                this.array = Arrays.copyOf(array, this.maxsize);
    }
    //увеличение размера массива
    public void GrowthArray()
    {
        this.maxsize = maxsize * 2 + 10;
            array = Arrays.copyOf(array, this.maxsize);
    }
    //добавление элемента по индексу
    public void AddByIndex(int id, T data)
    {
        size++;
        if (size >= maxsize)
        {
            GrowthArray();
        }
        T[] tmp_array = (T[]) new Object[maxsize];
        if (id > 1 && id <= size)
        {
            T tmp1[] = Arrays.copyOfRange(array, 0, id-1);
                T problem = array[size-2];
                    tmp_array = Arrays.copyOf(tmp1, maxsize);
                        tmp_array[id-1] = data;

            for (int i = id; i < size; ++i)
            {
                tmp_array[i] = array[i - 1];
                    tmp_array[size-1]=problem;
            }
        }
        else if (id == 1)
        {
            tmp_array[0] = data;
            for (int i = 1; i < size; ++i)
            {
                tmp_array[i] = array[i - 1];
            }
        }
        else if (id > size)
        {
            if (id > maxsize)
            {
                do
                {
                    GrowthArray();
                }
                while (maxsize <= id);
                {
                    tmp_array = Arrays.copyOf(tmp_array, maxsize);
                    array = Arrays.copyOf(array, maxsize);
                    tmp_array = Arrays.copyOfRange(array, 0, id - 1);
                    tmp_array[id - 1] = data;
                }
            }
        }
        this.array = tmp_array;
    }
    //добавление элемента в конец массива
    public void AddToEnd(T data)
    {
        size++;
        if (size >= maxsize)
        {
            GrowthArray();
        }
        array[size-1] = data;
    }
    //удаление последнего элемента
    public void DelLast()
    {
        if (size != 0)
        {
            size--;
            array[size] = null;
        }
    }
    //удаление элемента по индексу
    public void DeleteByIndex(int id)
    {
        if (id == 1)
        {
            array = Arrays.copyOfRange(array, 1, size);
                size--;
        }
        else if (id > 1 && id < size)
        {
            T tmp1[] = Arrays.copyOfRange(array, 0, id-1);
                T tmp2[] = Arrays.copyOfRange(array, id, size+1);
                    array=Arrays.copyOf(tmp1, maxsize);

            for (int i = id-1,  j = 0; j<size-id; i++, j++)
            {
                array[i] = tmp2[j];
            }
            array[size-1]=null;
                size--;
        }
        else if (id == size)
        {
            array[id - 1] = null;
                size--;
        } else
            System.out.println("Вы ввели несуществующий индекс");
    }
    public void numb()
    {
        System.out.println("Длинна массива: " + maxsize);

        if (size != 0)
            System.out.println("Колличество элементов в массиве: " + size);
        else
            System.out.println("Колличество элементов в массиве: " + size);
    }
    public void print()
    {
        if (size != 0)
        {
            for (int i = 0; i < size; ++i)
            {
                System.out.print(array[i] + " -> ");

            }
            System.out.println("");
        }
        else
        {
            System.out.println("В массиве нет элементов");
        }
    }
    //очистка массива
    public void clear()
    {
        Arrays.fill(array, 0);
            size=0;
                System.out.println("Массив очищен");
    }
}
