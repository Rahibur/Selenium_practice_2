package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
    @DataProvider(name = "invalidUserCredencial")
    public static Object invalidCridencials(){
        Object [][] data ={
                {"Rahibur","password", "Incorrect username or password entered. Please try again."},
                {"Username", "B450mPlus", "Incorrect username or password entered. Please try again."},
                {"Username", "password", "Incorrect username or password entered. Please try again."}

        };
        return data;
    }
}
