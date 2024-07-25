package CommondPattern.test;

import CommondPattern.Commond;
import CommondPattern.SimpleControlWithUndo;

import java.rmi.Remote;

public class TestCellingFan {
    public static void main(String[] args) {
        SimpleControlWithUndo simpleControlWithUndo = new SimpleControlWithUndo();
        CellingFan cellingFan = new CellingFan("卧室风扇");
        Commond   cellingFanHigh = new CellingFanHighCommand(cellingFan);
        Commond cellingFanLow = new CellingFanLowCommand(cellingFan);
        Commond cellingFanOFF = new CellingFanOFFCommand(cellingFan);
        simpleControlWithUndo.setCommond(0,cellingFanHigh,cellingFanOFF);
        simpleControlWithUndo.setCommond(1,cellingFanLow,cellingFanOFF);
        System.out.println(cellingFan.getSpeed());
        simpleControlWithUndo.onCommondPush(0);
        System.out.println(cellingFan.getSpeed());
        simpleControlWithUndo.onCommondPush(1);System.out.println(cellingFan.getSpeed());

        simpleControlWithUndo.setUndocommond();
        System.out.println(cellingFan.getSpeed());
        simpleControlWithUndo.setUndocommond();
        System.out.println(cellingFan.getSpeed());
        simpleControlWithUndo.setUndocommond();
        System.out.println(cellingFan.getSpeed());
    }
}
