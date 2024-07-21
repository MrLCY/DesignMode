package DecoratorPattern.defi;

import java.io.*;

public class TestDecoatorPattern1 {
    public static void main(String[] args) {
        House house = new Residiense();
        house= new Floor(house);
        house= new Floor(house);
        house= new Floor(house);
        house= new WallPain(house);
        System.out.println(house.getDesc()+house.cost());
//        BufferedInputStream;
//        FileInputStreamt
        try{
            InputStream inputStream= new FileInputStream("");
            inputStream = new BufferedInputStream(inputStream);
            LineNumberInputStream lin = new LineNumberInputStream(inputStream);
            ;
            inputStream.available();
            lin.available();
            inputStream.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
