package CommondPattern.test;

import CommondPattern.Commond;

public class CellingFanOFFCommand implements Commond {
    CellingFan cellingFan;
    int preSpeed;
    public CellingFanOFFCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }
    @Override
    public void execute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.OFF();
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
