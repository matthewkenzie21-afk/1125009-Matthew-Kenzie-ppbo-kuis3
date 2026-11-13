package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class DataView<T> {
    private List<T> records;

    public DataView() {
        records = new ArrayList<>();
    }

    public void printAll() {
        String[] fields = this.getFields();

        for (int i = 0; i < this.records.size(); i++) {
            T data = this.records.get(i);
            String[] values = this.convertModelToValues(data);

            System.out.print(i + ", ");

            for (int j = 0; j < fields.length; j++) {
                System.out.print(fields[j] + "=" + values[j] + ", ");
            }

            System.out.println();
        }
    }


    public void PrintByPk(String Primary key){

    }
 
    public void showInsertForm() {
        Scanner sc = new Scanner(System.in);

        String[] fields = this.getFields();
        String[] value = new String[fields.length]
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i] + ": ");
            value[i] = sc.nextLine();
        }
        T data this.convertModelToValues(values);
        this.records.add(data);
        System.out.println("Data berhasil di tambahkan.");
    }

    public void showUpdateForm() {

    }

    public void promptDelete() {

    }

    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValuesToModel(String[] values);
    protected abstract String[] convertModelToValues(T data);
};


