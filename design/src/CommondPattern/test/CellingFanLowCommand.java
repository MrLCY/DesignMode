package CommondPattern.test;

import CommondPattern.Commond;

public class CellingFanLowCommand implements Commond {
    CellingFan cellingFan;
    int preSpeed;
    public CellingFanLowCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }
    @Override
    public void execute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.LOW();
    }

    @Override
    public void undo() {
        if(preSpeed == cellingFan.HIGH){
            cellingFan.HIGH();
        }if(preSpeed == cellingFan.MEDIUM){
            cellingFan.MEDIUM();
        }if(preSpeed == cellingFan.LOW){
            cellingFan.LOW();
        }if(preSpeed == cellingFan.OFF){
            cellingFan.OFF();
        }
    }
}
