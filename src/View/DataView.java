package View;

import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T> {
    private List<T> records;

    public DataView() {
        records = new ArrayList<>();

    }
    public void printAll() {
        String[] getFields = this.getFields();

            String[] values = this.convertModel1ToValues(records);
            System.out.println(i + ", ");
            for (int j = 0, j < fields.length; j++) {
                System.out.println(...); // print field = value  dan spasi 
            }
            System.out.println();
    }

    public void PrintByPk(String Primary key){

    }
    public void showInsertForm() {

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


